package game;

public class Generate {

	public Buildings[] buildings;

	private ImportAmountOfCostsAndPlus importBuilding;

	public Generate(){
	    this.buildings=new Buildings[6];
	    importBuilding=new ImportAmountOfCostsAndPlus();
		assignValuesBuildings(this.buildings);
	}

	private void assignValuesBuildings(Buildings[] buildings){
	    // for forester
		buildings[0]=new Buildings("Forester", importBuilding.getData(0,0), importBuilding.getData(0,1), importBuilding.getData(0,2), importBuilding.getData(0,3), importBuilding.getData(0,4), importBuilding.getData(0,5), importBuilding.getData(0,6), importBuilding.getData(0,7), importBuilding.getData(0,8), importBuilding.getData(0,9), importBuilding.getData(0,10), importBuilding.getData(0,11));
		// for clay pit
		buildings[1]=new Buildings("Clay Pit", importBuilding.getData(1,0), importBuilding.getData(1,1), importBuilding.getData(1,2), importBuilding.getData(1,3), importBuilding.getData(1,4), importBuilding.getData(1,5), importBuilding.getData(1,6), importBuilding.getData(1,7), importBuilding.getData(1,8), importBuilding.getData(1,9), importBuilding.getData(1,10), importBuilding.getData(1,11));
		// for forge
		buildings[2]=new Buildings("Forge", importBuilding.getData(2,0), importBuilding.getData(2,1), importBuilding.getData(2,2), importBuilding.getData(2,3), importBuilding.getData(2,4), importBuilding.getData(2,5), importBuilding.getData(2,6), importBuilding.getData(2,7), importBuilding.getData(2,8), importBuilding.getData(2,9), importBuilding.getData(2,10), importBuilding.getData(2,11));
		// for cottage
		buildings[3]=new Buildings("Cottage", importBuilding.getData(3,0), importBuilding.getData(3,1), importBuilding.getData(3,2), importBuilding.getData(3,3), importBuilding.getData(3,4), importBuilding.getData(3,5), importBuilding.getData(3,6), importBuilding.getData(3,7), importBuilding.getData(3,8), importBuilding.getData(3,9), importBuilding.getData(3,10), importBuilding.getData(3,11));
		// for castle
		buildings[4]=new Buildings("Castle", importBuilding.getData(4,0), importBuilding.getData(4,1), importBuilding.getData(4,2), importBuilding.getData(4,3), importBuilding.getData(4,4), importBuilding.getData(4,5), importBuilding.getData(4,6), importBuilding.getData(4,7), importBuilding.getData(4,8), importBuilding.getData(4,9), importBuilding.getData(4,10), importBuilding.getData(4,11));
		// for school
		buildings[5]=new Buildings("School", importBuilding.getData(5,0), importBuilding.getData(5,1), importBuilding.getData(5,2), importBuilding.getData(5,3), importBuilding.getData(5,4), importBuilding.getData(5,5), importBuilding.getData(5,6), importBuilding.getData(5,7), importBuilding.getData(5,8), importBuilding.getData(5,9), importBuilding.getData(5,10), importBuilding.getData(5,11));
	}
}
