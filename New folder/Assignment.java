import java.util.Scanner;
// adsition of 3 number digit
class Assignment
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Three Digit Number : ");
		int num=sc.nextInt();
		int dup=num;
	 	int sum=0;
	 	sum = sum+num%10;
		num =num/10;
		sum = sum+num%10;
		num =num/10;
		sum = sum+num%10;
	 	System.out.print("The Adiition OF "+dup+" is "+sum);
	 }
}

//to find number id even or odd 
class Assignment2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num1=sc.nextInt();
		System.out.print((num1%2==0)?"Even":"odd");	
	}
}

//to find the large number between 2 
class Assignment3
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter 1 st Number : ");
		int num1=sc.nextInt();
		System.out.print(" Enter 2 nd Number : ");
		int num2=sc.nextInt();
		System.out.print((num1>=num2)?num1+" is greater than "+num2:num2+" is greater than "+num1);
	}
}

//to find small number btween 2 
class Assignment4
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter 1 st Number : ");
		int num1=sc.nextInt();
		System.out.print(" Enter 2 nd Number : ");
		int num2=sc.nextInt();
		System.out.print((num1<=num2)?num1+" is less than "+num2:num2+" is less than "+num1);
	}
}

//To find lagre number between 3 
class Assignment5
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter 1 st Number : ");
		int num1=sc.nextInt();
		System.out.print(" Enter 2 nd Number : ");
		int num2=sc.nextInt();
		System.out.print( "Enter 3 rd Number : ");
		int num3=sc.nextInt();
	    int num=((num1<num2)?num2:num1);
		System.out.print((num<=num3)?num3:num);
	}
}

//To find the char is Alphabet or not 
class Assignment6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value (aplphabet) : ");
		char a=sc.next().charAt(0);
		System.out.println((a>=65&&a<=90)||(a>=97&&a<=122)?"Aplphabet":"Not An Alphabet");
	}
}

//To find the Given no is Digit or not  
class Assignment7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value (digit) : ");
		char a=sc.next().charAt(0);
		System.out.println((a>=47&&a<=56)?" it's a Digit":"it's a Not Digit");
	}
}

//to find the alphabet is upper case or lower case
class Assignment8
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Aplphabet : ");
		char a=sc.next().charAt(0);
		String b=((a>=47&&a<=56)?"its digit":"it's an Lower Case Alphabet");
		System.out.print((a>=65&&a<=90)?"it's an Upper Case Aplphabet":b);
	}
}

//to find char is vowel or consonent 
class Assignment9
{	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Character : ");
		String name = sc.next().toLowerCase();
		char s= name.charAt(0);
		System.out.print((s=='a'||s=='e'||s=='i'||s=='o'||s=='u')?"it's Vowel":"it's Consonants");
	}
}







