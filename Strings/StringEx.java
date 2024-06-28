class StringEx 
{
	public static void main(String[] args) 
	{
		String a="Hello";
		String b= new String("Hello");
		String c="word";
		String d=a.concat(c);
		String e="Hello";
		String f=new String("Helloword");
		String g="HelloWord";
		System.out.println(g==d);
		System.out.println(g==f);
		System.out.println(f==d);
		System.out.println(d);
		System.out.println(a==b);
		System.out.println(a==e);

		String x="word";
		String z=a.concat(x);  // Everytime Create a new Object 
		System.out.println(z==d);
	}
}