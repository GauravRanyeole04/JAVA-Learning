// import java.util.*;
// class codePointAt
// {
// 	public static void main(String[] args) 
// 	{
// 		String str = new String("ABCDE");
	
// 		for (int i=0;i<str.length();i++) 
// 		{
// 			System.out.println(str.charAt(i)+" : "+str.codePointAt(i));
// 		}
// 	}
// }

class UserCodePointAt
{
	static String str = new String("ABCDEF");
	public static void main(String[] args) 
	{
		int indx=userCodePointAt(1);
		System.out.println(str+" : "+indx);
	}
	public static int userCodePointAt(int indx)
	{
		if(indx<0 || indx>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong Index : "+indx);
		}
		return str.charAt(indx);
	}
}