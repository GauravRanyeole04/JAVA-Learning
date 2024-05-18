class Bag
{
	String size;
	String type ;
	int column ;

	protected Bag()
	{
		super();
	}

	void displayBag()
	{
		System.out.println("size of bag :"+size);
		System.out.println("Type of bag : "+type);
		System.out.println("Total Column : "+column);
	}
}


class BagDriver 
{
	public static void main(String[] args) 
	{
		Bag obj =new Bag();
		obj.displayBag();

	}
}