class Bottel
{
	String brand ;
	String material ;
	String colour;
	double capacity;

	Bottel(String brand , String material, double capacity,String colour)
	{
		this.brand=brand ;
		this.material=material;
		this.capacity=capacity;
		this.colour=colour;
	}
 
 	Bottel(Bottel obj)
 	{
 		this.brand=obj.brand ;
		this.material=obj.material;
		this.capacity=obj.capacity;
 	}
	void BottelDisplay()
	{
		System.out.println("Brand : "+this.brand);
		System.out.println("Material : "+this.material);
		System.out.println("Capacity : "+this.capacity);
		System.out.println("Colour : "+this.colour);
		System.out.println();
	}
}

class BottelDriver 
{
	public static void main(String[] args) 
	{
		Bottel obj=new Bottel("kinely","copper",1.2,"Blue");
		obj.BottelDisplay();

		Bottel obj1=new Bottel(obj);
		obj1.BottelDisplay();
	}
}