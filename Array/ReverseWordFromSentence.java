import java.util.Arrays;
class ReverseWordFromSentence 
{
	public static void main(String[] args) 
	{
		String str = "egelloC fO gnireenignE dnA ygolonhceT anlaJ";

		String[] arrOfStr = str.split(" ");

		String op="";
		for (String i : arrOfStr) 
		{
			op= op +(new StringBuffer(i).reverse())+" ";
		}
		System.out.println(str+" : "+op);
	}
}