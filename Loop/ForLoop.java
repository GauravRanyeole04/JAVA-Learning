class ForEx
{
	public static void main(String[] args) 
	{
		// for ( char ch='A';ch<='Z';ch++)
		// {
		// 	System.out.print(ch+" ");
		// }

		// for (char ch=97;ch<=122;ch++)
		// {
		// 	System.out.print(ch+" ");
		// }

		for(char ch=48;ch<='9';ch++)
		{
			System.out.print(ch+" ");
		}
	}
}

class UpperCase  //Ascending Order
{
	public static void main(String[] args) 
	{
		for(char ch=65;ch<=90;ch++)
		{
			System.out.print(ch+" ");
		}
	}
}

class UpperCase2 // Decending order 
{
	public static void main(String[] args) 
	{
		for(char ch=90;ch>=65;ch--)
		{
			System.out.print(ch+"  ");
		}
	}
}

class LowerCase  //Ascending Order
{
	public static void main(String[] args) 
	{
		for(char ch=97;ch<=122;ch++)
		{
			System.out.print(ch+" ");
		}
	}
}

class LowerCase2 // Decending order
{
	public static void main(String[] args) 
	{
		for (char ch=122;ch>=97;ch--)
		{
			System.out.print(ch+" ");
		}
	}
}

class Digit   //Ascending Order
{
	public static void main(String[] args) 
	{
		for(char ch=48;ch<=57;ch++ )
		{
			System.out.print(ch+" ");
		}
	}
}

class Digit2 // Decending order
{
	public static void main(String[] args) 
	{
		for(int i=9;i>=0;i--)
		{
			System.out.print(i+ " ");
		}
	}
}

class Even
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100;i++)
		
			if (i%2==0)
			{
			System.out.print(i+" ");
			}
		
		
	}
}

class Odd
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100;i++)
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
	}
}


class Infinite
{
	public static void main(String[] args) 
	{
		int i;
		for (i=1;i<=5 ; ) 
		{
			System.out.print(i);
		}
		i++;
	}
}