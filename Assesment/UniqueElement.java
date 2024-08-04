import java.util.*;
class UniqueElement
{
	public static void main(String[] args) 
	{
		String str = "Gaurav Rohidas Ranyeole ";
		String [] arr = str.split(" ");

		boolean [] tracing = new boolean[arr.length];

		for (String string : arr ) 
		{
			int count = 0;
			for (int i=0;i<arr.length;i++) 
			{
				if(string.equals(arr[i]) && !(tracing[i]))
				{
					count++;
					tracing[i] = true;
				}
			}
			if (count == 1 ) 
			{
				System.out.println(string +" : "+ count);
			}
		}
	}
}