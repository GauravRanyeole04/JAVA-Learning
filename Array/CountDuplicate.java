class CountDuplicate
{
	public static void main(String[] args) {
		int [] arr = {1, 2, 2, 3, 4, 1, 5, 6, 7, 6};
		int duplicateNumber = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 1;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count >= 2)
			{
				duplicateNumber++;
			}
		}

		System.out.println("Duplicate count : " + duplicateNumber);
	}
}