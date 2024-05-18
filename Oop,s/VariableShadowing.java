class VariableShadowing
{
	int a=1;
	public void m1()
	{
		int a=2;
		System.out.println(a);  //2
	}
	public static void main(String[] args) 
	{
		VariableShadowing obj = new VariableShadowing();
		obj.m1();
	}
} 

class Parent 
{
	int a=20;
}
class Child extends Parent
{
	int a=30;
	void m1()
	{
		int a=40;
		System.out.println(a);   //40
		System.out.println(this.a);		//30
		System.out.println(super.a);	//20
	}

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.m1();
	}
}