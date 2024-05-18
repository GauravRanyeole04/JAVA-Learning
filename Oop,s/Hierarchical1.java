class Employee 
{
	String companyName,location;

	Employee(String companyName,String location)
	{
		this.companyName=companyName;
		this.location=location;
	}
	void displayEmployee()
	{
		System.out.println("***Employee Details***");
		System.out.println("comapany Name : "+this.companyName);
		System.out.println("Company Location : "+this.location);
	}
}

class Manager extends Employee
{
	String name ,jobType,joiningDate;
	long contact;
	double sal;

	Manager(String name,String jobType ,String joiningDate,long contact,double sal,String companyName,String location)
	{
		super(companyName,location);
		this.name=name;
		this.jobType=jobType;
		this.contact=contact;
		this.sal=sal;
		this.joiningDate=joiningDate;
	}
	void displayManager()
	{
		System.out.println();
		super.displayEmployee();
		System.out.println("***Manager Details***");
		System.out.println("Manager Name : "+this.name);
		System.out.println("Job type : "+this.jobType);
		System.out.println("Contact : "+this.contact);
		System.out.println("Salary : "+this.sal);
		System.out.println("Joining Date : "+this.joiningDate);
	}
}

class Developer extends Employee
{
	String dName ,dJobType,dJoiningDate;
	long dContact;
	double dSal;
	Developer(String dName,String dJobType,String dJoiningDate,long dContact,double dSal,String companyName,String location)
	{
		super(companyName,location);
		this.dName=dName;
		this.dJobType=dJobType;
		this.dJoiningDate=dJoiningDate;
		this.dContact=dContact;
		this.dSal=dSal;
	}
	void displayDeveloper()
	{
		System.out.println();
		super.displayEmployee();
		System.out.println("***Developer Details***");
		System.out.println("Developer Name : "+this.dName);
		System.out.println("Job Type : "+this.dJobType);
		System.out.println("Contact : "+this.dContact);
		System.out.println("Salary : "+this.dSal);
		System.out.println("Joining Date : "+this.dJoiningDate);
	}
}

class Salesman extends Employee
{
	String sName ,sJobType,sJoiningDate;
	long sContact;
	double sSal;
	Salesman(String sName,String sJobType,String sJoiningDate,long sContact,double sSal,String companyName,String location)
	{
		super(companyName,location);
		this.sName=sName;
		this.sJobType=sJobType;
		this.sJoiningDate=sJoiningDate;
		this.sContact=sContact;
		this.sSal=sSal;
	}
	void displaySalesman()
	{
		System.out.println();
		super.displayEmployee();
		System.out.println("***Salesman Details***");
		System.out.println("Name : "+this.sName);
		System.out.println("Type : "+this.sJobType);
		System.out.println("Contact : "+this.sContact);
		System.out.println("Salary : "+this.sSal);
		System.out.println("Joining Date : "+this.sJoiningDate);
	}
}

class EmployeeDriver
{
	public static void main(String[] args) 
	{
		Manager obj=new Manager("A.B.Sharma","Financial Manager","01-Jan-2022",9876543210l,70000,"TCS","Pune");
		obj.displayManager();

		Developer obj1=new Developer("B.M.Varma","Front-End Developer","02-Feb-2021",9087654763l,80000,"TCS","Pune");
		obj1.displayDeveloper();

		Salesman obj2=new Salesman("B.M.Joshi","Inside Salesman","24-Feb-2021",9087654003l,60000,"TCS","Pune");
		obj2.displaySalesman();
	}
}
	