import java.util.Scanner;
class Bank
{
	private String accountHolderName;
	private String address;
	private long aadharNumber;
	private String panNumber;
	private int upiPin;
	private double balance;
	private long phoneNumber;
	Scanner sc= new Scanner(System.in);
	//Bank(String accountHolderName, String address,long aadharNumber, String panNumber, int upiPin,double balance, long phoneNumber)
	Bank()
	{
		this.accountHolderName=accountHolderName;
		this.address=address;
		this.aadharNumber=aadharNumber;
		this.panNumber=panNumber;
		this.upiPin=upiPin;
		this.balance=balance;
		this.phoneNumber=phoneNumber;
	}	
    public String getAccountHolderName() 
    {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) 
    {
        this.accountHolderName = accountHolderName;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public long getAadharNumber() 
    {
        return aadharNumber;
    }
    public void setAadharNumber(long aadharNumber) 
    {
        this.aadharNumber = aadharNumber;
    }
    public String getPanNumber() 
    {
        return panNumber;
    }
    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
    public int getUpiPin() {
        return upiPin;
    }
    public void setUpiPin(int upiPin) {
        this.upiPin = upiPin;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
		public void checkBalance()
		{
			System.out.println("Your current balance is: " + balance);
	   	}
	   	public double deposit(double amount)
		{
			if (amount > 0) 
			{
            balance += amount;
            System.out.println("Deposit Successful");
        	} 
        	else 
        	{
            System.out.println("Invalid amount for deposit");
        	}
		return amount;	
	   	}
	   	public void withdraw()
		{
					System.out.println("Withdraw Amount");
	      			System.out.println();
	      			System.out.println("Enter Your Upi Pin : ");
	   				int userPin=sc.nextInt();
	   				if(userPin==upiPin)
	   				{
	   					System.out.println("Enter an Amount");
	      				double withdrawAmount=sc.nextDouble();
	   					balance-=withdrawAmount;
	   					if(withdrawAmount<=balance)
	   					{
	   					System.out.println("Amount Withdrawa Successfully.");
	   					System.out.println("Remaining Amount is : "+balance);	   			
	   					}
	   					else
	   					{
	   					System.out.println("Insufficient Balance");
	   					}
	   				}
	   				else
	   					{
	   					System.out.println("wrong upi Pin");
	  					}			
	   	}
	   	public void accountHolderInfo()
		{
			System.out.println("**** Create Account Module ****");
			System.out.println("Account Holder Name : "+accountHolderName);
			System.out.println("aadharNumber : " +aadharNumber);
			System.out.println("address : " +address);
			System.out.println("Pan Number : "+panNumber);
			System.out.println("Phone Number : "+phoneNumber);
			System.out.println("Balance : "+balance);
	   	}
}
class BankEncapsulation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Bank obj = new Bank("Shivani","pune",123456789012l,"ABCDE123455",1234,50000,9765785695l);
		Bank obj= new Bank();
		 outerloop:
	   for(; ;){
	   	System.out.println();
		System.out.println("********** Welcome to OfficialBank *********");
	   	System.out.println();
	   	System.out.println("1. Create Account");
	   	System.out.println("2. Existing Account Holder");
	   	System.out.print("Enter an Option : ");
	   	int option = sc.nextInt();
	   	System.out.println();
	   	switch(option){
	   	case 1:
	   		{
	   		System.out.println("********* Create Account ***********");
	   		sc.nextLine();
	   		 System.out.print("Enter account name :");
        	obj.setAccountHolderName(sc.nextLine());

    	    System.out.print("Enter address :");
       	    obj.setAddress(sc.nextLine());

       	    System.out.print("Enter aadhar Number : ");
       	  	obj.setAadharNumber(sc.nextLong());

       	  	sc.nextLine();
	        System.out.print("Enter panNumber : ");
       	    obj.setPanNumber(sc.nextLine());

       	    System.out.print("Enter phone Number : ");
       	  	obj.setPhoneNumber(sc.nextLong());

       	  	sc.nextLine();
    	    System.out.println("Enter Upi Pin : ");
	        obj.setUpiPin(sc.nextInt());
	        
	        System.out.print("Enter balance : ");
	        obj.setBalance(sc.nextDouble());
	   		break;
	   		}
	   	case 2:
	   		for(; ;){	
	   		{
	   		System.out.println();
			System.out.println("**** Features ****");
	   		System.out.println("1.Check Balance 2.Deposit 3.Withdraw 4.Account Holder Info 5.Logout");
	   		System.out.println();
	   		System.out.print("Enter an Option");
	   		int opt=sc.nextInt();
	   		switch(opt)
	   		{
	   			case 1:
	   				{
	   					obj.checkBalance();
	   					break;
	   				}
	   			case 2:
	   				{
	   					System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    obj.deposit(depositAmount);
					break;
	   				}
	   			case 3:
	   				{
	   					obj.withdraw();
	   					break;
	   				}
	   			case 4:
	   				{
	   					obj.accountHolderInfo();
	   					break;
	   				}
	   			case 5:
	   				{
	   					System.exit(0);
	   				}
	   			default :
	   				{
	   				System.out.println("wrong input");
	   				}
	   		}
	   	}
	   	}	
	   	case 3:
	   		{
	   			System.exit(0);
	   		}
	   	default : 
	   		{
	   			System.out.println("wrong input");

			}
		}
	}
}
}
