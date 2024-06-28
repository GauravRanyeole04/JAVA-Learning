import java.util.*;
class NamefirstCap
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Name : ");
		String name = sc.next().toLowerCase();

		String fchar=name.substring(0,1).toUpperCase();
		String remname=name.substring(1,name.length());
		String concate=fchar.concat(remname);

		System.out.println(concate);
	}
}