class CarDriver
{
	public static void main(String[] args)
	{
		Car obj = new Car("TATA","NEXON","SUV",900000,5,(new Engine (120,50,16,"Petrol",4)));
		obj.displayCar();
		obj.engine.displayEngine();
	}
}