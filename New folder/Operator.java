class Operator
{
public static void main (String[]args)
	{
		int a=12;
		float b=4;
		float c=a*b;
	
		System.out.println("the value of c is : "+c);
	}
}

class Population
{
public static void main(String[]args)
	{
		int current_population=312032486;
		long g=(24*60*60)*365;
		//System.out.println(g);
		long birthperyear=g/7;
		//System.out.println(birthperyear);
		long deathperyear=g/13;
		//System.out.println(deathperyear);
		long immigrant=g/45;
		//System.out.println(immigrant);
		long new_population=(5*(birthperyear-deathperyear+immigrant))+current_population;
		System.out.println(new_population);
		
		}
}


class AvgSpeed
{
public static void main(String[]args)
	{
		float sec=(45*60)+30;
		int hour=3600;
		int run=14;
	 float mile=1.6f; 
		float value=run*hour/sec;
		System.out.println("value of running per hour : "+value+"  km");
	float speed=value/mile;
		System.out.println("avg Speed in miles : "+speed+"  mile");
	}
}

class Perimeter
{
public static void main (String[]args)
	{
		float radius=5.5f;  	//we can also use double in this prg.
		float pi=3.14f;
		float area=pi*radius*radius;
		float perimeter=2*pi*radius;
		System.out.println("area of circle : "+area);
		System.out.println("Perimeter of circle : "+perimeter);
	}
}	

class Rectangle
{ 
public static void main(String[]args)
	{
		double width =4.5;
		double height =7.9;
		double area=width*height;
		double perimeter= 2*(height+width);
	System.out.println("area of rectangle is : "+area);
	System.out.println("perimeter of rectangle is : "+perimeter);
	}
}
	





































