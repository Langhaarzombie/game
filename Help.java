 

/**
 * class to see all the commands/cases that the user can type in
 * @author Michael Bartl
 *
 */

public class Help 
{

    /**
     * used to see all the commands that the user can use.
     * certain commands take the user to another method
     */
    public static void printhelps(View view)
    {
    	view.addText("info - get information about your village\n" +
    				 " r - resources\n" +
    				 " build - create a building\n" +
                	 " goto - go to a certain building\n" +
                	 " exit - close program\n\n");
    }

    /**
     * see all the commands for the things the user can build
     */
    public static void build(View view)
    {
        view.addText("\nWhat do you want to build?\n\n buildcottage\n buildforester\n buildforge\n buildclaypit\n buildschool\n buildcastle\n buildbarracks\n");  
    }
    // maybe not needed
    /**
     * see where the user can go to
     */
    public static void goTo(View view)
    {
        view.addText("Where do you want to go to?\n\n gotocottage\n gotoforester\n gotoforge\n gotoclaypit\n buildschool\ngotocastle\n buildbarracks\n");
    }
}
