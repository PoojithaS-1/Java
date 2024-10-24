class Harpic{
	int id ;
	int quantity ;
	double price ;
	String color;
	public Harpic(){
		System.out.println("The Harpic constructor is invoked");
	}
	public void getInfo(){
		System.out.println("The details of Harpic are: ");
		System.out.println("The Harpic id: "+id);
		System.out.println("The quantity is: "+quantity);
		System.out.println("The price of Harpic: "+price);
		System.out.println("The color is: "+color);
		System.out.println();
}
}