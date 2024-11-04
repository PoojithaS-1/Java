public class MicroWaveOven{
	private int size;	
	private String brand;	
	private String color;	
	private String heatingMethod;	
	private String fuelType;	
	
	public MicroWaveOven(){
		System.out.println("MicroWaveOven constructor is invoked" );
	}
	public void setSize(int size){
		this.size=size;
	}
	public int getSize(){
		return size;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setHeatingMethod(String heatingMethod){
		this.heatingMethod=heatingMethod;
	}
	public String getHeatingMethod(){
		return heatingMethod;
	}
	public void setFuelType(String fuelType){
		this.fuelType=fuelType;
	}
	public String getFuelType(){
		return fuelType;
	}
}