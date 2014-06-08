
import java.util.*;

/**
 * the user is taken to this class if he types any command that has nothing to do with Help
 * @author Michael Bartl
 *
 */
public class CasePrintouts
{    

    public static void getDate()
    {
        Date date =new Date();
        System.err.println (date);
    }

    //building something
    public static void buildCottage()
    {
        User.buildings[3].newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.buildings[5].getSpecial1(), User.buildings[4].getPlusGold());
    }

    public static void buildForesterHouse()
    {
        User.buildings[0].newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.buildings[5].getSpecial1(), User.buildings[4].getPlusGold());
    }

    public static void buildForge()
    {
        User.buildings[2].newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.buildings[5].getSpecial1(), User.buildings[4].getPlusGold());
    }

    public static void buildClayPit()
    {
        User.buildings[1].newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.buildings[5].getSpecial1(), User.buildings[4].getPlusGold());
    }

    public static void buildSchool()
    {
        User.buildings[5].newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.buildings[5].getSpecial1(), User.buildings[4].getPlusGold());
    }

    public static void buildCastle()
    {
        User.buildings[4].newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.buildings[5].getSpecial1(), User.buildings[4].getPlusGold());
    }
    
    public static void buildBarracks()
    {
        User.buildings[6].newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.buildings[5].getSpecial1(), User.buildings[4].getPlusGold());
    }

    public static void resources()
    {
        System.err.println("Wood:\t"+User.materials[0]+"\nClay:\t"+User.materials[1]+"\nIron:\t"+User.materials[2]+"\nGold:\t"+User.materials[3]+"\nPeople:\t"+User.materials[4]+"\n");
    }

    // go to
    public static void goToCottage()
    {
        System.out.println("Information about cottage:");
        User.buildings[3].getInfo();
    }

    public static void goToForesterHouse()
    {
        System.out.println("Information about forester:");
        User.buildings[0].getInfo();
    }

    public static void goToForge()
    {
        System.out.println("Information about forge:");
        User.buildings[2].getInfo();
    }

    public static void goToClayPit()
    {
        System.out.println("Information about clay pit:");
        User.buildings[1].getInfo();
    }

    public static void goToCastle()
    {
        System.out.println("Information about castle:");
        User.buildings[4].getInfo();
    }
    
    public static void goToSchool()
    {
        System.out.println("Information about school:");
        User.buildings[5].getInfo();
    }
    
    public static void goToBarracks()
    {
        System.out.println("Information about barracks:");
        User.buildings[6].getInfo();
    }
    
    // else
    public static void exit()
    {
        System.out.println("You exited the program. See you later alligator!");
    }

    public static void buildings()
    {
        System.out.println("Forester:\t"+User.buildings[0].getAmount()+"\nClay Pit:\t"+User.buildings[1].getAmount()+"\nForge:\t\t"+User.buildings[2].getAmount()+"\nCottage:\t"+User.buildings[3].getAmount()+"\nCastle:\tLevel\t"+User.buildings[4].getAmount()+"\nSchool:\tLevel\t"+User.buildings[5].getAmount()+"\nBarracks:\tLevel\t"+User.buildings[6].getAmount());
    }

    // electking() actually not needed ... buildCastle is the same
    public static void electking()
    {
        //check resources       
        Scanner scanking = new Scanner (System.in);
        System.out.println(" Are you sure you want to elect a... as the new king? y/n \n");
        char choice=scanking.next().toCharArray()[0];

        switch (choice)
        {
            case 'y': System.out.println(" The citizens celebrate the new king!"); break;
            case 'n': System.out.println(" The king wasn´t elected."); break;
            default: System.out.println(" Please make a decision!"); break;
        }
        //or
        System.out.println("You don´t have enough resources.");
    }

    public static void clear()
    {
        System.out.println("Your savegame will now be deleted.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Just kidding ;)");
    }
}
