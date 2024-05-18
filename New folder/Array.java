import java.util.Arrays;
class ArrayMax
{
	public static void main(String[] args) 
	{
		int num1=2;
		int num2=28;
		int num3=29;
		int num4=-21;
		int num5=20;
		int num6=22;
		int [] numbers = {num1,num2,num3,num4,num5,num6};
		// System.out.println(Array.tostring(numbers));
		Arrays.sort(numbers);
		// System.out.println(Array.tostring(numbers)); 
		System.out.println("min number is "+numbers[0]);
		System.out.println("max number is "+numbers[(numbers.length-1)]);	
	}
}