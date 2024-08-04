import java.util.*;
class DistinctElement
{
	public static void main(String[] args) 
	{
		String str = "Gaurav Rohidas Ranyeole is Gaurav Rohidas Ranyeole";
		String [] arr = str.split(" ");
		boolean [] tracing = new boolean[arr.length];

		for (String string : arr) 
		{
			int count = 0;
			for (int i=0;i<arr.length;i++) 
			{
				if(string.equals(arr[i]) && !(tracing[i]))
				{
					count++;
					tracing[i] = true ;
				}
			}
			if(count>0)
			{
				System.out.println(string );
			}
		}
	}
}