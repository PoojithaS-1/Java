class MicroWaveOvenRunner{
	public static void main(String bake[]){
	MicroWaveOven oven=new MicroWaveOven();
	oven.setSize(20);
	int size=oven.getSize();
	System.out.println("oven size is: "+size+ " L");
	oven.setBrand("Panasonic");
	String brand=oven.getBrand();
	System.out.println("Oven Brand is: "+brand);
	oven.setColor("Silver");
	String color=oven.getColor();
	System.out.println("Oven color is: "+color);
	oven.setHeatingMethod("Solo");
	String heatingMethod=oven.getHeatingMethod();
	System.out.println("oven heatingMethod is: "+heatingMethod);
	oven.setFuelType("Electric");
	String fuelType=oven.getFuelType();
	System.out.println("Oven FuelType: "+fuelType);
	}
}