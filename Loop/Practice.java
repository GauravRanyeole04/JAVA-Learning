 import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ ) 
		{
			for (int j=1;j<=5;j++)
			{
			System.out.print("* ");	
			}
		 System.out.println();
		}
	}
}

class Practice2 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++) 
		{
			for (int j=1;j<=i;j++ ) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

// class Practice3
// {
// 	public static void main(String[] args) 
// 	{
// 		for (int i=1; i<=5;i++ ) 
// 		{
// 			for (int j=1; j<=i ;j++) 
// 			{
// 				System.out.print(j+" ");	
// 			}
// 			System.out.println();	
// 		}
// 	}
// }

class Practice4
{
	public static void main(String[] args) 
	{
		int num=1;
		for (int i=1;i<=5;i++ ) 
		{
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(num+" ");
				num+=1;
			}
			System.out.println();
		}
	}
}

class Practice5
{
	public static void main(String[]args)
	{

		for (int i=1;i<=5;i++ ) 
		{
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}

class Practice6
{
	public static void main(String[] args) 
	{
		char ch=97;
		for (int i=1;i<=5 ;i++ ) 
		{	
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(ch++ +" ");
			}
		  System.out.println();
		}
		
	}
}

class Practice7
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=5 ;i++ ) 
		{
			char ch=97;
			for (int j=1;j<=i ;j++ ) 
			{
				System.out.print(ch++ +" ");
			}	
			System.out.println();
		}
	}
 }



 class Practice8 
 {
 	public static void main(String[]args)
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.print(" Enter Your Team : ");
 		String team=sc.next().toLowerCase();
 		switch(team)
 		{
 		case "mi":System.out.print(" Definitely Won");break;
 		case "Punjab Kings ":
 		case "KKR":
 		case "rcb":System.out.print(" you might be won ");break;
 		default: System.out.print(" You Definitely loss");
 		} 
 	}
 }



 // class Ipl
 // {
 // 	public static void main(String[] args) 
 // 	{
 // 		Scanner sc=new Scanner(System.in);
 // 		System.out.print(" Enter Your Favourite Team of IPL: ");
 // 		String team=sc.next().toUpperCase();

 // 		m1(team);
 // 	}
 		
 // 		public static void m1(String team)
 // 		{
 // 			if (team.equals("MI"))
 // 		{
 // 			System.out.println("Mi won 5 times."); 
 // 			System.out.println("1. 2013 ");
 // 			System.out.println("2. 2015 ");
 // 			System.out.println("3. 2017 ");
 // 			System.out.println("4. 2019 ");
// 			System.out.println("5. 2020 ");
 // 		}
 // 		else if (team.equals("CSK"))
 // 		{
 // 			System.out.println("CSK won 5 times.");
 // 			System.out.println("1. 2010");
 // 			System.out.println("2. 2011");
 // 			System.out.println("3. 2018");
 // 			System.out.println("4. 2021");
 // 			System.out.println("5. 2023");
 // 		}
 // 		else if (team.equals("RCB"))
 // 		{
 // 			System.out.println(" You must do practice and win.");
 // 		}
 // 		else if (team.equals("KKR"))
 // 		{
 // 			System.out.println("KKR won 2 times.");
 // 			System.out.println("1. 2012");
 // 			System.out.println("5. 2014");
 // 		}
 // 		else if (team.equals("GT"))
 // 		{
 // 			System.out.println("Gujrat Won 1 time.");
 // 			System.out.println("1. 2022");
 // 		}
 // 		else if(team.equals("RR"))
 // 		{
 // 			System.out.println("Rajstan Won 1 time.");
 // 			System.out.println("1. 2008");
 // 		}
 // 		else if(team.equals("SRH"))
 // 		{
 // 			System.out.println(" Hydrabad won 1 time.");
 // 			System.out.println("1. 2016");
 // 		}
 // 		else if (team.equals("DC"))
 // 		{
 // 			System.out.println(" You must do practice and win.");
 // 		}
 // 		else if (team.equals("PBSK"))
 // 		{
 // 			System.out.println(" You must do practice and win.");
 // 		}
 // 		else if (team.equals("LSG"))
 // 		{
 // 			System.out.println(" You must do practice and win.");
 // 		}else{
 // 			m2();
 // 		}
 // 		}

 // 		public static void m2()
 // 		{
 // 			System.out.print(" Plz Enter valid Team Name");
 // 			m1();
 // 		}
	 			
 	
 // }

 class LeapYear
 {
 	public static void main(String[] args) 
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.print(" Enter year : ");
 		double year=sc.nextDouble();
 		System.out.print((year%4==0&&year%100!=0)?"leap Year":"not a Leap Year" );

 	}
 }

 class Length
 {
 	public static void main(String[] args) {
 		int num=20;
 		int dup=num;
 		int length=0;
 		int power=1;
 		int update=1;
 		for (int i=1;num>0 ;num/=10 ) 
 		{
 			length++;
 		}
 		while (length>=update)
 		{
 			power=dup*power;
 			update++;
 		}
 		System.out.print(power);

 	}
 }
