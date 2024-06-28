import java.util.*;
class ReplacedMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String : ");
		String s=sc.next().toLowerCase();
		System.out.println("Enter char to replace : ");
		char ch= sc.next().charAt(0);
		System.out.println("Enter new Char : ");
		char ch2 = sc.next().charAt(0);

		String replace=s.replace(ch,ch2);
		System.out.println(s+" : "+replace);
	}
}