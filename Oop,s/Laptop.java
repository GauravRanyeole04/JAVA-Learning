class Charger 
{
	String type,serialNo,company;
	int watt;
	double efficiency;
	Charger(String type ,String serialNo,String company,double efficiency,int watt)
	{
		this.type=type;
		this.serialNo=serialNo;
		this.company=company;
		this.efficiency=efficiency;
		this.watt=watt;
	}

	void displayCharger()
	{
		System.out.println();
		System.out.println("*** Charger Details ***");
		System.out.println("Type Of Charger : "+type);
		System.out.println("Serial Number : "+serialNo);
		System.out.println("Company : "+company);
		System.out.println("Efficiency : "+efficiency);
		System.out.println("Watt : "+watt+" W");
	}
}

class Laptop
{
	String company,processor,graficscard;
	double price;
	int ram,rom;
	Charger charger;

	Laptop(String company,String processor,String graficscard,double price,int ram,int rom,Charger charger)
	{
		this.company=company;
		this.processor=processor;
		this.graficscard=graficscard;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
		this.charger=charger;
	}

	void displayLaptop()
	{
		System.out.println();
		System.out.println("*** Laptop Details ***");
		System.out.println("Company Name : "+company);
		System.out.println("Processor : "+processor);
		System.out.println("Grafics Card : "+graficscard+" GB");
		System.out.println("RAM : "+ram+" GB");
		System.out.println("ROM : "+rom+" GB");
		System.out.println("Price : "+price);
	}
}

class LaptopDriver 
{
	public static void main(String[] args) 
	{
		Laptop obj = new Laptop("Hp","i5","iRISxe 4",65000,8,512,(new Charger("Wried","WHGRK0CGCG38K8","HP",6,65)));
		obj.displayLaptop();
		obj.charger.displayCharger();
	}
}