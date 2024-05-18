class Laptop 
{
	String brand ;
	String model;
	Laptop(String brand ,String model)
	{
		this.brand=brand;
		this.model=model;
	}

	void displayLaptop()
	{
		System.out.println("**************Laptop***************");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
	}

	public static void main(String[] args) 
	{
		Laptop obj = new Laptop("HP","i5");
		obj.displayLaptop();
		
		Laptop obj1 = new Laptop("Lenovo","i3");
		obj1.displayLaptop();
	}

}