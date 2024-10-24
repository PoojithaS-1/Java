class Pg1{
	String pgOwner; 
	int rent; 
	int noOfFloors; 
	String pgAddress;
	public Pg1(){
		this("Mani",2000);
		System.out.println("no arguments Pg constructor is invoked");
	}
	public Pg1(String pgOwner,int rent){
		this(5,"bhadravathi");
		System.out.println("2 arguments(string,int) Pg constructor is invoked");
		this.pgOwner=pgOwner;
		this.rent=rent;
		
	}
	public Pg1(int noOfFloors,String pgAddress){
		System.out.println("2 arguments(int,string) Pg constructor is invoked");
		this.noOfFloors=noOfFloors;
		this.pgAddress=pgAddress;
	}
	public void getDetails(){
	System.out.println("The Pg details: ");
	System.out.println("The pgOwner is: "+this.pgOwner);
	System.out.println("The pg rent is: "+this.rent);
	System.out.println("The noOfFloors: "+this.noOfFloors);
	System.out.println("The pgAddress is: "+this.pgAddress);
	System.out.println();
	}
}