// for (int i=1;i<=length ;i++ ) 
// 		{
// 			power=power*dup;
// 		}
// 		System.out.println(power);


 class AmstrongNumber 
 {
 	public static void main(String[] args) 
 	{
 		int num=153;
 		int dup=num;
 		int dup1=num;
 		int length=0;
 		int sum=0;
 		

 		for(int i=num;num>0;num/=10)
 		{
 			length++;
 		}
 		
 		while(dup>0)
 		{
 			int rem=dup%10;
 			int power=1;

 			for(int i=1;i<=length;i++)
 			{
 				power=power*rem;
 			}
 			sum+=power;
 			dup/=10;
 		}
  		System.out.print((sum==dup1)?" AmstrongNumber":" Not a AmstrongNumber");
 	}
 }

class SpyNumber1
{
	public static void main(String[] args) {
		int num=132;
		int dup=num;
		int sum=0;
		int prdt=1;

		while(num!=0)
		{
			int rem=num%10;
			sum+=rem;
			prdt=prdt*rem;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(prdt);
		if (prdt==sum)
		{
			System.out.print(" spy Number");
		}else{
			System.out.print(" not a spy number ");
		}
	}
}

class Buzznumber
{
	public static void main(String[] args) {
		int num=70;
		int rem=0;

		while(num>0)
		{
		 rem=num%10;	
		 break;		
		}
		System.out.print((num%7==0||rem==7)?num+" is a Buzz Number ":num+" is Not a Buzz Number" );
	}
}

class DuckNumber 
{
	public static void main(String[] args) {
		String num="463";

		if(num.charAt(0)=='0')
		{
			System.out.print(num +" is a Duck Number ");
		}else {
			System.out.print(num+" is not a duck Number");
		}
	}
}

class Palindrome2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print(" Enter the Number :");
		int num=sc.nextInt();
		int dup=num;
		int rev=0;
		while (num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.print((dup==rev)?" Palindrome Number ": " Nt a Palindrome Number");
	}
}


class DuckNumber2
{
	public static void main(String[] args) 
	{
		int num=6036;
		int dup=num;

		while(num>0)
		{
			int rem=num%10;
			if (rem==0){
				System.out.print(dup+" is a Duck Number");
			}
			num/=10;
		}
	}
}


class AmstrongNumber3
{
	public static void main(String[] args) 
	{
		int num=153;
		int dup=num;
		int dup1=num;
		int length=0;
		int sum=0;
		while(num>0)
		{
			length++;
			num/=10;
		}
		while(dup>0)
		{
			int rem=dup%10;
			int power=1;
			for (int i=1;i<=length;i++ ) 
			{
				power=power*rem;
			}
			sum+=power;
			dup/=10;
		}
		System.out.print((sum==dup1)? " Amstrong Number":" Not Amstrong Number");
	}
}



class Prime3 
{
	public static void main(String[] args) 
	{
		int num=2;

		for(int i=2;i<=100;i++)
		{
			if (num%i==0)
			{
			System.out.print(i+" ");
			}
			num++;
		}
	}
}