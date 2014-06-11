
/**
 * This is the main class where all important variables are saved: Materials, Buildings, ...
 * Materials: wood, clay, iron, gold, people
 */
import java.util.*;
import java.io.*;
public class User
{    
    public static Buildings[] buildings;
    public static int[] materials;
    private Generating generate;

	public User()
	{
		Scanner sc=new Scanner (System.in);
		new Generating(this.buildings);
		materials=new int[5];
		for(int i=0;i<materials.length;i++){
		    materials[i]=20;
		  }
		
		boolean goOn=false; //for a loop that continues until user made an input

		System.out.println ("Welcome to Texitscha! A game about nothing...\n" + 
							"Created by Max, Michael and Jonas\n" +
							"Please press any character to continue");
		System.out.println();


		while (!goOn)
		{

		String anykey=sc.next();


			if (anykey != "") 
				{
					goOn=true;
					System.out.println("Now type help to see which commands there are.");
				}
		} //while

		Cases.cases(); //call next method to make an input
		sc.close(); //closes scanner
	}
}
