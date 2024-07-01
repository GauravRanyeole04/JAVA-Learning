import java.util.*;
class FruitStore
{
	String fruits[];
	static Scanner sc = new Scanner(System.in);
	public void storeFruit(String fruits[])
	{
		this.fruits=fruits;

		for (int i=0;i<fruits.length;i++) 
		{
			fruits[i]=sc.next();
		}
	}

	public void displayFruits()
	{
		System.out.println(Arrays.toString(fruits));
	}

	public void changeFruit()
	{
		System.out.println("Enter the Fruit to change : ");
		String inputFruit=sc.next();

		for(int i=0;i<fruits.length;i++)
		{
			if (inputFruit.equals(fruits[i])) 
			{
				System.out.println("Matches");
				System.out.print("Enter a new fruit to update : ");
				String newfruit=sc.next();
				fruits[i]=newfruit;
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		FruitStore obj = new FruitStore();

		// System.out.print("Enter the array Size : ");
		// int size=sc.nextInt();

		// System.out.println("Enter the Fruits : ");
		// String fruits[]=new String[size];

		// obj.storeFruit(fruits);
		// obj.displayFruits();
		// obj.changeFruit();
		// obj.displayFruits();

		boolean flag=true;
		while(flag)
		{
			System.out.println("1.Store Fruit.");
			System.out.println("2.Display Fruit.");
			System.out.println("3.change Fruit.");
			System.out.println("4.Exit");
			System.out.println("Enter an Option : ");
		}




	}
}