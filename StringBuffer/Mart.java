import java.util.Arrays;
import java.util.Scanner;
class Mart
{
	StringBuffer fruits = new StringBuffer();
	Scanner sc = new Scanner(System.in);

	public void addFruits()
	{
		System.out.println("Add Fruits : ");
		for (int i=1;i<=6;i++) 
		{
			fruits.append(sc.next()+" ");
		}
		System.out.println("*************");
	}

	public void buyFruits()
	{
		System.out.println("Enter the Fruit to buy : ");
		String buyFruits=sc.next();
		String converted = new String(fruits);
		String arr[] = converted.split(buyFruits);

		System.out.println();
		System.out.println("****Cart****");
		for (int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("------Thank You------");
	}
	public static void main(String[] args) 
	{
		Mart obj = new Mart();
		obj.addFruits();
		obj.buyFruits();
	}
}