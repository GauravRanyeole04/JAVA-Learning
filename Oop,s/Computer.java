class Cpu
{
	String processor,graphicsCard;
	int ram,rom;
	Cpu(String processor,String graphicsCard,int ram,int rom)
	{
		this.processor=processor;
		this.graphicsCard=graphicsCard;
		this.ram=ram;
		this.rom=rom;
	}

	void displayCpu()
	{
		System.out.println();
		System.out.println("*** CPU Details ***");
		System.out.println("Processor : "+processor);
		System.out.println("Graphics Card : "+graphicsCard);
		System.out.println("RAM : "+ram+" GB");
		System.out.println("ROM : "+rom+" TB");
	}
}


class Computer
{
	String company,display,operatingSys;
	double price,frequency;
	Cpu cpu=new Cpu("intel Core i7","iRIS 6 GB",16,1);
	KeyBoard keyboard ;
	Mouse mouse;
	Monitor monitor;
	Speaker speaker;
	Camera camera ;

	Computer(String company,String display,String operatingSys,double price,double frequency)
	{
		this.company=company;
		this.display=display;
		this.operatingSys=operatingSys;
		this.price=price;
		this.frequency=frequency;
	} 

	void displayComputer()
	{
		System.out.println();
		System.out.println("*** Computer Details ***");
		System.out.println("Company : "+company);
		System.out.println("Operating System : "+operatingSys);
		System.out.println("Frequency : "+frequency+"GHz");
		System.out.println("Price : "+price+" rs");
	}

	public void createInstanceOfKeyBoard(String company,String type,boolean backlight,int noOfButton)
	{
		keyboard=new KeyBoard(company,type,backlight,noOfButton);
	}

	public void createInstanceOfMouse(String brand,String type,int button,boolean scrollButton)
	{
		mouse=new Mouse(brand,type,button,scrollButton);
	}

	public void createInstanceOfMonitor(String displayType,double size,int resolution)
	{
		monitor=new Monitor(displayType,size,resolution);
	}

	public void createInstanceOfSpeaker(String brand,String type,int noOfSpeaker,int frequency)
	{
		speaker=new Speaker(brand,type,noOfSpeaker,frequency);
	}

	public void createInstanceOfCamera(String type,String brand,String model,double price)
	{
		camera=new Camera(type,brand,model,price);
	}

}

class KeyBoard 
{
	String company ,type;
	boolean backlight;
	int noOfButton;

	KeyBoard(String company,String type,boolean backlight,int noOfButton)
	{
		this.company=company;
		this.type=type;
		this.backlight=backlight;
		this.noOfButton=noOfButton;
	}

	void displayKeyBoard()
	{
		System.out.println();
		System.out.println("*** KeyBoard ***");
		System.out.println("Company : "+company);
		System.out.println("Type : "+type);
		System.out.println("Backlight : "+backlight);
		System.out.println("No. Of Button's : "+noOfButton);
	}
}

class Mouse
{
	String brand,type;
	boolean scrollButton;
	int button;

	Mouse(String brand,String type,int button,boolean scrollButton)
	{
		this.brand=brand;
		this.type=type;
		this.button=button;
		this.scrollButton=scrollButton;
	}
	void displayMouse()
	{
		System.out.println();
		System.out.println("*** Mouse ***");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Button : "+button);
		System.out.println("Scroll Button : "+scrollButton);
	}
}

class Monitor
{
	String displayType;
	double size;
	int resolution;

	Monitor(String displayType,double size,int resolution)
	{
		this.displayType=displayType;
		this.size=size;
		this.resolution=resolution;
	}

	void displayMonitor()
	{
		System.out.println();
		System.out.println("*** Monitor ***");
		System.out.println("Dispaly Type : "+displayType);
		System.out.println("Size of Dispaly : "+size);
		System.out.println("Resolution : "+resolution+" p");
	}
}

class Speaker 
{
	String brand,type ;
	int noOfSpeaker,frequency;

	Speaker(String brand,String type,int noOfSpeaker,int frequency)
	{
		this.brand=brand;
		this.type=type;
		this.noOfSpeaker=noOfSpeaker;
		this.frequency=frequency;
	}

	void displaySpeaker()
	{
		System.out.println();
		System.out.println("*** Speaker ***");
		System.out.println("Brand : "+brand);
		System.out.println("Type of Speaker : "+type);
		System.out.println("No. of Speaker : "+noOfSpeaker);
		System.out.println("Frequency : "+frequency+" Hz");
	}
}

class Camera 
{
	String type,brand,model;
	double price ;

	Camera(String type,String brand,String model,double price)
	{
		this.type=type ;
		this.brand=brand ;
		this.model=model;
		this.price=price;
	}
	void displayCamera()
	{
		System.out.println();
		System.out.println("*** Camera ***");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price+" rs");
	}
}


class ComputerDriver
{
	public static void main(String[] args) 
	{
		Computer obj=new Computer("hP","17 inch(micro edges)","Windows 12",105000,3.2);
		obj.displayComputer();
		obj.cpu.displayCpu();
		obj.createInstanceOfKeyBoard("Hp","Wired",true,99);
		obj.keyboard.displayKeyBoard();
		obj.createInstanceOfMouse("Zebronics","Wireless",4,true);
		obj.mouse.displayMouse();
		obj.createInstanceOfMonitor("LED",15.6,1080);
		obj.monitor.displayMonitor();
		obj.createInstanceOfSpeaker("Boat","Blutooth",4,600);
		obj.speaker.displaySpeaker();
		obj.createInstanceOfCamera("WebCam","logitech","C270",1995);
		obj.camera.displayCamera();
	}
}
