class Student 
{
	String name;
	String place;
	String branch;
	int yop;

	Student(String name ,String place ,String branch ,int yop)
	{
		this.name = name;
		this.place = place;
		this.branch = branch;
		this.yop = yop;	
	}

	public boolean equals(Object obj)
	{
		Student obj2 =(Student)obj; 
		if((this.name==obj2.name)&&(this.place==obj2.place)&&(this.branch==obj2.branch)&&(this.yop==obj2.yop))
			return true;
		else 
			return false;
	}

}

class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student obj1 = new Student("Gaurav","Chh.SambhajiNagar","CSE",2024);
		Student obj2 = new Student("Gaurav","Chh.SambhajiNagar","CSE",2024);
		System.out.println(obj1.equals(obj2));
	}
}