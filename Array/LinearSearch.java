class LinearSearch
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int target =3;

		int indx=getIndx(arr , target);
		if (indx==-1)
		{
			System.out.println("Element Not Found");
		}
		else{
			System.out.println("Element found at : "+indx);
		}
	}

	public static int getIndx(int [] arr ,int target)
	{
		for (int i=0;i<arr.length;i++) 
		{
			if (arr[i]==target) 
			{
				return i ;
			}
		}

		return -1;
	}
}