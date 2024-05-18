import java.util.*;
class EmployeeManagementSystem
{
	static String ename ;
	static int eid;
	static String erole ;
	static double esal;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("** WELCOME **");
		System.out.println();
		for (; ; ) 
		{
		System.out.println();
		System.out.println("** Feature **");
		System.out.println(" 1.Add New Employee.");
		System.out.println(" 2.View Employee Data ");
		System.out.println(" 3.Edit Employee Data ");
		System.out.println(" 4.Exit.");

		System.out.print(" Emter the Option : ");
		int op=sc.nextInt();
		switch(op)
		{
			case 1:{
				System.out.println(" -- Add New Employee --");
				sc.nextLine();
				System.out.print(" Enter Emp. Name : ");
				ename=sc.nextLine();
				System.out.print(" Enter Emp. ID : ");
				eid=sc.nextInt();
				sc.nextLine();
				System.out.print(" Enter Emp. Role : ");
				erole=sc.nextLine();
				System.out.print(" Enter Emp. Salary : ");
				esal=sc.nextDouble();
				break;
			}
			case 2:{
				System.out.print(" Enter Emp. ID : ");
				int empid1=sc.nextInt();
				if (empid1==eid){
				viewEmp();
				}else {
					System.out.print(" Invalid Emp. ID ");
				}
				break;
			}
			case 3:{
				System.out.println();
				System.out.println(" 1. Update Emp. Name.");
				System.out.println(" 2. Update Emp. Role.");
				System.out.println(" 3. Update Emp. Salary.");
				System.out.print(" Enter Option : ");
				int op1=sc.nextInt();
				switch(op1)
				{
					case 1:{
						editRole();
						break;
					}
					case 2:{
						editRole();
						break;
					}
					case 3:{
						editSal();
						break;
						}
				}
				break;
			}
			case 4:{
				System.exit(0);
				break;
			}
		    default:{
		    	System.out.print(" Invalid Option ");
		    } 
		}
		}	
	}

	public static void viewEmp()
	{
		System.out.println();
		System.out.println(" ** Employee Data **");
		System.out.println();
		System.out.println(" Emp.Name: "+ename);
		System.out.println(" Emp. ID: "+eid);
		System.out.println(" Emp. Role: "+erole);
		System.out.println(" Emp. Salary: "+esal);
		System.out.println();
	}

	public static void editName()
	{
		Scanner sc2=new Scanner (System.in);
		System.out.print(" Update Emp. Name : ");
		String uname=sc2.nextLine();
		ename=uname ;
	}

	public static void editRole()
	{
		Scanner sc3=new Scanner (System.in);
		String nrole=erole ;
		System.out.print(" Update Emp. Role : ");
		String urole=sc3.nextLine();
		erole=urole ;
		System.out.print(nrole +" change to the  "+urole );
		System.out.println();
		System.out.println();
	}

	public static void editSal()
	{
		Scanner sc4=new Scanner (System.in);
		System.out.print(" Update Emp. Salary: ");
		double usal=sc4.nextDouble();
		esal=usal ;
	}
}