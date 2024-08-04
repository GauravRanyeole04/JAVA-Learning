import java.util.*;
class FrequencyOfElement 
{
	public static void main(String[] args) 
	{
		String str = "Hi My name is Gaurav Hi My name is Gaurav";
		String [] arr = str.split(" ");

		boolean [] tracing = new boolean[arr.length];

		for (String string : arr ) 
		{
			int count =0;
			for (int i=0;i<arr.length;i++) 
			{
				if (string.equals(arr[i])&& !(tracing[i])) 
				{
					count++;
					tracing[i] = true;
				}
			}
			if (count >0) 
			{
				System.out.println(string+" : "+count);
			}
		}

	}
}