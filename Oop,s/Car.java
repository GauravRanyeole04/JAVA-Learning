class Car 
{
	String brand,model,type;
	double price;
	int seatingCap;
	Engine engine;

	Car(String brand , String model,String type,double price,int seatingCap,Engine engine)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCap=seatingCap;
		this.engine=engine;
	}

	void displayCar()
	{
		System.out.println();
		System.out.println("*** Car Details ***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Type Of Car : "+this.type);
		System.out.println("Price : "+this.price);
		System.out.println("Setting Capacity : "+this.seatingCap);
	}
}