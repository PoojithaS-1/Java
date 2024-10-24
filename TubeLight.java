class TubeLight{
	int id;
	String brand ;
	double price ;
	String voltage;
	public TubeLight(){
		System.out.println("The TubeLight Constructor is invoked");
	}
	public void getInformation(){
		System.out.println("The TubeLight details: ");
		System.out.println("The TubeLight id is: "+id);
		System.out.println("The TubeLight brand: "+brand);
		System.out.println("The TubeLight price: "+price);
		System.out.println("The TubeLight voltage: "+voltage);
		System.out.println();
		
	}
}
	