
/**
 * the user is taken to this class if he types any command that has nothing to do with Help
 * @author Michael Bartl
 *
 */

public class CasePrintouts
{    

    //create buildings
    public static void buildCottage(View view)
    {
        try{
            view.setCursorWaiting();
            User.cottage.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCursorDefault();
        }
    }

    public static void buildForesterHouse(View view)
    {
        try{
            view.setCursorWaiting();
            User.forester.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCursorDefault();
        }
    }

    public static void buildForge(View view)
    {
        try{
            view.setCursorWaiting();
            User.forge.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCursorDefault();
        }
    }

    public static void buildClayPit(View view)
    {
        try{
            view.setCursorWaiting();
            User.clayPit.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator(), User.castle.getMultiplicator());
        }finally{
            view.setCursorDefault();
        }
    }

    public static void buildSchool(View view)
    {
        try{
            view.setCursorWaiting();
            User.school.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4]);
        }finally{
            view.setCursorDefault();
        }
    }

    public static void buildCastle(View view)
    {
        try{
            view.setCursorWaiting();
            User.castle.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator());
        }finally{
            view.setCursorDefault();
        }
    }

    public static void buildBarracks(View view)
    {
        try{
            view.setCursorWaiting();
            User.barracks.newBuild(User.materials[0], User.materials[1], User.materials[2], User.materials[3], User.materials[4], User.school.getMultiplicator());
        }finally{
            view.setCursorDefault();
        }
    }

    public static void resources(View view)
    {
        view.addText("Resources:\n\nWood:\t"+User.materials[0]+"\nClay:\t"+User.materials[1]+"\nIron:\t"+User.materials[2]+"\nGold:\t"+User.materials[3]+"\nPeople:\t"+User.materials[4]+"\n\n");
    }

    // goTo buildings
    public static void goToCottage(View view)
    {
        view.addText("Information about cottage:\n");
        User.cottage.getInfo();
    }

    public static void goToForester(View view)
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

    public static void info(View view)
    {
    	view.addText("Info:\n\nCottage:\t"+User.cottage.getAmount()+"\nForester:\t"+User.forester.getAmount()+"\nForge:\t"+User.forge.getAmount()+"\nClay Pit:\t"+User.clayPit.getAmount()+"\n\nSchool:\tLevel\t"+User.school.getAmount()+"\nCastle:\tLevel\t"+User.castle.getAmount()+"\nBarracks:\tLevel\t"+User.barracks.getAmount()+"\n\n");
    }

    public static void recruitWarriors(View view){
        view.addText("Which class shall the new warriors be in?");
        String amountStr=view.tf.getText();
        byte classW=Byte.valueOf(amountStr);
        User.barracks.setAmountWarriorsTrained(view, classW);
    }

}
