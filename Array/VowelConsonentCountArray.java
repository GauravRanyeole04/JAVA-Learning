import java.util.*;
class VowelConsonentCountArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array Size : ");
		int size=sc.nextInt ();

		System.out.println("Enter Array Element : ");
		char arr[]= new char[size];

		for (int i=0;i<size;i++) 
		{
			arr[i]=sc.next().charAt(0);
		}

		int vCount=0;
		int cCount=0;

		for (int i=0;i<size;i++) 
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
			{
				vCount++;
			}
			else{
				cCount++;
			}
		}

		System.out.println("Vowel Count : "+vCount);
		System.out.println("Consonent Count : "+cCount);		
	}
}