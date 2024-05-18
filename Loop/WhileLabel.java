class WhileLabel
{
	public static void main(String[] args) {
		outerloop:
		{
		int i=1;
		while(i<=2)
		{
			System.out.print("hello");
			i++;
			break outerloop;
		}	
		}
		
	}
}