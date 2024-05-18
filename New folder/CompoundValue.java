import java.util.Scanner;
class CompoundValue
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Monthly Saving Amount : ");
        double saving=sc.nextDouble();
        System.out.print("Enter month :");
        double month=sc.nextDouble();

        double interest=0.05/12;
        
        double add=0;

        add=(saving+add)*(1+0.00417);
        add=(saving+add)*(1+0.00417);
        add=(saving+add)*(1+0.00417);
        add=(saving+add)*(1+0.00417);
        add=(saving+add)*(1+0.00417);
        add=(saving+add)*(1+0.00417);
        

        System.out.print(" The account value is "+add);	 
	 }
}