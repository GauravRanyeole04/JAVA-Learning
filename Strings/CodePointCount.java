class UserCodePointCount
{
	static String str = new String("ABCD");
	public static void main(String[] args) 
	{
		int indx = userCodePointCount(0,3);
		System.out.println(str +" : "+indx);
	}
	public static int userCodePointCount(int startIndx , int endIndx)
	{
		if(startIndx>endIndx||startIndx<1||startIndx>str.length()-1||endIndx<0||endIndx>str.length())
		{
			throw new StringIndexOutOfBoundsException("Wrong indx : "+"["+startIndx+","+endIndx+"].");
		}
		return endIndx-startIndx;
	}
}

class CodePointCount 
{
	public static void main(String[] args) 
	{
		String str = new String ("ABCD");
		System.out.println(str.codePointCount(1,4));
	}
}