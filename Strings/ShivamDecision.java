class ShivamDecision 
{
	public static void main(String[] args) 
	{
		String gf="";
		String wife="mayuri";

		if(gf.isEmpty())
		{
			try{
				throw new shivamgfexception("Shivam Doesn't have any girlfriend.");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if(wife.isEmpty())
				{
					System.out.println("he Doesn't have Wife Also.");
				}
				else {
					System.out.println(wife+" is shivam's Wife.");
				}
			}
		}
	}
}

class shivamgfexception extends Exception
{
	String msg;
	
	shivamgfexception(String msg)
	{
		super(msg);
	}
}