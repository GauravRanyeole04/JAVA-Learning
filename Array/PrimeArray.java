import java.util.*;   //write a java program to fetch prime numbers in an array  
class PrimeArray 
{
	public static void main(String[] args) 
	{
		int arr [] = {2,3,4,5,6,7,8,9};
		for (int i=0;i<arr.length;i++) 
		{			//3 < 8
			boolean flag=true;
			for (int j=2;j<arr[i];j++) 
			{			//5<5
				if(arr[i]%j==0)
				{	//5%4==0
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(arr[i]);//2 3 5
			}
		}
	}
}