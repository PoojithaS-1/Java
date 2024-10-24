class TubeLight1{
	int id;
	String brand ;
	double price ;
	String voltage;
	public TubeLight1(){
		this(1,"Philips");
		System.out.println("The no arguments TubeLight Constructor is invoked");
	}
	public TubeLight1(int id,String brand ){
		this(10.00,"220V");
		System.out.println("The 2 arguments(int,String) TubeLight Constructor is invoked");
		this.id=id;
		this.brand=brand;
	}
	public TubeLight1(double price ,String voltage){
		System.out.println("The 2 arguments(double,String) TubeLight Constructor is invoked");
		this.price=price;
		this.voltage=voltage;
	}
	public void getInformation(){
		System.out.println("The TubeLight details: ");
		System.out.println("The TubeLight id is: "+this.id);
		System.out.println("The TubeLight brand: "+this.brand);
		System.out.println("The TubeLight price: "+this.price);
		System.out.println("The TubeLight voltage: "+this.voltage);
		System.out.println();
		
	}
}
	