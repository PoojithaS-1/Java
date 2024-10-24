class Wallet1{
	int id ;
	String brand ; 
	int noOfCompartments ; 
	String color;
	public Wallet1(){
		this(1,"Levi's");
		System.out.println("The no arguments wallet constructor is invoked");
	}
	public Wallet1(int id ,String brand){
		this("Black",5);
		System.out.println("The 2 arguments(int,String) wallet constructor is invoked");
		this.id=id;
		this.brand=brand;
		
	}
	public Wallet1(String color,int noOfCompartments ){
		System.out.println("The 2 arguments(String,int) wallet constructor is invoked");
		this.noOfCompartments=noOfCompartments;
		this.color=color;
	}
	public void getInfo(){
		System.out.println("wallet id is: "+this.id);
		System.out.println("wallet brand is: "+this.brand);
		System.out.println("Number of compartments are: "+this.noOfCompartments);
		System.out.println("wallet color is: "+this.color);
		System.out.println();
	}
}