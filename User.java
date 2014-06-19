
/**
 * This is the main class where all important variables are saved: Materials, Buildings, ...
 * Materials: wood, clay, iron, gold, people
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.io.*;
public class User
{    
    public static Forester forester;
    public static ClayPit clayPit;
    public static Forge forge;
    public static School school;
    public static Castle castle;
    public static Cottage cottage;
    public static Barracks barracks;
    
    public static int[] materials;
    private Generating generate;
    public View view;
    private boolean goOn=false;
    public LogBookEntries lbe;

	public User()
	{
		view= new View(this);
		new Generating(view, this.forester, this. clayPit, this.forge, this.school, this.castle,this.cottage, this.barracks);
		materials=new int[5];
		this.lbe=new LogBookEntries();
		new MyKeyListener(this);
		for(int i=0;i<materials.length;i++)
		{
		    materials[i]=20;
		}

		/*view.addText("Welcome to Texitscha! A text-adventure game.\n" + 
					   "Created by Max, Michael and Jonas\n" +
		view.addText("Please press any character to start the game.\n\n");*/
		lbe.firstEntry(this.view);
		Cases.cases(view);
	}

	public void keyEvent(KeyEvent e)
	{
		/*if(!goOn)
		{
			goOn=true;
			//view.addText("Now type help to see which commands there are.");
			//lbe.firstEntry(this.view);
		}*/

		if(e.getKeyCode()==10)
		{
			Cases.cases(view); //call next method to make an input
		}
	}
}
