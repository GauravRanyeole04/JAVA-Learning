class Parent{}
class Child1 extends Parent{}
class SubChild1 extends Child1{}
class SubChild2 extends Child1{}
class Child2 extends Parent{}
class SubChild3 extends Child2{}
class SubChild4 extends Child2{}

class DownCasting 
{
	public static void main(String[] args) 
	{
		// Parent obj = new Child1();
		// SubChild1 obj1 = (SubChild1)obj;

		// Parent obj = new SubChild1();
		// Child1 obj1 = (Child1)obj;
		// SubChild2 obj2 = (SubChild2)obj1;
		// Child2 obj1 = (SubChild3)obj;
		// SubChild1 obj1 = (SubChild1)obj;
		// Child1 obj1 = (SubChild2)obj;

		// SubChild1 obj = new SubChild1();
		// SubChild1 obj1 = (SubChild1)obj;
		Child1 obj = new SubChild1();
		// SubChild2 obj1 = (SubChild2)obj;
		// SubChild1 obj1 = (Child1)obj;
		SubChild1 obj1 = (SubChild1)obj;
	}
}