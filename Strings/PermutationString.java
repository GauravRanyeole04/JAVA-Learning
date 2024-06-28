class PermutationString 
{
	public static void printDistinctSting(String input,String result)
	{
		if (input.length()==0)
		{
			System.out.println(result+" ");
			return;
		}

		boolean alphabet[]=new boolean[26];
		for (int i=0;i<input.length();i++) 
		{
			char ch=input.charAt(i);

			String restValue = input.substring(0,i)+input.substring(i+1);
			if(alphabet[ch -'a']==false)
			{
				printDistinctSting(restValue,result+ch);
			}
			alphabet[ch-'a']=true;
		}
	}

	public static void main(String[] args) 
	{
		String str ="cat";
		printDistinctSting(str,"");
	}
}
