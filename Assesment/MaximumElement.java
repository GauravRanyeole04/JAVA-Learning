import java.util.*;
class MaximumElement
{
	public static void main(String[] args) 
	{
		String str = "Hello my Name is Hello is is ";
		String [] arr = str.split(" ");

		int max = Integer.MIN_VALUE;
		String op="";

		boolean [] tracing = new boolean[arr.length];
		
		for (String string  : arr) 
		{
			int count =0;
			for (int i=0;i<arr.length;i++) 
			{
				if(string.equals(arr[i]) && !(tracing[i]))
				{
					count ++;
					tracing[i] = true ;
				}				
			}
			if (count>0) 
			{
				if (max<count)
				{
					max=count;
					op=string;
				}
			}
		}
		System.out.println(op+" : "+max);		
	}
}