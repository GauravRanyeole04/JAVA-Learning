import java.util.*;
class Education //Education and diploma 
{
	double yearOfCourse;
	String type,location,classTiming,degree;

	Education(String type,String location,String classTiming,String degree,double yearOfCourse)
	{
		super();
		this.type=type;
		this.location=location;
		this.classTiming=classTiming;
		this.degree=degree;
		this.yearOfCourse=yearOfCourse;
	}

	void displayEducation()
	{
		System.out.println();
		System.out.println("*** Education ***");
		System.out.println("Degree Name : "+degree);
		System.out.println("Type of class : "+type);
		System.out.println("Total Course Year's : "+yearOfCourse+" years");
		System.out.println("Location : "+location);
		System.out.println("Class Timing : "+classTiming);
	}
}

class Diploma extends Education	
{
	String stream,clgName,teacherName;
	String [] practicleSub;
	int noOfSubject,noOfStudent;

	Diploma(String stream,String clgName,String teacherName,String [] practicleSub,int noOfSubject,int noOfStudent,String type,String location,String classTiming,String degree,double yearOfCourse)
	{
		super(type,location,classTiming,degree,yearOfCourse);
		this.practicleSub=practicleSub;
		this.stream=stream;
		this.clgName=clgName;
		this.teacherName=teacherName;
		this.noOfSubject=noOfSubject;
		this.noOfStudent=noOfStudent;
	}
	void displayDiploma()
	{
		System.out.println();
		System.out.println("*** Diploma ***");
		System.out.println("Stream : "+stream);
		System.out.println("College Name : "+clgName);
		System.out.println("Teacher Name : "+teacherName);
		System.out.println("No. of Subject : "+noOfSubject);
		System.out.println("No. of Student : "+noOfStudent);
	}
}

class SingleLevelDriver2
{
	public static void main(String[] args) 
	{
		String [] practicleSub={"1.WorkShop","2.Tool and Die Making"};
		Diploma obj = new Diploma("Mechatronics","Indo-German","Garudi Sir",practicleSub,30,60,"OffLine","Chh.SambhajiNagar","9:00 to 6:00","Diploma",3);
		obj.displayEducation();
		obj.displayDiploma();
	}
}

