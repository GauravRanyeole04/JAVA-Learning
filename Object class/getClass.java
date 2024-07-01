class Student 
{
	String name ;
	String place ;
	String branch ;

	Student(String name ,String place , String branch)
	{
		this. name =name ;
		this.place=place ;
		this.branch=branch ;
	}

	// public native void getClass()
	// {

	// }
}
class getClass
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Gaurav","Chh.SambhajiNagar","CSE");
		System.out.println(obj.getClass());

		String str = new String ();
		System.out.println(str.getClass());

	}
} 