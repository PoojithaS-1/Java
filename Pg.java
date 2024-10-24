class Pg{
	String pgOwner; 
	int rent; 
	int noOfFloors; 
	String pgAddress;
	public Pg(){
		System.out.println("The Pg constructor is invoked");
	}
	public void getDetails(){
	System.out.println("The Pg details: ");
	System.out.println("The pgOwner is: "+pgOwner);
	System.out.println("The pg rent is: "+rent);
	System.out.println("The noOfFloors: "+noOfFloors);
	System.out.println("The pgAddress is: "+pgAddress);
	System.out.println();
	}
}