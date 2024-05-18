	import java.util.Scanner;
	class LadderAssign
	{
		public static void main(String [] args) 
		{
			int age;
			double height;
			double weight;

			Scanner sc= new Scanner(System.in);
			System.out.print(" Enter Your Age : ");
			age=sc.nextInt();
			
			
			if (age>=18)
			{
				System.out.print(" Enter your height : ");
				height=sc.nextDouble();

				if (height>=162)
				{
					System.out.print(" Enter your Weight : ");
					weight=sc.nextDouble();
					if (weight>=56)
					{
						System.out.println(" You are Eligibel for Join Army");
					}
				}
			}
			else 
			{
				System.out.println(" You Are NOT Eligibel for Join Army");
				System.out.print(" wait for "+(18-age)+" Years.");
			}
		}
	}

	class BloodDonation
	{
		public static void main(String [] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print(" Enter your Age : ");
			int age=sc.nextInt();
			if(age>=20)
			{
				System.out.print(" Are you Consume Alcohol in last 24 hrs. : ");
				String alch=sc.next().toUpperCase();
				if(alch.equals("NO"))
				{
					System.out.print(" Enter Your Weight : ");
					Double weight=sc.nextDouble();
					if(weight>=50)
					{
						System.out.println(" You are Eligibel For Blood Donate ");
					}
					else {
						System.out.print(" Not Eligibel - Eat and Gain Your Weight first ");
					}
				}
				else {
					System.out.print(" Drunk Guy ... Not Eligibel Here");
				}
			}	
			else {
				System.out.println(" You Are Not Eligibel for Blood Donation");
			}
		}
	}

	class BloodDonation2
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print(" Enter your Age : ");
			int age=sc.nextInt();
			if (age<20)
			{
				System.out.print(" You Are Not Eligibel");
			}
			else
			{
				System.out.print(" Are You Consume Alcohol in last 24 hrs. (yes/no): ");
				String alch=sc.next().toUpperCase();
				if(alch.equals("NO"))
				{
					System.out.print(" Enter your Weight : ");
					double weight=sc.nextDouble();
					if (weight>=50)
					{
						System.out.print(" You are eligibel For Blood Donate");
					}
					else {
						System.out.print(" you can't donate blood you need to gain your Weight");
					}
				}
				else {
					System.out.print(" you are Consume Alcohol you Can't Donate Blood for 24 hrs.");
				}
			}
		}
	}

	class Number
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner (System.in);
			System.out.print(" Enter Number : ");
			double num =sc.nextDouble();
			
			if(num<0)
			{
				System.out.print(num+" is Negative Number.");
			}
			else if (num>0)
			{
				System.out.print(num +" is positive Number.");
			}
			else 
			{
				System.out.print(num +" is Always Neutral Number.");
			}
		}
	}

class Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Percentage : ");
		double percent=sc.nextDouble();

		if(percent<35)
		{
			System.out.print(" You Are Failed, you got ");
	 	}
		else if (percent<60)
		{
			System.out.print(" You get 'B' Grade with ");
		}
			else if (percent<=75)
			{
				System.out.print(" You get 'A' Grade with ");
			}
			else if(percent<90)
			{ 
				System.out.print(" You get 'A+' Grade with  ");
			}
			else if(percent<=100)
			{
				System.out.print(" You get Distinction in Exam with ");
			}
			else {
				System.out.print(" Invalid Input");
			}
			System.out.print(percent +" %");
	}
}

class Votting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Welcome for Votting ");
		System.out.print(" Enter your Age : ");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println(" You are NOT Eligibel.");
		}
		else if (age>=18)
		{
			System.out.print(" Are You want to vote or Not : ");
			String able=sc.next().toUpperCase();
			if(able.equals("YES"))
			{
			System.out.println(" 1.BJP");
			System.out.println(" 2.CONGRESS");
			System.out.print(" Enter your Vote : ");
			String vote=sc.next().toUpperCase();

				 if (vote.equals("BJP"))
				 {
				 	System.out.print(" You Are Done vote With "+vote );
				 }
				 else if(vote.equals("CONGRESS"))
				 {
				 	System.out.print(" You Are Done vote With "+vote);
				 }

			else {
		 	System.out.print(" Invalid Input");
		 	}
			}
			else{
				System.out.print(" Thank You!");
			}
		}
	}
}

	
