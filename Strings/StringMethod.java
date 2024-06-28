
class StringMethod 
{
	public static void main(String[] args) 
	{
		String name1="Gaurav";
		String name2="Rutuja";
		String name3="Mona";
		String name4="";


		String convertCaps=name1.toUpperCase();
		int length=name3.length();
		char singleChar=name2.charAt(3);
		String mergedname=name2.concat(name3);
		String substr=name1.substring(1,6);
		String substr1=name1.substring(5,6);
		boolean empty=name4.isEmpty();

		System.out.println(convertCaps);  //Gaurav
		System.out.println(length); 	  //4
		System.out.println(singleChar);   //u
		System.out.println(mergedname);	  //RutujaMona
		System.out.println(substr);		  //aurav
		System.out.println(substr1);      //v
		System.out.println(empty);		  //true
	}
}