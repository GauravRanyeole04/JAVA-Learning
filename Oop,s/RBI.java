abstract class RBI
{
	RBI()
	{
		super();
	}
	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositeLimit();
}

abstract class SBI extends RBI
{
	String userName;
	String accType;
	SBI(String userName,String accType)
	{
		super();
		this.userName=userName;
		this.accType=accType;
	}

	void displayDetails()
	{
		System.out.println("Account Holder Name : "+userName);
		System.out.println("Account Type : "+accType);
	}
}

class Saving extends SBI
{
	Saving(String userName, String accType)
	{
		super(userName,accType);
	}

	void rateOfInterest()
	{
		System.out.println("Rate Of Interest : "+8.5+" %");
	}
	void withdrawLimit()
	{
		System.out.println("Withdraw Limit : "+50000+" rs.");
	}
	void depositeLimit()
	{
		System.out.println("Deposite Limit : "+100000+" rs.");
	}
}

class Current extends SBI
{
	Current(String userName , String accType)
	{
		super(userName,accType);
	}

	void rateOfInterest()
	{
		System.out.println("Rate Of Interest : "+6.5+" %");
	}
	void withdrawLimit()
	{
		System.out.println("Withdraw Limit : "+50+" Thousand.");
	}
	void depositeLimit()
	{
		System.out.println("Deposite Limit : "+10+" lakh.");
	}
}

class SbiDriver 
{
	public static void main(String[] args) 
	{
		System.out.println();
		Saving obj = new Saving("Gaurav","Saving");
		System.out.println("*** Saving Account Details ***");
		obj.displayDetails();
		obj.rateOfInterest();
		obj.withdrawLimit();
		obj.depositeLimit();

		System.out.println();
		Current obj1 = new Current("Sunny","Current");
		System.out.println("*** Current Account Details ***");
		obj1.displayDetails();
		obj1.rateOfInterest();
		obj1.withdrawLimit();
		obj1.depositeLimit();


	}
}