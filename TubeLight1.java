class TubeLight1{
	int id;
	String brand ;
	double price ;
	String voltage;
	public TubeLight1(){
		System.out.println("The TubeLight Constructor is invoked");
	}
	public TubeLight1(int i,String b ,double p ,String v){
		System.out.println("The TubeLight Constructor is invoked");
		id=i;
		brand=b;
		price=p;
		voltage=v;
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
	