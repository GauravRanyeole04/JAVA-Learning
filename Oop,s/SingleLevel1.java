import java.util.*;
class Sport  //Sport and cricket
{
	String type,sportlevel;
	int noOfPalyer;
	boolean team,ground;

	Sport(String type,String sportlevel,int noOfPalyer,boolean team,boolean ground)
	{
		super();
		this.type=type;
		this.sportlevel=sportlevel;
		this.noOfPalyer=noOfPalyer;
		this.team=team;
		this.ground=ground;
	}

	void displaySport()
	{
		System.out.println();
		System.out.println("*** Sport ***");
		System.out.println("Type of Game : "+type);
		System.out.println("Playing Level : "+sportlevel);
		System.out.println("Team is there : "+team);
		System.out.println("NO of Players : "+noOfPalyer);
		System.out.println("Ground : "+ground);
	}
}

class Cricket extends Sport
{
	String captain,trophy;
	String []equipment;
	int noOfTeam;

	Cricket(String captain,String []equipment,String trophy,int noOfTeam,String type,String sportlevel,int noOfPalyer,boolean team,boolean ground)
	{
		super(type,sportlevel,noOfPalyer,team,ground);
		this.captain=captain;
		this.trophy=trophy;
		this.equipment=equipment;
		this.noOfTeam=noOfTeam;
	}

	void displayCricket()
	{
		System.out.println();
		System.out.println("*** Cricket ***");
		System.out.println("Captain : "+captain);
		System.out.println("Recent playing Trophy : "+trophy);
		System.out.println("No. Of Team : "+noOfTeam+" Teams	");
		System.out.println("Equipment : "+Arrays.toString(this.equipment));
	}
}

class SingleLevelDriver1
{
	public static void main(String[] args) 
	{
		String []equipment={"1.Bat","2.Ball","3.Stump","4.Helment","5.Gloves"};
		Cricket obj = new Cricket("Rohit Sharma",equipment,"IPL-2024",2,"OutDoor Game","International",11,true,true);	
		obj.displaySport();
		obj.displayCricket();
	}
}
