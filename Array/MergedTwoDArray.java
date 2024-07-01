import java.util.Arrays;
class MergedTwoDArray
{
	public static void main(String[] args) 
	{
		int [][] arr={{10,20,30},{40,50,60,70},{80,90}};

		//to get the length of 2d array
		int len=0;
		for (int []i:arr) 
		{
			len+=arr.length;
		}

		//new array created using length 
		int [] arr1=new int[len];
		int indx=0;

		//iterating 2d array using for each and int i element 
		for(int []i:arr)
		{
			for(int j:i)
			{
				arr1[indx++]=j;
			}
		}

		//print using toString()
		System.out.println(Arrays.toString(arr1));
	}
}