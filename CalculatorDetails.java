public class CalculatorDetails{
	private String brand;	
	private boolean isSolarPowered;
	private String calculatorType;	
	private String powerSource;	
	private int screenSize;	
	
	public CalculatorDetails(){
		System.out.println("CalculatorDetails constructor is invoked");
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setSolarPowered(boolean isSolarPowered){
		this.isSolarPowered=isSolarPowered;
	}
	public boolean isSolarPowered(){
		return isSolarPowered;
	}
	public void setCalculatorType(String calculatorType){
		this.calculatorType=calculatorType;
	}
	public String getCalculatorType(){
		return calculatorType;
	}
	public void setPowerSource(String powerSource){
		this.powerSource=powerSource;
	}
	public String getPowerSource(){
		return powerSource;
	}
	public void setScreenSize(int screenSize){
		this.screenSize=screenSize;
	}
	public int getScreenSize(){
		return screenSize;
	}
}