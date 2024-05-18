import java.util.*;
class PhonePay
{
	String name;
	long phoneNumber ;
	private double balance;
	int pin ;

	PhonePay(String name , long phoneNumber, double balance , int pin )
	{
		this.name=name ;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
		this.pin=pin;
	}

	public double getBalance(int upin)
	{
		if (upin == this.pin)
		{
			return balance;
		}else{
			return 0;
		}
	}

	void displayInfo()
	{
		System.out.println(" Name : "+name);
		System.out.println(" PhoneNumber : "+phoneNumber);
		System.out.println(" Balance : "+balance);
		System.out.println(" Pin : "+pin);
	}
}

class PhonePayDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PhonePay obj=new PhonePay("Gaurav",9172030595l,64000,6650);
		System.out.println("Enter your Upin : ");
		int upin =sc.nextInt(); 
		System.out.println(obj.getBalance(upin));
		// obj.displayInfo();
		System.out.println(balance);
	}
}