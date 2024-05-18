import java.util.Scanner;
class SwitchEx
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Character : ");
		char ch = sc.next().toLowerCase().charAt(0);
		switch(ch)
		{
		case 'a':
	    case 'e':
		case 'i':
		case 'o':
		case 'u':System.out.println(ch+" is a Vowel");break;
		default : System.out.println(ch+" is a Consonent");

		}
	}
}

class Month
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter a month number : ");
		int monthNum=sc.nextInt();
		String month = null;
		switch(monthNum)
		{
			case 1 : month = "JAN";break;
			case 2 : month = "FEB";break;
			case 3 : month = "MAR";break;
			case 4 : month =  "APR";break;
			case 5 : month = "MAY";break;
			case 6 : month = "JUN";break;
			case 7: month = "JULY";break;
			case 8 : month = "AUG";break;
			case 9 : month = "SEP";break;
			case 10 : month ="OCT";break;
			case 11 : month = "NOV";break;
			case 12 : month = "DEC";break;
			default: System.out.println("invalid input");
		}
		System.out.print((month!=null)?monthNum+" month is "+month:" ");
	}
}


class Identify
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Character : ");
		char ch=sc.next().toUpperCase().charAt(0);
		switch(ch)
		{
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :System.out.print(ch+" its a Vowel");break;
		default : System.out.print(ch+" its a Consonent");

		}
	}
}





 
 