public class WashingMachine{
	private int capacity;
	private String brand;	
	private int voltage;	
	private int maximumRotationalSpeed;	
	private String accessLocation;
	
	public WashingMachine(){
		System.out.println("WashingMachine constructor is invoked");
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setVoltage(int voltage){
		this.voltage=voltage;
	}
	public int getVoltage(){
		return voltage;
	}
	public void setMaximumRotationalSpeed(int maximumRotationalSpeed){
		this.maximumRotationalSpeed=maximumRotationalSpeed;
	}
	public int getMaximumRotationalSpeed(){
		return maximumRotationalSpeed;
	}
	public void setAccessLocation(String accessLocation){
		this.accessLocation=accessLocation;
	}
	public String getAccessLocation(){
		return accessLocation;
	}
}
	
	