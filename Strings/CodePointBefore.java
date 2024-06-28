
class CodePointBefore //this fetch the before ascii value of char
{
	public static void main(String[] args) 
	{
		String str ="Gaurav";
		System.out.println(str.codePointBefore(6));
	}
} 

class UserCodePointBefore 
{
	static String str ="ABCD";
	public static void main(String[] args) 
	{
		int indx=UserCodePointBefore(1);
		System.out.println(indx);
	}
	public static int UserCodePointBefore(int indx)
	{
		if(indx<1 || indx>str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong index : "+indx);
		}
		return str.charAt(indx-1);
	}
}