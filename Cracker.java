//Constructor chaining:
class Cracker{
	int crackerId;
	String crackerName;
	double price;
	String crackerType;
	
	public Cracker(){
	this(1,"flower pot");
	System.out.println("no argument constructor is invoked");
	}
	
	public Cracker(int crackerId,String crackerName){
	this(100.00,"sparkling");
	System.out.println("2 argument(int,String)constructor is invoked");
	this.crackerId=crackerId;
	this.crackerName=crackerName;
	}
	public Cracker(double price,String crackerType){
	System.out.println("2 argument(double,String)constructor is invoked");
	this.price=price;
	this.crackerType=crackerType;
	
	}
	public void getCrackerInfo()
	{
	System.out.println("The Crackers Constructer is invoked");
	System.out.println("crackerId: "+crackerId);
	System.out.println("crackerName: "+crackerName);
	System.out.println("Crackers price: "+price);
	System.out.println("Crackers type: "+crackerType);
	}
	}