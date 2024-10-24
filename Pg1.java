class Pg1{
	String pgOwner; 
	int rent; 
	int noOfFloors; 
	String pgAddress;
	public Pg1(){
		System.out.println("The Pg constructor is invoked");
	}
	public Pg1(String pgO,int r,int noOfF,String pgAdd){
		System.out.println("The Pg constructor is invoked");
		pgOwner=pgO;
		rent=r;
		noOfFloors=noOfF;
		pgAddress=pgAdd;
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