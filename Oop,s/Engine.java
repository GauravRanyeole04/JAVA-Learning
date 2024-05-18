class Engine 
{
	double horsepower,fulecap,mileage;
	String engineType;
	int noOfPiston;

	Engine(double horsepower,double fulecap,double mileage,String engineType,int noOfPiston)
	{
		this.horsepower=horsepower;
		this.fulecap=fulecap;
		this.mileage=mileage;
		this.engineType=engineType;
		this.noOfPiston=noOfPiston;
	}

	void displayEngine()
	{
		System.out.println();
		System.out.println("*** Engine Details ***");
		System.out.println("horse Power : "+this.horsepower);
		System.out.println("Fuel Capacity : "+this.fulecap);
		System.out.println("Mileage : "+this.mileage);
		System.out.println("Engine Type : "+this.engineType);
		System.out.println("No. of Piston : "+this.noOfPiston);
	}
}