import java.util.Scanner;
class WaterEnergy
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter amount of Water in Kilogram : ");
		double water=sc.nextDouble();
		System.out.print(" Enter the intial temperature :");
		double inTemp=sc.nextDouble();
		System.out.print(" Enter the final temperature : ");
		double flTemp=sc.nextDouble();
		System.out.print(" The energy needed is "+water*(flTemp-inTemp)*4184+" joules. ");
	 }
}