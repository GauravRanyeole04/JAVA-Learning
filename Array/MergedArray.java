import java.util.Arrays;
class MergedArray
{
	public static void main(String[] args) 
	{
		int arr1[]={4,5,2,2};
		int arr2[]={1,5,8,2,1};

		int arr3[]=new int[(arr1.length)+(arr2.length)];

		int indx=0;
		for (int i=0;i<arr1.length;i++) 
		{
			arr3[indx++]=arr1[i];
		}
		for (int i=0;i<arr2.length;i++) 
		{
			arr3[indx++]=arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
	}
}