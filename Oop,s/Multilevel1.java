class Transportation 
{
	String type,medium ;

	Transportation(String type ,String medium)
	{
		super();
		this.type=type;
		this.medium=medium;
	}
	void displayTransportation()
	{
		System.out.println();
		System.out.println("*** Transportation Details ***");
		System.out.println("Type Of Transportation : "+this.type);
		System.out.println("Medium of Transportation : "+this.medium);
	}
}

class Vehicle extends Transportation
{
	String passing,vehicletype,vehiclemodel;

	Vehicle(String passing,String vehicletype,String vehiclemodel,String type ,String medium)
	{
		super(type,medium);
		this.passing=passing ;
		this.vehicletype=vehicletype;
		this.vehiclemodel=vehiclemodel=vehiclemodel;
	}
	void displayVehicle()
	{
		System.out.println();
		System.out.println("*** Vehicle Details ***");
		System.out.println("Registration of Vehicle : "+this.passing);
		System.out.println("Vehicle Type : "+this.vehicletype);
		System.out.println("Vehicle Model : "+this.vehiclemodel);
	}
}

class Car extends Vehicle 
{
	String fuelType;
	int noOftyers,wheeldrive;
	boolean ac;

	Car(int noOftyers,int wheeldrive,String fuelType,boolean ac,String passing,String vehicletype,String vehiclemodel,String type ,String medium)
	{
		super(passing,vehicletype,vehiclemodel,type,medium);
		this.noOftyers=noOftyers;
		this.wheeldrive=wheeldrive;
		this.fuelType=fuelType;
		this.ac=ac;
	}
	void displayCar()
	{
	 	System.out.println();
	 	System.out.println("*** Car Details ***");
	 	System.out.println("No. of Wheels : "+this.noOftyers);
	 	System.out.println("Drive : "+this.wheeldrive+" wheeldrive.");
	 	System.out.println("Fule Type : "+this.fuelType);
	 	System.out.println("Air Coditioner : "+this.ac);
    }
}


class Harrier extends Car
{
	String brand,model;
	double mileage,price,groundClearance;

	Harrier(String brand ,String model,double mileage,double price ,double groundClearance,int noOftyers,int wheeldrive,String fuelType,boolean ac,String passing,String vehicletype,String vehiclemodel,String type ,String medium)
	{
		super(noOftyers,wheeldrive,fuelType,ac,passing,vehicletype,vehiclemodel,type,medium);
		this.brand=brand;
		this.model=model;
		this.mileage=mileage;
		this.price=price;
		this.groundClearance=groundClearance;
	}

	void displayHarrier()
	{
		System.out.println();
		System.out.println("*** Harrier Details ***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Mileage : "+this.mileage+" per/lt");
		System.out.println("Ground Clearance : "+this.groundClearance+" mm");
		System.out.println("Price : "+this.price+" lakh's");
	}
}

class TransportationDriver 
{
	public static void main (String [] args)
	{
		Harrier obj = new Harrier("TATA","Pure plus",15,26,205,4,4,"Petrol",true,"Maharastra(MH)","Car","Fuel","Private","Road Transportation");
		obj.displayTransportation();
		obj.displayVehicle();
		obj.displayCar();
		obj.displayHarrier();
	}
}
	