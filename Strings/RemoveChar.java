import java.util.Scanner;
class RemoveChar   //replece with "  "
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String : ");
		String s=sc.next().toLowerCase();
		System.out.println("Enter char to remove : ");
		String ch= sc.next();

		String replace=s.replace(ch,"");
		System.out.println(replace);

	}
}