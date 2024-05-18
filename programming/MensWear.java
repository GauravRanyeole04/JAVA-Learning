import java.util.*;
class MensWear
{
		public static void newmethod()
		{
			Scanner sc=new Scanner(System.in);
				System.out.println(" Select colour ");
				System.out.println(" 1.Green 2.Orange 3.Pink 4.Other");
				System.out.print(" Select Color : ");
				int color1=sc.nextInt();


				switch(color1){
				case 1:
				case 2: 
				case 3:	System.out.println("  Available");break;
				default : System.out.println(" plz Visit to Shop ");break;
				}
		}

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("******************");
		System.out.println("__Sunny Mens Wear__");
		System.out.println("******************");
		System.out.println();

		System.out.print(" Enter Your Age : ");
		int age=sc.nextInt();

		if(age<=15){
			System.out.println(" Child Section : ");
			System.out.println(" 1-Jeans Pant");
			System.out.println(" 2-Shirt's");
			System.out.println(" 3-Kurta");
			System.out.println(" 4-T.Shirts");
			System.out.println(" 5-Exit.");

			System.out.print(" Enter Your Choice : ");
			int child=sc.nextInt();

			switch(child){
		case 1:{
				System.out.println();
				System.out.println(" Select colour for jeans ");
				System.out.println(" 1.Black 2.Blue 3.White 4.Other");
			System.out.print(" Select Color : ");
			int color=sc.nextInt();

			switch(color){
				case 1:
				case 2: {System.out.println(" Available");
					System.out.println(" shirtavr  jeans pahije ka  : ");
			String select=sc.next().toUpperCase();
			if (select.equals("YES"))
			{
				newmethod();
				break;
			}
			break;
		}
					
				case 3:	System.out.println(" Currently Not Available");break;
				default : System.out.println(" We can Inform.");break;
				}
				break;
		}
		case 2:{
		newmethod();	
			break;
			}
	case 3:{
			System.out.println();
				System.out.println(" Select colour ");
				System.out.println(" 1.Pathani 2.Classic 3.Floral 4.Asymmeyric ");
			System.out.print(" Select Type for Kurta : ");
			int kurta=sc.nextInt();

			switch(kurta){
				case 1:
				case 2:
				case 3: 
				case 4:	System.out.println("  Available");break;
				default : System.out.println(" plz Visit to Shop ");break;
				}
				break;
			}
	case 4:{
			System.out.println();
				System.out.println(" Select type:  ");
				System.out.println(" 1.full sleeve 2.half sleeve 3.casual 4.hoody");
			System.out.print(" Select type : ");
			int tshirt=sc.nextInt();

			switch(tshirt){
				case 1:
				case 2:
				case 3: 
				case 4:	System.out.println("  Available");break;
				default : System.out.println(" plz Visit to Shop ");break;
				}
				break;
			}
	
		}
	}


	}
}