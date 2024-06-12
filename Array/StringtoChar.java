import java.util.*;
class StringtoChar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.next();

		char[] arr = stringToCharArray(name);
		System.out.println(Arrays.toString(arr));
	}

	public static char[] stringToCharArray(String name)
	{
		char [] arr = new char[name.length()];

		for (int i=0;i<name.length();i++) 
		{
			arr[i] = (name.charAt(i));
		}
		return arr;
	} 
}