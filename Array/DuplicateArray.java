class DuplicateArray
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,3,4,5,5,6,6,2};
		int duplicateNo=0;
		for (int i=0;i<arr.length;i++) 
		{
			int count =1;
			for (int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element : "+arr[j]);
					count ++;
				}
			}
			if(count>=2)
			{
				duplicateNo++;
			}
		}
		System.out.println("Duplicate Number's count : " + duplicateNo);

	}
}