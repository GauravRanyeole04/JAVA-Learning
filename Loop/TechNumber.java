import java.util.*;
class TechNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter a Number : ");
		int num=sc.nextInt();
		int dup=num;
		int length=0;
		int div=1;
		while(num!=0){
			length++;
			num/=10;
		}
		if(length%2==0)
		{
			for(int i=1;i<=length/2;i++)
			{
				div=div*10;
			}
			int firsthalf=dup/div;
			int secondhalf=dup%div;
			int sum=firsthalf+secondhalf;
			int sqr=sum*sum;
			System.out.println(sqr==dup?" TechNumber":" Not a TechNumber");
		}
		else {
			System.out.print(" It's cannot seperate , It's Not A TechNumber");
		}
	}
}