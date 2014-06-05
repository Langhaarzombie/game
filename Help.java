package game;

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
	public void printhelps()
	{
		System.out.println(" d - get date\n" +
						   " build - make a building\n" +
						   " r - resources\n" +
						   " goto - go to a certain building\n" +
						   " learn - learn a citizen a job\n" +
						   " exit - close program\n");
		// generate the buildings
		
//..........................








	}

	/**
	 * see all the commands for the things the user can build
	 */
	public void build()
	{
		System.out.println("What do you want to build?\n\n buildhouse\n buildforester\n buildmine\n buildforge\n build claypit\n buildschool\n buildchapel\n buildchapel\n buildcastle\n");  
	}

	/**
	 * see where the user can go to
	 */
	public void goTo()
	{
		System.out.println("Where do you want to go to?\n\n gotohouse\n gotoforester\n gotomine\n gotoforge\n gotoclaypit\n gotochapel\n gotocastle\n");
	}

	/**
	 * see the things you can learn
	 */
	public void learn()
	{
		System.out.print("What do you want to learn to a citizen?\n\n learnforester\n learnminer\n learnforge\n learnpotter\n electking\n");
	}
}
