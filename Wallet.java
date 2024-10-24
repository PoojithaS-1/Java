class Wallet{
	int id ;
	String brand ; 
	int noOfCompartments ; 
	String color;
	public Wallet(){
		System.out.println("The wallet constructor is invoked");
	}
	public void getInfo(){
		System.out.println("wallet id is: "+id);
		System.out.println("wallet brand is: "+brand);
		System.out.println("Number of compartments are: "+noOfCompartments);
		System.out.println("wallet color is: "+color);
		System.out.println();
	}
}