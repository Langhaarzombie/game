
/**
 * the user is taken to this class if he types any command that has nothing to do with Help
 * @author Michael Bartl
 *
 */

public class CasePrintouts
{    

    //building something
    public static void buildCottage(View view)
    {
        try{
            view.setCursorWaiting();
            User.cottage.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCurorDefault();
        }
    }

    public static void buildForesterHouse(View view)
    {
        try{
            view.setCursorWaiting();
            User.forester.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCurorDefault();
        }
    }

    public static void buildForge(View view)
    {
        try{
            view.setCursorWaiting();
            User.forge.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCurorDefault();
        }
    }

    public static void buildClayPit(View view)
    {
        try{
            view.setCursorWaiting();
            User.clayPit.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCurorDefault();
        }
    }

    public static void buildSchool(View view)
    {
        try{
            view.setCursorWaiting();
            User.school.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4]);
        }finally{
            view.setCurorDefault();
        }
    }

    public static void buildCastle(View view)
    {
        try{
            view.setCursorWaiting();
            User.castle.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator());
        }finally{
            view.setCurorDefault();
        }
    }

    public static void buildBarracks(View view)
    {
        try{
            view.setCursorWaiting();
            User.barracks.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator());
        }finally{
            view.setCurorDefault();
        }
    }

    public static void resources(View view)
    {
        view.addText("Resources:\n\nWood:\t"+User.materials[0]+"\nClay:\t"+User.materials[1]+"\nIron:\t"+User.materials[2]+"\nGold:\t"+User.materials[3]+"\nPeople:\t"+User.materials[4]+"\n\n");
    }

    // go to
    public static void goToCottage(View view)
    {
        view.addText("Information about cottage:\n");
        User.cottage.getInfo();
    }

    public static void goToForesterHouse(View view)
    {
        view.addText("Information about forester:\n");
        User.forester.getInfo();
    }

    public static void goToForge(View view)
    {
        view.addText("Information about forge:\n");
        User.forge.getInfo();
    }

    public static void goToClayPit(View view)
    {
        view.addText("Information about clay pit:\n");
        User.clayPit.getInfo();
    }

    public static void goToCastle(View view)
    {
        view.addText("Information about castle:\n");
        User.castle.getInfo();
    }

    public static void goToSchool(View view)
    {
        view.addText("Information about school:\n");
        User.school.getInfo();
    }

    public static void goToBarracks(View view)
    {
        view.addText("Information about barracks:\n");
        User.barracks.getInfo();
    }

    // else
    public static void exit(View view)
    {
        view.addText("You exited the program. See you later!");
    }

    public static void info(View view)
    {
        view.addText("Info:\n\nForester:\t"+User.forester.getAmount()+"\nClay Pit:\t"+User.clayPit.getAmount()+"\nForge:\t"+User.forge.getAmount()+"\nCottage:\t"+User.cottage.getAmount()+"\nCastle:\tLevel\t"+User.castle.getAmount()+"\nSchool:\tLevel\t"+User.school.getAmount()+"\nBarracks:\tLevel\t"+User.barracks.getAmount()+"\n\n");
    }

    // electking() actually not needed ... but still nice idea
    public static void electking(View view)
    {
        //check resources       
        view.addText(" Are you sure you want to elect a... as the new king? y/n \n");

        //char choice=scanking.next().toCharArray()[0];
        String scanking = view.tf.getText();
        view.tf.setText("");

        switch (scanking)
        {
            case "y": view.addText(" The citizens celebrate the new king!"); break;
            case "n": view.addText(" The king wasnÂ´t elected."); break;
            default: view.addText(" Please make a decision!"); break;
        }
    }

    public static void clear(View view)
    {
        view.addText("Your savegame will now be deleted.");
        try
        {
            try{
                view.setCursorWaiting();
                Thread.sleep(5000);
            }finally{
                view.setCurorDefault();
            }
        }
        catch (InterruptedException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        view.addText("Just kidding");
    }
}
