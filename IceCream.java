class IceCream{
	int id ;
	String brand ;
	String flavors ;
	String type ;
	int quantity;
	public IceCream(){
		System.out.println("The IceCream constructor invoked");
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