// class OverridetoString
// {
// 	String name ;
// 	String branch;
// 	String place;

// 	OverridetoString ()//(String name,String branch,String place)
// 	{
// 		// this.name=name;
// 		// this.branch=branch;
// 		// this.place=place;
// 	}
// 	// @Override
// 	// public String toString()
// 	// {
// 	// 	return "hello I am "+name+" my branch name is "+branch+" and my native place is "+place;
// 	// }
// }

// class Example 
// {
// 	public static void main(String[] args) 
// 	{
	// 	OverridetoString obj =new OverridetoString ();//("Gaurav","CSE","Chh.Sambhajinagar");
	// 	System.out.println(obj);
		// Example obj1=new Example();
		// System.out.println(obj1);
		// String str = new String();
		// System.out.println(str.toString());
		// System.out.println(str);
		// OverridetoString obj1 =new OverridetoString("Sunny","Mechatronics","Chh.Sambhajinagar");
		// System.out.println(obj1);
		// OverridetoString obj2 =new OverridetoString("Mayur","Mechatronics","Chh.Sambhajinagar");
		// System.out.println(obj2);
// 	}
// }


class OverridetoString
{
	String name ;
	String branch;
	String place;

	OverridetoString(String name ,String branch,String place)
	{
		this.name=name;
		this.branch=branch;
		this.place=place;
	}

	@Override
	public String toString()
	{
		return "Hlo my name is "+name+" i am "+branch+" student. and I belong's to "+place+".";
	}
}

class Driver 
{
	public static void main(String[] args) 
	{
		OverridetoString obj = new OverridetoString("Gaurav","CSE","Chh.SambhajiNagar");
		System.out.println(obj.toString());
	}
}
