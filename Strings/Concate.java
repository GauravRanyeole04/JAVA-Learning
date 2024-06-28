import java.util.*;
class Concate
{
	public static void main(String[] args) 
	{
		String name1="Gaurav";
		String name2="Ranyeole";

		System.out.println(name1.concat(name2));

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name : ");
		String a=sc.next();
		System.out.println("Enter Second name : ");
		String b=sc.next();
		System.out.print("Concate name : "+(a+b));
	}
}