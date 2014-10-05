 

public class Generating 
{

    private ImportAmountOfCostsAndPlus importBuilding;
    private View view;

	public Generating(View view, Forester forester, ClayPit clayPit, Forge forge, School school, Castle castle, Cottage cottage, Barracks barracks)
	{
		this.view=view;
	    importBuilding=new ImportAmountOfCostsAndPlus();
		assignValuesBuildings(forester, clayPit, forge, school, castle, cottage, barracks);
	}

	private void assignValuesBuildings(Forester forester, ClayPit clayPit, Forge forge, School school, Castle castle, Cottage cottage, Barracks barracks)
	{
	    //forester
		forester=new Forester(this.view, "Forester", importBuilding.getData(0,0), importBuilding.getData(0,3), importBuilding.getData(0,4), importBuilding.getData(0,5));

		//clayPit
		clayPit=new ClayPit(this.view, "Clay Pit", importBuilding.getData(1,0), importBuilding.getData(1,1), importBuilding.getData(1,3), importBuilding.getData(1,4), importBuilding.getData(1,6));

		//forge
		forge=new Forge(this.view, "Forge", importBuilding.getData(2,0), importBuilding.getData(2,1), importBuilding.getData(2,2), importBuilding.getData(2,3), importBuilding.getData(2,4), importBuilding.getData(2,7));

		//cottage
		cottage=new Cottage(this.view, "Cottage", importBuilding.getData(3,0), importBuilding.getData(3,1), importBuilding.getData(3,2), importBuilding.getData(3,3), importBuilding.getData(3,4), importBuilding.getData(3,9));

		//castle
		castle=new Castle(this.view, "Castle", importBuilding.getData(4,0), importBuilding.getData(4,1), importBuilding.getData(4,2), importBuilding.getData(4,3), importBuilding.getData(4,4), importBuilding.getData(4,8), importBuilding.getData(4,9));

		//school
		school=new School(this.view, "School", importBuilding.getData(5,0), importBuilding.getData(5,1), importBuilding.getData(5,2), importBuilding.getData(5,3), importBuilding.getData(5,4));
		
		//barracks
		barracks=new Barracks(this.view, "School", importBuilding.getData(6,0), importBuilding.getData(6,1), importBuilding.getData(6,2), importBuilding.getData(6,3), importBuilding.getData(6,4), importBuilding.getData(6,8));
		
		User.forester=forester;
		User.clayPit=clayPit;
		User.forge=forge;
		User.cottage=cottage;
		User.castle=castle;
		User.school=school;
		User.barracks=barracks;
	}
}
