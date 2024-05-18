class TechNumber
{
	public static void main(String[] args) 
	{
		int num=2025;
		int dup=num;
		int length=0;
		int div=1;

		for (;num>0;num/=10) 
		{
			length++;
		}

		if(length%2==0)
		{
			for (int i=1;i<=length;i++ ) 
			{
				div=div*10;
			}

			int firsthalf=dup/div;
			int secondhalf=dup%div;
			int sum=firsthalf+secondhalf;
			int sqr=sum*sum;
			System.out.print((sum==sqr)?num+" is a Tech Number":num+" is not a Tech Number");
		} 
		else{
			System.out.print(num+" is can't Seperate , not a Tech Number");
		}
	}
}
		