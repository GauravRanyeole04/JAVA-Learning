import java.util.Scanner;
class UserToUpperCaseMethod 
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		str=sc.nextLine();
		String op=userToUpperCaseMethod();
		System.out.println(str+" : "+op);
	}

	public static String userToUpperCaseMethod()
	{
		String nstr="";
		for (int i=0;i<str.length();i++) 
		{
			char ch =str.charAt(i);
			if(ch>=97 && ch<=122)
			{
				nstr=nstr+ (char)(ch-32);
			}
			else{
				nstr = nstr+ch;
			}
		}
		return nstr;
	}
}






class ToUpperCaseMethod
{
	public static void main(String[] args) 
	{
		String str="sunny";
		System.out.println(str.toUpperCase());
	}
}