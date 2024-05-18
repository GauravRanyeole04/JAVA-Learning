import java.util.*;
class Bank
{	
	static String name;
	static String add;
	static String bal;
	static long mobile;
	static long adhar;
	static double amount;
	static int pin; 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println();
		System.out.println("-----------------");
		System.out.println("**** WELCOME ****");
		System.out.println("-----------------");

			
			
			for (; ; ) {
			System.out.print(" 1.Create New Account   ");
			System.out.println(" 2.Existing User  ");
			System.out.print(" Enter the Option : ");
			int user=sc.nextInt();
			System.out.println();

		
			switch(user)
			{
				case 1:
				{
					sc.nextLine();
					System.out.print(" Enter Your Name : ");
					name=sc.nextLine();
					System.out.print(" Enter Your Mobile No. : ");
					mobile=sc.nextLong();
					sc.nextLine();
					System.out.print(" Enter Your Address : ");
					add=sc.nextLine();
					System.out.print(" Enter Your Adhar Card No. : ");
					adhar=sc.nextLong();
					System.out.print(" Set Your UPI pin : ");
					pin=sc.nextInt();
					System.out.print(" Enter Deposite Amount : ");
					amount=sc.nextDouble();
					System.out.print(" Your Account Succesfully Gererated.");
					System.out.println(" Thank You!!!");
					System.out.println();
					break ;
				}

				case 2:
				{
					System.out.print("**** Services ****");
					System.out.println();
					for (; ; ) {
					System.out.print(" 1.Check Balance ");
					System.out.print(" 2.Deposit Amount");
					System.out.print(" 3.Withdraw Amount");
					System.out.print(" 4.Account Information ");
					System.out.print(" 5.Reset Your UPI pin");
					System.out.println(" 6.Log Out");
					System.out.print(" Enter Option : ");
					int option=sc.nextInt();
					System.out.println();

					switch(option)
					{
					case 1:{
						System.out.print(" Enter UPI Pin-");
						int pin1=sc.nextInt();
						if(pin1==pin){
						System.out.println(" Account Balance : "+amount);
						System.out.println();
						}else {
							System.out.println(" Wrong Pin Entered.");
							System.out.println();
							System.out.print(" Enter pin again -  ");
							int pin2=sc.nextInt();
							if(pin1==pin)
							{
								System.out.println(" Account Balance : "+amount);
							}
							else {
								System.out.println(" Reset Your Pin ");
								System.out.println();
							}
						}
						break;
					}
					case 2:{
						System.out.print(" Deposite Amount : ");
						double dep=sc.nextDouble();
					
						 System.out.println(" Amount Credited Succesfully");
						 amount=amount+dep;
						 System.out.print(" Are you want to check Balance (yes /No):");
						 bal=sc.next().toUpperCase();
						 if(bal.equals("YES"))
						 {
						 	System.out.println("your ACC.Balance is - "+amount);
						 	System.out.println();
						 }else {
						 	System.out.println("Thank You!!");
						 	System.out.println();
						 }
						break;
					} 
					case 3: {
						System.out.print(" Enter UPI Pin- ");
						int pin3=sc.nextInt();
						if(pin3==pin){
						System.out.print(" Withdraw Amount : ");
						double withdraw=sc.nextDouble();
						if(amount<withdraw){
							System.out.println(" Insufficient Balance.");
						}
						 amount=amount-withdraw;
						}else{
							System.out.println(" Wrong Pin Entered");
						}
						break;
					}
					case 4:{
						System.out.println(" Acc.Holder Name - "+name);
						System.out.println(" Adhar Card No. - "+adhar);
						System.out.println(" Mobile No. - "+mobile);
						System.out.println();
						break;
					}
					case 5:{
						System.out.print(" RESET your UPI Pin - ");
						int reset =sc.nextInt();
						
						pin=reset;
						System.out.println(" Pin Update Succesfully ");
						break;
					}
					case 6:{
						System.exit(0);

					}
					break;
				}
			}
		
			}
		}
		}
	}
}