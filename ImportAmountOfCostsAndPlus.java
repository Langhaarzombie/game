 

public final class ImportAmountOfCostsAndPlus 
{

    // arrays for the costs and plus of each building for the first generating
    /*
     * 0/1.) costsWood
     * 1/2.) costsClay
     * 2/3.) costsIron
     * 3/4.) costsGold
     * 4/5.) costsPeople
     * 5/6.) plusWood
     * 6/7.) plusClay
     * 7/8.) plusIron
     * 8/9.) plusGold
     * 9/10.) plusPeople
     */   
    //TODO delete last two values
    private static int[][] importBuilding;

    private final int[] forester={6, 0, 0, 3, 3, 18, 0, 0, 0, 0};

    private final int[] clayPit={4, 3, 0, 5, 6, 0, 15, 0, 0, 0};

    private final int[] forge={5, 2, 3, 6, 6, 0, 0, 11, 0, 0};

    private final int[] cottage={4, 3, 1, 4, 2, 0, 0, 0, 0, 9};

    private final int[] castle={12, 16, 9, 14, 19, 0, 0, 0, 6, 2};

    private final int[] school={9, 6, 4, 7, 9, 0, 0, 0, 0, 0};
    
    private final int[] barracks={7, 4, 3, 5, 2, 0, 0, 0, 4, 0};

    public ImportAmountOfCostsAndPlus(){
        importBuilding=new int[7][12];
        
        // forester
        for(int i=0;i<10;i++)
        {
            importBuilding[0][i]=forester[i];
        }
        
        // clay pit
        for(int i=0;i<10;i++)
        {
            importBuilding[1][i]=clayPit[i];
        }
        
        // forge
        for(int i=0;i<10;i++)
        {
            importBuilding[2][i]=forge[i];
        }
        
        // cottage
        for(int i=0;i<10;i++)
        {
            importBuilding[3][i]=cottage[i];
        }
        
        // castle
        for(int i=0;i<10;i++)
        {
            importBuilding[4][i]=castle[i];
        }
        
        // school
        for(int i=0;i<10;i++)
        {
            importBuilding[5][i]=school[i];
        }
        
        // barracks
        for(int i=0;i<10;i++)
        {
            importBuilding[6][i]=barracks[i];
        }
    }
    
    public static int getData(int firstIndex, int secondIndex)
    {
        return importBuilding[firstIndex][secondIndex];
    }
}
