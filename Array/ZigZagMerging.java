import java.util.Arrays;
class ZigZagMerging 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3};
		int [] b = {4,5,6,7,8,9};

		//creating new array using both arrays length
		int [] narr=new int[(a.length)+(b.length)];

		//creating a loop which will iterate till largest array length
		for (int i=0,j=0;i<b.length;i++) 
		{	//check if index is less than i or else AIOOBE
			if (i<a.length) 
			{
				narr[j++] = a[i];
			}
			//Storing element directly from bigger length array
			narr[j++] = b[i];
		}
		System.out.println(Arrays.toString(narr));
	}
}