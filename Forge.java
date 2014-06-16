
public class Forge extends Buildings
{
    
    public Forge(View view, String name, int costsWood, int costsClay, int costsIron, int costsGold, int costsPeople, int plusIron)
    {
        super(view, name, costsWood, costsClay, costsIron, costsGold, costsPeople, 0, 0, plusIron, 0, 0);
    }
    
    
    //TODO levelUp!!! Jonas?
    public void levelUp(int oldLevel, int newLevel)
    {
        if(this.amount<1) return;
        
        // for costs
        

        // for plus
        
        
    }

    // method is called if the user wants to build a new building, checked if enough materials available (if not return false), calculates the plus 
    // for unique buildings newBuild = a level up
    // plusGoldCastle is taken from the castle object to calculate the amount of gold added
    // schoolMultiplicator is taken from special1 of the School Object and is used to calculate the time needed to build something new/level up
    public void newBuild(int wood, int clay, int iron, int gold, int people, int schoolMultiplicator, int castleMultiplicator)
    {

        if(wood-this.costsWood<0||clay-this.costsClay<0||iron-this.costsIron<0||gold-this.costsGold<0||people-this.costsPeople<0)
        {
            view.addText("You do not have enough resources.\n"); 
            return;
        }

        wood=wood-this.costsWood;
        clay=clay-this.costsClay;
        iron=iron-this.costsIron;
        gold=gold-this.costsGold;
        people=people-this.costsPeople;

        //isnt´t needed for now
        //view.addText("Wait until the building has been created.\n");

        learningWait(schoolMultiplicator, this.costsPeople);
        wood=wood+this.plusWood;
        clay=clay+this.plusClay;
        iron=iron+this.plusIron;
        gold=gold+this.plusGold;
        people=people+this.plusPeople;

        this.amount++;

        User.materials[0]=wood;
        User.materials[1]=clay;
        User.materials[2]=iron;
        User.materials[3]=gold;
        User.materials[4]=people;

        CasePrintouts.resources(view);
        view.addText("A forge has been created.\n");
    }

    // method is used to get info about costs and plus of creating the building
    public void getInfo()
    {
        view.addText("Costs:\nWood: "+this.costsWood+"\nClay: "+this.costsClay+"\nIron: "+this.costsIron+"\nGold: "+this.costsGold+"\nPeople: "+this.costsPeople);
        view.addText("Plus:\nWood: "+this.plusWood+"\nClay: "+this.plusClay+"\nIron: "+this.plusIron+"\nGold: "+this.plusGold+"\nPeople: "+this.plusPeople);
        view.addText("Amount: "+this.amount);
    }
}
