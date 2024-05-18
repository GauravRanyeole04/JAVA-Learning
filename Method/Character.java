import java.util.*;
class Character 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Name : ");
		String name=sc.next();
		char ch = m1(name,3);

		System.out.println(name +" has a Character "+ch+" at 3rd position");
	}

	public static char m1(String name ,int index)
	{
		char ch=name.charAt(index);
		return ch;
	}
}