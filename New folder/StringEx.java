class StringExample 
{
 public static void main (String[]args)
	{
	 String a="HELLO ";
	 System.out.print(a);
	 String b=new String("Sunny");
	 System.out.println(b);
	}
}

class StringEx2
{
 public static void main(String[]args)
	{
		String a=new String("Hello");
		System.out.println(a);
		String b=new String("Hello");
		System.out.println(b);
		//System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}

