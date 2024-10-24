class Wallet1{
	int id ;
	String brand ; 
	int noOfCompartments ; 
	String color;
	public Wallet1(){
		System.out.println("The wallet constructor is invoked");
	}
	public Wallet1(int i ,String b ,int noOfComp ,String clr){
		System.out.println("The wallet constructor is invoked");
		id=i;
		brand=b;
		noOfCompartments=noOfComp;
		color=clr;
	}
	public void getInfo(){
		System.out.println("wallet id is: "+id);
		System.out.println("wallet brand is: "+brand);
		System.out.println("Number of compartments are: "+noOfCompartments);
		System.out.println("wallet color is: "+color);
		System.out.println();
	}
}