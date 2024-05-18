class Unversity    //Aggregation 
{
	String name,type,unicode;
	int noOfColleges,establishedYear,course;
	College college;

	Unversity(String name,String type,int course,String unicode,int noOfColleges,int establishedYear)
	{
		this.name=name;
		this.type=type;
		this.course=course;
		this.unicode=unicode;
		this.noOfColleges=noOfColleges;
		this.establishedYear=establishedYear;	
	}

	void displayUniversity()
	{
		System.out.println();
		System.out.println("*** University Details ***");
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
		System.out.println("Course : "+course);
		System.out.println("UniCode : "+unicode);
		System.out.println("No. Of Colleges : "+noOfColleges);
		System.out.println("Established Year : "+establishedYear);
	}

	public void createInstanceOfCollege(String name,String add, char grade ,int collegeCode,int noOfDept,int staffCount)
	{
		college=new College(name,add,grade,collegeCode,noOfDept,staffCount);
	}
}

class College
{
	String name ,add;
	int collegeCode ,noOfDept,staffCount;
	char grade ;
	Department department;

	College(String name,String add, char grade ,int collegeCode,int noOfDept,int staffCount)
	{
		this.name=name ;
		this.add=add;
		this.grade=grade;
		this.collegeCode=collegeCode;
		this.noOfDept=noOfDept;	
		this.staffCount=staffCount;
	}

	void displayCollege()
	{
		System.out.println();
		System.out.println(" *** College Details ***");
		System.out.println("Name : "+name);
		System.out.println("Address : "+add);
		System.out.println("Garde : "+grade+"++");
		System.out.println("College Code : "+collegeCode);
		System.out.println("No. of Department : "+noOfDept);
		System.out.println("Staff's Count : "+staffCount);
	}
	public void createInstanceOfDepartment(String name ,String hodName , int subjects, int classrooms ,int staff)
	{
		department=new Department(name,hodName,subjects,classrooms,staff);

	}
}

class Department 
{
	String name,hodName;
	int classrooms ,staff,subjects;
	Teacher teacher;

	Department(String name ,String hodName , int subjects, int classrooms ,int staff)
	{
		this.name=name;
		this.hodName=hodName;
		this.subjects=subjects;
		this.classrooms=classrooms;
		this.staff=staff;
	}

	void displayDepartment()
	{
		System.out.println();
		System.out.println("*** Department Details ***");
		System.out.println("Name : "+name);
		System.out.println("HOD Name: "+hodName);
		System.out.println("No.Of Subjects : "+subjects);
		System.out.println("Class Rooms : "+classrooms);
		System.out.println("No. Of Staffs : "+staff);
	}
	public void createInstanceOfTeacher(String name ,String subject,String qualification,long phoneNumber,double experience)
	{
		teacher=new Teacher(name,subject,qualification,phoneNumber,experience);
	}
}

class Teacher
{
	String name,subject,qualification;
	long phoneNumber ;
	double experience;

	Teacher(String name ,String subject,String qualification,long phoneNumber,double experience)
	{
		this.name=name;
		this.subject=subject;
		this.qualification=qualification;
		this.phoneNumber=phoneNumber;
		this.experience=experience;
	}

	void displayTeacher()
	{
		System.out.println();
		System.out.println("*** Teacher Details ***");
		System.out.println("Name : "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Qualification :"+qualification);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Experience : "+experience+" years");
	}
}

class UniversityDriver 
{
	public static void main(String[] args) 
	{
		Unversity obj=new Unversity("D.BATU","Government",300,"BATU@33",50,2015);
		obj.displayUniversity();
		obj.createInstanceOfCollege("MSS","jalna",'A',2138,10,50);
		obj.college.displayCollege();
		obj.college.createInstanceOfDepartment("CSE","Chakote Sir",38,6,10);
		obj.college.department.displayDepartment();
		obj.college.department.createInstanceOfTeacher("Shubhangi mam","Artificial Intelligence","PHD",9172030595l,3.5);
		obj.college.department.teacher.displayTeacher();
	}
}
