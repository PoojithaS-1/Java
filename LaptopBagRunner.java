class LaptopBagRunner{
	public static void main(String laptop[]){
	LaptopBag bag=new LaptopBag();
	bag.setSize(15);
	int size=bag.getSize();
	System.out.println("LaptopBag size is: "+size+" inches");
	bag.setColor("Black");
	String color=bag.getColor();
	System.out.println("LaptopBag color is: "+color);
	bag.setMaterial("Polyester");
	String material=bag.getMaterial();
	System.out.println("LaptopBag material is: "+material);
	bag.setWaterProof(true);
	boolean isWaterproof=bag.isWaterproof();
	System.out.println("Is LaptopBag WaterProof: "+isWaterproof);
	bag.setNumberOfCompartments(3);
	int numberOfCompartments=bag.getNumberOfCompartments();
	System.out.println("numberOfCompartments of laptop bag is: "+numberOfCompartments);
	}
}