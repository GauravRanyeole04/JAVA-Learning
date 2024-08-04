import java.util.*;
class MinimumElement
{
	public static void main(String[] args) 
	{
		String str = "Hello My name is Gaurav Ranyeole as Well as Sunny Ranyeole  ";
		String [] arr = str.split(" ");

		// boolean [] tracing = new boolean[arr.length];

		int min = Integer.MAX_VALUE;
		String op = "";

		for (String string : arr) 
		{
			int count = 0;
			for (int i=0;i<arr.length;i++) 
			{
				if (string.equals(arr[i]) ) 
				{
					count++;
					// tracing[i] = true ;
				}
			}
			if(count>0)
			{
				if (min>count) 
				{
					min=count;
					op=string;
				}
			}
		}
		System.out.println(op+" : "+min);
	}
} 