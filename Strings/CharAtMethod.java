import java.util.*;
class CharAtMethod 
{
	static String str = "Gaurav";
	public static void main(String[] args) 
	{
		for (int i=0;i<str.length();i++)
		{
			System.out.print(userCharAt(i)+" ");
		}
	}

	public static char userCharAt(int indx)
	{
		if(indx<0 || indx>=str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong Index");
		}
		char [] arr = new char[str.length()];
		for (int i=0;i<str.length();i++) 
		{
			arr[i]=str.charAt(i);
		}
		return arr[indx];
	}
}

class CharAt
{
	public static void main(String[] args) 
	{
		String name=new String("Sunny");
		System.out.println(name.charAt(0));  //s
		System.out.println(name.charAt(name.length()-1));  //y
		System.out.println(name.charAt(1));  //u
		// System.out.println(name.charAt(-1));  //StringIndexException
		// System.out.println(name.charAt(name.length()));  //StringIndexException
	}
}