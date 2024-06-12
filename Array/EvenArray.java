import java .util.*;
class EvenArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10};

		//to find the count of even no in array 
		int count=0;
		for(int i:arr)
		{
			if(i%2==0)
			{
				count++;
			}
		}

		int [] evenNumbers = new int [count];
		int indx=0;
		for(int i:arr)
		{
			if(i%2==0)
			{
				evenNumbers [indx++]=i;
			}
		}
		System.out.println(Arrays.toString(evenNumbers));
	}
}

class OddArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11};

		int count=0;
		for(int i:arr)
		{
			if(i%2!=0)
			{
				count++;
			}
		}

		int [] oddNumbers = new int [count];
		int indx=0;
		for(int i:arr)
		{
			if(i%2!=0)
			{
				oddNumbers [indx++]=i;
			}
		}
		System.out.println(Arrays.toString(oddNumbers));
	}
}