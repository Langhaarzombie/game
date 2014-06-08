
import java.util.Scanner;
/**
 * class where all the cases are stored.
 * from here the user is redirected to other classes and methods
 * @author Michael Bartl
 *
 */
public class Cases {
    public static void cases()
    {
        boolean end=false;
        Scanner in = new Scanner (System.in);

        while (!end) //loop until user types "exit"
        {
            System.out.println();
            String choice = in.next();

            switch (choice)
            {
                case "help": Help.printhelps(); break;
                case "d": CasePrintouts.getDate(); break;
                case "date": CasePrintouts.getDate(); break;
                case "build": Help.build(); break;
                case "buildcottage": CasePrintouts.buildCottage(); break;
                case "buildforester": CasePrintouts.buildForesterHouse(); break;
                case "buildforge": CasePrintouts.buildForge(); break;
                case "buildclaypit": CasePrintouts.buildClayPit(); break;
                case "buildschool": CasePrintouts.buildSchool(); break;
                case "buildcastle": CasePrintouts.buildCastle(); break;
                case "buildbarracks": CasePrintouts.buildBarracks(); break;
                case "r": CasePrintouts.resources(); break;
                case "resources": CasePrintouts.resources(); break;
                case "goto": Help.goTo(); break;
                case "gotocottage": CasePrintouts.goToCottage(); break;
                case "gotoforester": CasePrintouts.goToForesterHouse(); break;
                case "gotoforge": CasePrintouts.goToForge(); break;
                case "gotoclaypit": CasePrintouts.goToClayPit(); break;
                case "gotocastle": CasePrintouts.goToCastle(); break;
                case "gotoschool": CasePrintouts.goToSchool(); break;
                case "gotobarracks": CasePrintouts.goToBarracks(); break;
                case "exit": end=true; CasePrintouts.exit(); break;
                case "info": CasePrintouts.buildings(); break;
                case "xd": System.out.println("This is not funny!"); break;
                case "lol": System.out.println("This is not funny!"); break;
                case "xD": System.out.println("This is not funny!"); break;
                case "electking": CasePrintouts.electking(); break;
                case "clear": CasePrintouts.clear(); break;
                default: System.out.println(choice + " is not a command"); break;
            }//switch
        }//while

        in.close(); //close scanner
    }//method
}
