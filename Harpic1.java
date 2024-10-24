class Harpic1{
	int id ;
	int quantity ;
	double price ;
	String color;
	public Harpic1(){
		this(1,250);
		System.out.println("The Harpic constructor is invoked");
	}
	public Harpic1(int id ,int quantity ){
		this(50.00,"Blue");
		System.out.println("2 arguments(int,int) Harpic constructor is invoked");
		this.id=id;
		this.quantity=quantity;
		
	}
	public Harpic1(double price ,String color){
		System.out.println("2 arguments(double,string) Harpic constructor is invoked");
		this.price=price;
		this.color=color;
	}
	public void getInfo(){
		System.out.println("The details of Harpic are: ");
		System.out.println("The Harpic id: "+this.id);
		System.out.println("The quantity is: "+this.quantity);
		System.out.println("The price of Harpic: "+this.price);
		System.out.println("The color is: "+this.color);
		System.out.println();
}
}