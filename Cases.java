package game;

import java.util.Scanner;

/**
 * class where all the cases are stored.
 * from here the user is redirected to other classes and methods
 * @author Michael Bartl
 *
 */
public class Cases {


	private CasePrintouts input;
	private Help help;

	private boolean end=false;

	public Cases()
	{
		help=new Help();
		input=new CasePrintouts();
		Scanner sc=new Scanner (System.in);
		boolean goOn=false; //for a loop that continues until user made an input

		System.out.println ("Welcome to Texitscha! A game about nothing...\n" + 
							"Created by Max, Michael and Jonas\n" +
							"Please press any character to continue");
		System.out.println();

		String anykey=sc.next();

		while (goOn!=true)
		{
			if (anykey != "") 
				{
					goOn=true;
					System.out.println("Now type help to see which commands there are.");
				}
		} //while

		cases(); //call next method to make an input
		sc.close(); //closes scanner
	}

	public void cases()
	{

		Scanner in = new Scanner (System.in);

		while (end!=true) //loop until user types "exit"
		{
			System.out.println();
			String choice = in.next();

			switch (choice)
			{
				case "help": help.printhelps(); break;
				case "d": input.getDate(); break;
				case "date": input.getDate(); break;
				case "build": help.build(); break;
				case "buildhouse": input.buildHouse(); break;
				case "buildforester": input.buildForesterHouse(); break;
				case "buildmine": input.buildMine(); break;
				case "buildforge": input.buildForge(); break;
				case "buildclaypit": input.buildClayPit(); break;
				case "buildschool": input.buildSchool(); break;
				case "buildchapel": input.buildChapel(); break;
				case "buildcastle": input.buildCastle(); break;
				case "r": input.resources(); break;
				case "resources": input.resources(); break;
				case "goto": help.goTo(); break;
				case "gotohouse": input.goToHouse(); break;
				case "gotoforester": input.goToForesterHouse(); break;
				case "gotomine": input.goToMine(); break;
				case "gotoforge": input.goToForge(); break;
				case "gotoclaypit": input.goToClayPit(); break;
				case "gotocastle": input.goToCastle(); break;
				case "exit": end=true; input.exit(); break;
				case "buildings": input.buildings(); break;
				case "xd": System.out.println("This is not funny!"); break;
				case "lol": System.out.println("This is not funny!"); break;
				case "xD": System.out.println("This is not funny!"); break;
				case "learn": help.learn(); break;
				case "learnforester": input.learnforester(); break;
				case "learnminer": input.learnminer(); break;
				case "learnforge": input.learnforge(); break;
				case "learnpotter": input.learnpotter(); break;
				case "electking": input.electking(); break;
				case "clear": input.clear(); break;
				case "creedits": input.credits(); break;
				default: System.out.println(choice + " is not a command"); break;
			}//switch
		}//while

		in.close(); //close scanner
	}//method
}
