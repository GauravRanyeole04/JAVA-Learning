import java.util.Scanner ;				//(1234__7-->56)
class Example1		
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		String str = ""+num;
		for (char i = str.charAt(0);i<=(str.charAt(str.length()-1));i++) 
		{
			if(!(str.contains(""+i)))
			{
				System.out.print(i);
			}	
		}
	}
}