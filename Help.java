 

/**
 * class to see all the commands/cases that the user can type in
 * @author Michael Bartl
 *
 */

public class Help {

    /**
     * used to see all the commands that the user can use.
     * certain commands take the user to another method
     */
    public static void printhelps()
    {
        System.out.println(" d - get date\n" +
                           " build - make a building\n" +
                           " r - resources\n" +
                           " goto - go to a certain building\n" +
                           " info - get information about your village\n" +
                           " exit - close program\n");
    }

    /**
     * see all the commands for the things the user can build
     */
    public static void build()
    {
        System.out.println("What do you want to build?\n\n buildcottage\n buildforester\n\n buildforge\n build claypit\n buildschool\n buildcastle\n buildbarracks\n");  
    }
    // maybe not needed
    /**
     * see where the user can go to
     */
    public static void goTo()
    {
        System.out.println("Where do you want to go to?\n\n gotocottage\n gotoforester\n \n gotoforge\n gotoclaypit\n buildschool\ngotocastle\n buildbarracks\n");
    }
}
