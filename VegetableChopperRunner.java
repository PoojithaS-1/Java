class VegetableChopperRunner{
	public static void main(String vegetables[]){
	VegetableChopper chopper=new VegetableChopper();
	chopper.setSize(750);
	int size=chopper.getSize();
	System.out.println("chopper size is: "+size+ " ml");	
	chopper.setBrand("Emergity");
	String brand=chopper.getBrand();
	System.out.println("chopper brand: "+brand);
	chopper.setProductDimensions("12.5D x 12.5W x 11H Centimeters");
	String productDimensions=chopper.getProductDimensions();
	System.out.println("productDimensions is: "+productDimensions);
	chopper.setColor("Multi Colour");
	String color=chopper.getColor();
	System.out.println("chopper color is: "+color);
	chopper.setBowlCapacity(0.75f);
	float bowlCapacity=chopper.getBowlCapacity();
	System.out.println("Bowl-Capacity is: "+bowlCapacity+" litres");
	}
}
