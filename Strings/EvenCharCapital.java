class EvenCharCapital
{
	public static void main(String[] args) 
	{
		String str= abcdef;
		String op="";

		char [] arr = new char[str.length];
		int itt=0;
		for (int i=0;i<str.length;i++) 
		{
			arr[itt++]=str.charAt(i);
		}
		System.out.println(arr);
	}
}