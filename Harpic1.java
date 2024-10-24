class Harpic1{
	int id ;
	int quantity ;
	double price ;
	String color;
	public Harpic1(){
		System.out.println("The Harpic constructor is invoked");
	}
	public Harpic1(int i ,int qt ,double p ,String clr){
		System.out.println("The Harpic constructor is invoked");
		id=i;
		quantity=qt;
		price=p;
		color=clr;
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