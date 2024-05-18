import java.util.*;
class Paytm 
{
	String name;
	String add;
	long mobileNo;
	private double balance;
	int pin=6650;

	Paytm(String name,String add , Long mobileNo , double balance)
	{
		this.name=name;
		this.add=add;
		this.mobileNo=mobileNo;
		this.balance=balance;
	}
	void displayInfo()
	{
		System.out.println("Name : "+name); 
		System.out.println("Address : "+add);
		System.out.println("Mobile No. : "+mobileNo);
		System.out.println("Balance : "+balance);
	}

	double getBalance(int upin)
	{
		if (pin==upin)
		{
			return balance;
			// System.out.println(balance);
		}else 
		{
			return 0;
		}
	}
}

class PaytmDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Your pin : ");
		int upin=sc.nextInt();
		Paytm obj=new Paytm("Gaurav","Navnath nagar",9172050595l,64000-1000);
		System.out.println(obj.getBalance(upin));
	}
}