import java.util.*;
class NeonNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a Number : ");
		int num=sc.nextInt();
		int sqr=num*num;
		int sum=0;
		

		while(sqr>0)
		{
			int rem=sqr%10;
			sum=rem+sum;
			sqr/=10;	
		}
		System.out.print((num==sum)?num +" Neon Number": num +" Not a Neon Number");
	}
}


class Sqrrt
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a Number : ");
		int num=sc.nextInt();
		boolean flag=false;
		int sqqrt=0;

		for (int i=1;i<=num/2 ;i++ ) {
			if (i*i==num)
			{
				flag=true;
				sqqrt=i;
				break;
			}
		}
		if(flag){
			System.out.println(sqqrt+" perfect Sqqrt of "+num);
		}else{
			System.out.println(num+" do Not have a Perfect Sqqrt ");
		}
	}
}