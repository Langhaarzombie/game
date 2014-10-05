
/**
 * class where all the cases are stored.
 * from here the user is redirected to other classes and methods
 * @author Michael Bartl
 *
 */
public class Cases 
{
    public static void cases(View view)
    {
        String choice = view.tf.getText();
        view.tf.setText("");

        //set the entered text to lowercase, so there wont be any problems with capital and non capital letters
        choice=choice.toLowerCase();
        
        if(choice.length()>0)
            switch (choice)
            {
                case "book": Help.printhelps(view); break;
                case "build": Help.build(view); break;
                case "buildcottage": CasePrintouts.buildCottage(view); break;
                case "buildforester": CasePrintouts.buildForesterHouse(view); break;
                case "buildforge": CasePrintouts.buildForge(view); break;
                case "buildclaypit": CasePrintouts.buildClayPit(view); break;
                case "buildschool": CasePrintouts.buildSchool(view); break;
                case "buildcastle": CasePrintouts.buildCastle(view); break;
                case "buildbarracks": CasePrintouts.buildBarracks(view); break;
                case "r": CasePrintouts.resources(view); break;
                case "resources": CasePrintouts.resources(view); break;
                case "goto": Help.goTo(view); break;
                case "gotocottage": CasePrintouts.goToCottage(view); break;
                case "gotoforester": CasePrintouts.goToForester(view); break;
                case "gotoforge": CasePrintouts.goToForge(view); break;
                case "gotoclaypit": CasePrintouts.goToClayPit(view); break;
                case "gotocastle": CasePrintouts.goToCastle(view); break;
                case "gotoschool": CasePrintouts.goToSchool(view); break;
                case "gotobarracks": CasePrintouts.goToBarracks(view); break;
                case "recruitwarriors": CasePrintouts.recruitWarriors(view); break;
                case "info": CasePrintouts.info(view); break;
                default: view.addText(choice + " is not a command\n"); break;
        }//switch
    }//method
}
