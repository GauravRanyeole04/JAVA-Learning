class Human
{
	String name, gender;
	Human(String name, String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	}

	void displayHuman()
	{
		System.out.println();
		System.out.println("*** Human Details ***");
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
	}

	void eat()
	{
		System.out.println(this.name +" can eat");
	}
	void walk()
	{
		System.out.println(this.name +" can Walk");
	}
	void think()
	{
		System.out.println(this.name +" can Think");
	}
	void speak()
	{
		System.out.println(this.name +" can Speak");
	}
}

class Graduation extends Human 
{
	String course,branch,university;
	int yop,duration;

	Graduation(String course,String branch,String university,int yop,int duration,String name, String gender)
	{
		super(name,gender);
		this.course=course;
		this.university=university;
		this.branch=branch;
		this.yop=yop;
		this.duration=duration;
	}

	void displayGraduation()
	{
		System.out.println();
		System.out.println("*** Graduation Details ***");
		System.out.println("Course : "+this.course);
		System.out.println("University : "+this.university);
		System.out.println("Branch : "+this.branch);
		System.out.println("Duration : "+this.duration+" yrs.");
		System.out.println("Year of Passout : "+this.yop);
	}
}

class PostGraduation extends Graduation
{
	String specilpg,universitypg;
	int durationpg,yoppg;

	PostGraduation(String specilpg,String universitypg,int durationpg,int yoppg,String course,String branch,String university,int yop,int duration,String name, String gender)
	{
		super(course,branch,university,yop,duration,name,gender);
		this.specilpg=specilpg;
		this.universitypg=universitypg;
		this.durationpg=durationpg;
		this.yoppg=yoppg;
	}

	void displayPostGraduation()
	{
		System.out.println();
		System.out.println("*** Post Graduation Details ***");
		System.out.println("Specialization : "+this.specilpg);
		System.out.println("University : "+this.universitypg);
		System.out.println("Duration : "+this.durationpg+" yrs");
		System.out.println("Year of Passout : "+this.yoppg);
	}
}

class Job extends PostGraduation
{
	String company,designation,loc;
	double salary;

	Job(String company,String designation,String loc , double salary,String specilpg,String universitypg,int durationpg,int yoppg,String course,String branch,String university,int yop,int duration,String name, String gender)
	{
		super(specilpg,universitypg,durationpg,yoppg,course,branch,university,yop,duration,name,gender);
		this.salary=salary;
		this.company=company;
		this.designation=designation;
		this.loc=loc;
	}

	void displayJob()
	{
		System.out.println();
		System.out.println("*** JOB Details ***");
		System.out.println("Company : "+this.company);
		System.out.println("Designation : "+this.designation);
		System.out.println("Location : "+this.loc);
		System.out.println("Salary : "+this.salary+" lakh");
	}
}

class HumanDriver
{
	public static void main(String[] args) 
	{
		Job obj = new Job("Infotech","Software Developer","Pune",8,"Machine Learning","SPPU",2,2026,"B.tech","CSE","D.Batu",2024,4,"Gaurav","Male");
		obj.displayHuman();
		obj.eat();
		obj.walk();
		obj.speak();
		obj.think();
		obj.displayGraduation();
		obj.displayPostGraduation();
		obj.displayJob();
	}
}
