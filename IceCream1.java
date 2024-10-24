class IceCream1{
	int id ;
	String brand ;
	String flavors ;
	String type ;
	int quantity;
	public IceCream1(){
		this(1,"Ben & Jerry'S","Chocolate, Vanilla");
		System.out.println("The no arguments IceCream constructor invoked");
	}
	public IceCream1(int id ,String brand ,String flavors ){
		this("Cup",44);
		System.out.println("The 3 arguments IceCream constructor invoked");
		this.id=id;
		this.brand=brand;
		this.flavors=flavors;
	}
	public IceCream1(String type ,int quantity){
		
		System.out.println("The 2 arguments IceCream constructor invoked");
		this.type=type;
		this.quantity=quantity;
	}
	public void displayInfo(){
		System.out.println("The IceCream details: ");
		System.out.println("The iceCream id is: "+this.id);
		System.out.println("The iceCream brand is: "+this.brand);
		System.out.println("The iceCream flavorsare: "+this.flavors);
		System.out.println("The iceCream type is: "+this.type);
		System.out.println("The iceCream quantity is: "+this.quantity);
		System.out.println();
	}
}