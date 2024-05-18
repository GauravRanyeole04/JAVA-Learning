import java.util.*;
class SunnyNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		boolean flag=false;
		int sqrrt=0;

		int sum=num+1;
		for (int i=1;i<=num/2 ;i++ ) {
			if (i*i==sum){
				flag=true;
				sqrrt=i;
				break;
			}
		}
			if (flag)
			{
				System.out.print(num +" is a Sunny Number ");
			}
			else {
				System.out.print(num+" is Not a Sunny Number  ");
			}
		
	}
}

class SpyNumber 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number: ");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		int prdt=1;

		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			prdt=prdt*rem;
			num/=10;
		}
		System.out.println((prdt==sum)?dup+" Spy Number":dup+" Not a Spy Number");
	}
}

class BuzzNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number: ");
		int num=sc.nextInt();
		// if ((num%10==7)||(num%7==0)){
		// 	System.out.print(num+" is a Buzz Number ");
		// }else{
		// 	System.out.print(num+" is not a Buzz Number ");
		// }
		System.out.print(((num%10==7)||(num%7==0))?num+" is a Buzz Number ":num+" is a Not Buzz Number ");
	}
}

class DuckNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Number: ");
		String num=sc.next();
		if (num.charAt(0)=='0')
		{
			System.out.print(num+" is Not a Duck Number");
		}else {
			System.out.print(num+ " is a Duck Number");
		}
	}
}

class Sum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter the Nummber : ");
		int num=sc.nextInt();
		int sum=0;

		for(int i=num;num>0;num/=10)
		{
			int rem=num%10;
			sum=sum+rem;
		}
		System.out.print(sum);
	}
}


class Sum2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter the Number : ");
		int num=sc.nextInt();
		int sum=0;

			while (num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				num/=10;
			}
			System.out.print(sum);
		}
}
	
// class FacinatingNumber
// {
// 	public static void main(String[] args) {
// 		int num=324;
// 		int num2=num*2;
// 		int num3=num*3;

// 	}
// }