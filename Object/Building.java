class Building 
{
	double area;
	double height;
	int floor;
	int lift;
	String parking ;
	String garden;
	String location ;
	double tarace ;

	public void displayBuilding()
	{
		System.out.println();
		System.out.println("*** Building Details ***");
		System.out.println(" Location : "+location);
		System.out.println(" Area : "+area+"sq.ft.");
		System.out.println(" Height : "+height+"meter");
		System.out.println(" Floor : "+floor);
		System.out.println(" Lift : "+lift);
		System.out.println(" parking : "+parking);
		System.out.println(" Garden : "+garden);
		System.out.println(" Trace Area : "+tarace);
	}
}

class BuildingDetails 
{
	public static void main(String[] args) 
	{
		Building obj=new Building();
		obj.location="pune";
		obj.area=12000 ;
		obj.height=6.6;
		obj.floor=22;
		obj.lift=3;
		obj.parking="yes (seperate)";
		obj.garden=" yes ";
		obj.tarace=15000;
		obj.displayBuilding();
	}
}