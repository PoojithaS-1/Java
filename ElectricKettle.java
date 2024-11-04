public class ElectricKettle{
	private String brand; 
	private String color; 
	private float capacity;
	private String material; 
	private int voltage;
	
	public ElectricKettle(){
		System.out.println("ElectricKettle constructor is invoked");
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
	public void setCapacity(float capacity){
		this.capacity=capacity;
	}
	public float getCapacity(){
		return capacity;
	}
	public void setMaterial(String material){
		this.material=material;
	}
	public String getMaterial(){
		return material;
	}
	public void setVoltage(int voltage){
		this.voltage=voltage;
	}
	public int getVoltage(){
		return voltage;
	}
}