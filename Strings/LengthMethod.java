import java.util.Scanner;
class LengthMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.next();
		int length = userLength(str);
		System.out.println(str +" length : " + length);

	}

	public static int userLength(String str)
	{
		int l=0;
		for (int i=0; ;i++) 
		{
			try{
				str.charAt(i);
				l++;
			}
			catch(StringIndexOutOfBoundsException z)
			{
				break;
			}
		}
		return l;
	}
}

 
class LengthMethod1
{
	static String a= "Sunny";
	public static void main(String[] args) 
	{
		int length = userLength();
		System.out.println(length);
	}
	public static int userLength()
	{
		int l=0;
		for (int i=0; ;i++) 
		{
			try{
				a.charAt(i);
				l++;
			}
			catch(StringIndexOutOfBoundsException z)
			{
				break;
			}
		}
		return l;
	}
}

class Length
{
	public static void main(String[] args) 
	{
		String name ="Gaurav";
		String name1= new String("Gaurav");

		System.out.println(name.length());
		System.out.println(name1.length());
	}
}