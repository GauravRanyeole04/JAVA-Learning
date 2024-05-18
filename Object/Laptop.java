class Laptop
{
	String brand;
	String model;
	String graphics;
	double price;
	int msoffice;
	String processer;
	int type ;

	public void displayLaptop()
	{
		System.out.println();
		System.out.println("*** Laptop ***");
		System.out.println(" Brand : "+brand );
		System.out.println(" Model : "+model);
		System.out.println(" Processer : "+processer);
		System.out.println(" msoffice : "+msoffice);
		System.out.println(" Type : "+type+" bit");
		System.out.println(" Graphics : "+graphics);
		System.out.println(" price : "+price+" rs.");
	}
}

class LaptopDetails 
{
	public static void main(String[] args) 
	{
		Laptop obj=new Laptop();
		obj.brand="HP";
		obj.model="i5";
		obj.graphics="intel iRISxe (4gb)";
		obj.price=65000;
		obj.msoffice=2021;
		obj.processer="11th GEN";
		obj.type=64;
		obj.displayLaptop();
	}
}