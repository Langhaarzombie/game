
public class Buildings
{

    public View view;

    public String name;

    // the costs of each material for constructing the building
    public int costsWood;
    public int costsClay;
    public int costsIron;
    public int costsGold;
    public int costsPeople;

    // the advantages of a building
    // plus gold is a special variable only used for the castle. it defines the amount of money you get if you build a new cottage
    public int plusWood;
    public int plusClay;
    public int plusIron;
    public int plusGold;
    public int plusPeople;

    // the number of buildings you built of that type
    public int amount;

    // constructor
    public Buildings(View view, String name, int costsWood, int costsClay, int costsIron, int costsGold, int costsPeople, int plusWood, int plusClay, int plusIron, int plusGold, int plusPeople)
    {

        this.view=view;

        setName(name);

        setCostsWood(costsWood);
        setCostsClay(costsClay);
        setCostsIron(costsIron);
        setCostsGold(costsGold);
        setCostsPeople(costsPeople);

        setPlusWood(plusWood);
        setPlusClay(plusClay);
        setPlusIron(plusIron);
        setPlusGold(plusGold);
        setPlusPeople(plusPeople);

        setAmount(0);
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount) 
    {
        this.amount = amount;
    }

    public int getPlusPeople() 
    {
        return plusPeople;
    }

    public void setPlusPeople(int plusPeople)
    {
        this.plusPeople = plusPeople;
    }

    public int getPlusGold() 
    {
        return plusGold;
    }

    public void setPlusGold(int plusGold)
    {
        this.plusGold = plusGold;
    }

    public int getPlusIron() 
    {
        return plusIron;
    }

    public void setPlusIron(int plusIron)
    {
        this.plusIron = plusIron;
    }

    public int getPlusClay() 
    {
        return plusClay;
    }

    public void setPlusClay(int plusClay) 
    {
        this.plusClay = plusClay;
    }

    public int getPlusWood() 
    {
        return plusWood;
    }

    public void setPlusWood(int plusWood) 
    {
        this.plusWood = plusWood;
    }

    public int getCostsPeople() {
        return costsPeople;
    }

    public void setCostsPeople(int costsPeople)
    {
        this.costsPeople = costsPeople;
    }

    public int getCostsGold() 
    {
        return costsGold;
    }

    public void setCostsGold(int costsGold) 
    {
        this.costsGold = costsGold;
    }

    public int getCostsIron() 
    {
        return costsIron;
    }

    public void setCostsIron(int costsIron) 
    {
        this.costsIron = costsIron;
    }

    public int getCostsClay() 
    {
        return costsClay;
    }

    public void setCostsClay(int costsClay) 
    {
        this.costsClay = costsClay;
    }

    public int getCostsWood() 
    {
        return costsWood;
    }

    public void setCostsWood(int costsWood)
    {
        this.costsWood = costsWood;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    // used if people are trained (it takes a time until the building can be built) 
    // is also used to define the time that is needed to train warriors
    public void learningWait(int multiplicator, int costs)
    {
        int time=multiplicator*costs;
        try 
        {
            Thread.sleep((long)time);
        } 
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
            view.addText("Error 303. Thread not available to sleep.");
        }
    }
}