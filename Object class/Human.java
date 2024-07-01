class Human implements Cloneable   //cloneOverride
{
	String name ;
	String place ;
	String gender ;
	String proffesion ;

	Human(String name ,String place ,String gender ,String proffesion)
	{
		this.name = name ;
		this.place = place ;
		this.gender = gender ;
		this.proffesion = proffesion ;
	}

	public String toString()
	{
		return  "My name is "+this.name+" and my native place is "+place+" i am a "+proffesion+".("+gender+")";
	}

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class HumanDriver 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Human obj1 = new Human("Gaurav","Chh.SambhajiNagar","Male","Software Enginner");
		System.out.println(obj1);

		Human obj2=(Human)obj1.clone();

		obj2.name="Sunny";
		System.out.println(obj2);
		
	}
}