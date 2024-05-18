class Car
{
	String brand;
	String model;
	String engine;
	String type;
	double mileage;
	byte seatingCapacity;
	String price;
	int noAirbags;

	public void displayCar()
	{
		System.out.println(" Brand : "+brand);
		System.out.println(" Model : "+model);
		System.out.println(" Engine Type : "+engine);
		System.out.println(" Car Type : "+type);
		System.out.println(" Mileage of CAr : "+mileage+" pr/lt");
		System.out.println(" Seating Capacity : "+seatingCapacity);
		System.out.println(" No. of Air Bags : "+noAirbags);
		System.out.println(" Cost of Car : "+price);
	}
}

class CarDriver
{
	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.brand="mahindra";
		obj.model="xuv700";
		obj.engine="114 kW";
		obj.type="Suv";
		obj.mileage=12;
		obj.seatingCapacity=7;
		obj.noAirbags=5;
		obj.price=27+" lakh";
		obj.displayCar();
			System.out.println();
		
		Car obj1=new Car();
		obj1.brand="lamborghini";
		obj1.model="Urus";
		obj1.engine="3996 cc";
		obj1.type="Suv(Sport)";
		obj1.mileage=2;
		obj1.seatingCapacity=4;
		obj1.noAirbags=6;
		obj1.price= 4+" cr";
		obj1.displayCar();

	}
}