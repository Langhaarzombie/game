
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
        User.cottage.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getSpecial1(), User.castle.getPlusGold());
    }

    public static void buildForesterHouse()
    {
        User.forester.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getSpecial1(), User.castle.getPlusGold());
    }

    public static void buildForge()
    {
        User.forge.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getSpecial1(), User.castle.getPlusGold());
    }

    public static void buildClayPit()
    {
        User.clayPit.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getSpecial1(), User.castle.getPlusGold());
    }

    public static void buildSchool()
    {
        User.school.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getSpecial1(), User.castle.getPlusGold());
    }

    public static void buildCastle()
    {
        User.castle.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getSpecial1(), User.castle.getPlusGold());
    }
    
    public static void buildBarracks()
    {
        User.barracks.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getSpecial1(), User.castle.getPlusGold());
    }

    public static void resources()
    {
        System.err.println("Wood:\t"+User.materials[0]+"\nClay:\t"+User.materials[1]+"\nIron:\t"+User.materials[2]+"\nGold:\t"+User.materials[3]+"\nPeople:\t"+User.materials[4]+"\n");
    }

    // go to
    public static void goToCottage()
    {
        System.out.println("Information about cottage:");
        User.cottage.getInfo();
    }

    public static void goToForesterHouse()
    {
        System.out.println("Information about forester:");
        User.forester.getInfo();
    }

    public static void goToForge()
    {
        System.out.println("Information about forge:");
        User.forge.getInfo();
    }

    public static void goToClayPit()
    {
        System.out.println("Information about clay pit:");
        User.clayPit.getInfo();
    }

    public static void goToCastle()
    {
        System.out.println("Information about castle:");
        User.castle.getInfo();
    }
    
    public static void goToSchool()
    {
        System.out.println("Information about school:");
        User.school.getInfo();
    }
    
    public static void goToBarracks()
    {
        System.out.println("Information about barracks:");
        User.barracks.getInfo();
    }
    
    // else
    public static void exit()
    {
        System.out.println("You exited the program. See you later alligator!");
    }

    public static void buildings()
    {
        System.out.println("Forester:\t"+User.forester.getAmount()+"\nClay Pit:\t"+User.clayPit.getAmount()+"\nForge:\t\t"+User.forge.getAmount()+"\nCottage:\t"+User.cottage.getAmount()+"\nCastle:\tLevel\t"+User.castle.getAmount()+"\nSchool:\tLevel\t"+User.school.getAmount()+"\nBarracks:\tLevel\t"+User.barracks.getAmount());
    }

    // electking() actually not needed ... but still nice idea
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
