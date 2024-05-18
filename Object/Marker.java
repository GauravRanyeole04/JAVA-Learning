class Marker 
{
	String type;
	double diameter;
	String brand ;
	String colour;
	int price;
	double weight;

	public void displayMarker()
	{
		System.out.println("*** Marker ***" );
		System.out.println(" Brand : "+brand);
		System.out.println(" colour : "+colour);
		System.out.println(" Price : "+price+" rs");
		System.out.println(" Weigth : "+weight);
		System.out.println(" Diameter : "+diameter+" mm");
		System.out.println(" Type of Marker : "+type);

	}
}

class MarkerDetails 
{
	public static void main(String[] args) 
	{
		System.out.println();
		Marker obj=new Marker();

		obj.type=" Temporary";
		obj.diameter=1.25;
		obj.brand=" Sunny";
		obj.weight=0.250;
		obj.colour="Blue";
		obj.price=60;
		obj.displayMarker();
	}
}