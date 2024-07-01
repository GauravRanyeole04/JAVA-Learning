class Employee 
{
	String name ;
	static int id=0;

	Employee(String name )
	{
		this.name =name ;
		id++;
	}

	public int hashCode()
	{
		return id ;
	}

	public String toString()
	{
		return this.id+"."+this.name;
	}
}

class EmployeeDriver 
{
	public static void main(String []args)
	{
		Employee obj1 = new Employee("Gaurav");
		System.out.println(obj1);
		// System.out.println(obj.hashCode());
		Employee obj2 = new Employee("Sunny");
		System.out.println(obj2);
		

		// System.out.println(obj2.hashCode());

	}
}
