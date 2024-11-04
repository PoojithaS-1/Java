class CalculatorDetailsRunner{
	public static void main(String maths[]){
	CalculatorDetails calculator=new CalculatorDetails();
	calculator.setBrand("Casio");
	String brand=calculator.getBrand();
	System.out.println("calculator brand is: "+brand);
	calculator.setSolarPowered(true);
	boolean isSolarPowered=calculator.isSolarPowered();
	System.out.println("Is calculator SolarPowered: "+isSolarPowered);
	calculator.setCalculatorType("Business");
	String calculatorType=calculator.getCalculatorType();
	System.out.println("calculator type is: "+calculatorType);
	calculator.setPowerSource("Solar Powered");
	String powerSource=calculator.getPowerSource();
	System.out.println("calculator powerSource: "+powerSource);
	calculator.setScreenSize(7);
	int screenSize=calculator.getScreenSize();
	System.out.println("screenSize of calculator is: "+screenSize+ " inches");
	}
}