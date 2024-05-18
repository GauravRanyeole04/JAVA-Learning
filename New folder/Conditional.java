import java.util.Scanner;
class Conditional
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=sc.nextInt();
		System.out.println((num%2==0)?"even":"odd");

	}
}
class MinMaxValue
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the 1 st value : ");
		int num1= sc.nextInt();
		System.out.print("enter the 2 nd value : ");
		int num2= sc.nextInt();
		System.out.println((num1>num2)?num2 :num1);
	}
}

//wherther char is  alphabet or not 

class Alphabet 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char a=sc.next().charAt(0);
		System.out.println((a>=65&&a<=90)||(a>=97&&a<=122)?"Aplphabet": "Not An Alphabet");
	}
}