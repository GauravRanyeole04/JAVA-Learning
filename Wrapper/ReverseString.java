import java.util.Arrays;
class ReverseString
{
	public static void main(String[] args) 
	{
		String str=args[0];
		String uStr = new StringBuffer(str).reverse().toString();
		System.out.println(str+" : "+uStr);
	}
} 