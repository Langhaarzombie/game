
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
                case "gotoforester": CasePrintouts.goToForesterHouse(view); break;
                case "gotoforge": CasePrintouts.goToForge(view); break;
                case "gotoclaypit": CasePrintouts.goToClayPit(view); break;
                case "gotocastle": CasePrintouts.goToCastle(view); break;
                case "gotoschool": CasePrintouts.goToSchool(view); break;
                case "gotobarracks": CasePrintouts.goToBarracks(view); break;
                case "exit": CasePrintouts.exit(view); break;
                case "info": CasePrintouts.buildings(view); break;
                case "electking": CasePrintouts.electking(view); break;
                case "clear": CasePrintouts.clear(view); break;
                default: view.addText(choice + " is not a command"); break;
        }//switch
    }//method
}
