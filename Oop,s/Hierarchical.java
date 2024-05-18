class Bag 
{
	String brand,type,fabric;

	Bag(String brand,String type,String fabric)
	{
		super();
		this.brand=brand;
		this.type=type;
		this.fabric=fabric;
	}

	void displayBag()
	{
		System.out.println();
		System.out.println("*** Bag Details ***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Fabric : "+this.fabric);
	}
}

class LaptopBag extends Bag
{
	int column ;
	double price ;

	LaptopBag(int column,double price,String brand,String type,String fabric)
	{
		super(brand,type,fabric);
		this.column=column;
		this.price=price;
	}

	void displayLaptopBag()
	{
		System.out.println();
		System.out.println("*** Laptop Bag ***");
		System.out.println("No. of column : "+this.column);
		System.out.println("Price of Bag : "+this.price+" rs.");
	}
}

class TravelBag extends Bag
{
	String typetg;
	int section ;
	double cost ;

	TravelBag(String typetg,int section,double cost, String brand,String type,String fabric)
	{
		super(brand,type,fabric);
		this.typetg=typetg;
		this.section=section;
		this.cost=cost;
	}
	void displayTravelBag()
	{
		System.out.println();
		System.out.println("*** Travel Bag ***");
		System.out.println("Type of Travel Bag : "+this.typetg);
		System.out.println("Section : "+this.section);
		System.out.println("Cost : "+this.cost+" rs.");
	}
}

class BagDriver
{
	public static void main(String[] args) 
	{
		TravelBag obj=new TravelBag("Wheel Drive",6,4500,"Safari","Travelling Bag","Polyster");
		obj.displayBag();
		obj.displayTravelBag();

		LaptopBag obj1=new LaptopBag(2,800,"SkyBag","College laptop Bag","Nylon");
		obj1.displayBag();
		obj1.displayLaptopBag();
	}
}

	
