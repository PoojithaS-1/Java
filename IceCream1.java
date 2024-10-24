class IceCream1{
	int id ;
	String brand ;
	String flavors ;
	String type ;
	int quantity;
	public IceCream1(){
		System.out.println("The IceCream constructor invoked");
	}
	public IceCream1(int i ,String b ,String flvr ,String tp ,int qty){
		System.out.println("The IceCream constructor invoked");
		id=i;
		brand=b;
		flavors=flvr;
		type=tp;
		quantity=qty;
	}
	public void displayInfo(){
		System.out.println("The IceCream details: ");
		System.out.println("The iceCream id is: "+id);
		System.out.println("The iceCream brand is: "+brand);
		System.out.println("The iceCream flavorsare: "+flavors);
		System.out.println("The iceCream type is: "+type);
		System.out.println("The iceCream quantity is: "+quantity);
		System.out.println();
	}
}