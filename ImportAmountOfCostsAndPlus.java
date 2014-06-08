 

public final class ImportAmountOfCostsAndPlus {

    // arrays for the costs and plus of each building for the first generating
    /*
     * 1.) costsWood
     * 2.) costsClay
     * 3.) costsIron
     * 4.) costsGold
     * 5.) costsPeople
     * 6.) plusWood
     * 7.) plusClay
     * 8.) plusIron
     * 9.) plusGold
     * 10.) plusPeople
     * 11.) special1
     * 12.) special2
     */   

	private static int[][] importBuilding;

    private final int[] forester={6, 0, 0, 3, 3, 18, 0, 0, 0, 0, 0, 0};

    private final int[] clayPit={3, 5, 0, 5, 6, 0, 15, 0, 0, 0, 0, 0};

    private final int[] forge={5, 2, 3, 6, 6, 0, 0, 11, 0, 0, 0, 0};

    private final int[] cottage={4, 3, 1, 4, 2, 0, 0, 0, 0, 9, 0, 0};

    private final int[] castle={12, 16, 9, 14, 19, 0, 0, 0, 1, 4, 0, 0};

    private final int[] school={9, 6, 4, 7, 9, 0, 0, 0, 0, 0, 2000, 0};
    
    private final int[] barracks={7, 4, 3, 5, 2, 0, 0, 0, 2, 0, 1000, 0};

    public ImportAmountOfCostsAndPlus(){
    	importBuilding=new int[7][12];
        
    	// forester
    	for(int i=0;i<12;i++){
    		importBuilding[0][i]=forester[i];
    	}
    	
    	// clay pit
    	for(int i=0;i<12;i++){
    		importBuilding[1][i]=clayPit[i];
    	}
    	
    	// forge
    	for(int i=0;i<12;i++){
    		importBuilding[2][i]=forge[i];
    	}
    	
    	// cottage
    	for(int i=0;i<12;i++){
    		importBuilding[3][i]=cottage[i];
    	}
    	
    	// castle
    	for(int i=0;i<12;i++){
    		importBuilding[4][i]=castle[i];
    	}
    	
    	// school
    	for(int i=0;i<12;i++){
    		importBuilding[5][i]=school[i];
    	}
    	
    	// barracks
    	for(int i=0;i<12;i++){
    	    importBuilding[6][i]=barracks[i];
    	   }
    }
    
    public static int getData(int firstIndex, int secondIndex){
    	return importBuilding[firstIndex][secondIndex];
    }
}
