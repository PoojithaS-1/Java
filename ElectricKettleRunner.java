class ElectricKettleRunner{
	public static void main(String k[]){
	ElectricKettle kettle=new ElectricKettle();
	kettle.setBrand("Pigeon");
	String brand=kettle.getBrand();
	System.out.println("Kettle brand is: "+brand);
	kettle.setColor("Black & Silver");
	String color=kettle.getColor();
	System.out.println("Kettle color is: "+color);
	kettle.setCapacity(1.5f);
	float capacity=kettle.getCapacity();
	System.out.println("Kettle capacity is: "+capacity+ " Litres");
	kettle.setMaterial("Stainless Steel,Plastic");
	String material=kettle.getMaterial();
	System.out.println("Kettle material is: "+material);
	kettle.setVoltage(240);
	int voltage=kettle.getVoltage();
	System.out.println("voltage of Kettle is: "+voltage);
	}
}