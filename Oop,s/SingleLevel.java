import java.util.*;
class ProgrammingLanguage //programming language and java  
{
	String type,level,founderName,extension;
	int inventedYear;
	String latestVersion;

	ProgrammingLanguage(String type,String level,String founderName,String extension,int inventedYear,String latestVersion)
	{
		super();
		this.type=type;
		this.level=level;
		this.founderName=founderName;
		this.extension=extension;
		this.inventedYear=inventedYear;
		this.latestVersion=latestVersion;
	}

	public void displayProgrammingLanguage()
	{
		System.out.println();
		System.out.println("*** Programming language***");
		System.out.println();
		System.out.println("Type : "+type);
		System.out.println("Level : "+level);
		System.out.println("Founder Name : "+founderName);
		System.out.println("Extension : "+extension);
		System.out.println("Invented Year : "+inventedYear+" year");
		System.out.println("Latest Version : "+latestVersion);
	}
}

class Java extends ProgrammingLanguage
{
	String [] features ;
	boolean platformIndependent;

	Java(String [] features,boolean platformIndependent,String type,String level,String founderName,String extension,int inventedYear,String latestVersion)
	{
		super(type,level,founderName,extension,inventedYear,latestVersion);
		this.features=features;
		this.platformIndependent=platformIndependent;
	}

	public void diaplayJava()
	{
		System.out.println();
		System.out.println("*** JAVA ***");
		System.out.println();
		System.out.println("It is a Platform Independent : "+platformIndependent);
		System.out.println("Features of JAVA : "+Arrays.toString(this.features));
	}
}

class SingleLevelDriver
{
	public static void main(String[] args) 
	{
		String [] features={"1.MultiThreaded","2.Robust and Secure","3.Portable","4.Dynamic"};
		Java obj=new Java(features,true,"Object Oriented","High Level","Games Golsling",".java",1991,"JDK 1.22");
		obj.displayProgrammingLanguage();
		obj.diaplayJava();
	}
}
