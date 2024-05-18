import java.util.*;
class DoWhile   //1 to 10 
{
	public static void main(String[] args) {
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
	}
} 

class DoWhile2  //a to z
{
	public static void main(String[] args) {
		char i=97;
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=122);
	}
}

class Pin
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		int attempt=1;
		outerloop:
		for (; ; ) 
		{
			int storedpin=6650;
			int count=3;

			do{
				System.out.print(" Enter pin :");
				int newpin=sc.nextInt();

				if(newpin==storedpin) 
				{
					System.out.print(" WELCOME");
					break outerloop;
				}else{
					System.out.println(" Worng pin. Attempts left- "+(count-1));	
				}
				if(count==1){
					Thread.sleep(5000);
					System.out.println(" You can try to enter your pin again ");
				}
				count--;

			  }	while(count>=1);

			  if(attempt++==2){
			  	break outerloop;
			  }	
		}
		
	}
}
	
