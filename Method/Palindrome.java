import java.util.*;
class Palindrome 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter the Number :");
		int num=sc.nextInt();

		int rev= reverseNum(num);
		// System.out.print(reverseNum(num));
		int pail=palindrome(num,rev);

	}

	public static int reverseNum(int num)
	{
		int rev=0;
		while (num>0)
		 {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}

	public static int palindrome(int num,int rev)
	{
		if(num==rev){
			System.out.print(num+" is a Palindrome Number ");
		}else {
			System.out.print(num+" is not a Palindrome Number");
		}
			return rev;
	
	}
}