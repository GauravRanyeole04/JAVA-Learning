import java.util.*;
class Employee   		//object destroy 
{
	String name ;
	String gender;
	Employee(String name ,String gender)
	{
		this.name=name ;
		this.gender=gender;
	}
	@Override
	protected void finalize()
	{
		System.out.println("Object got Destroyed");
	}
}

class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee("Gaurav","Male");
		System.out.println(obj.name);
		obj=null;
		System.gc();
		System.out.println(obj.name);


	}
}