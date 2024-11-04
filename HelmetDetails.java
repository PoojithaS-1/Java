public class HelmetDetails{

	private String color;	
	private String brand;	
	private String vehicleServiceType;	
	private int itemWeight;
	private String material;	
	
	public HelmetDetails(){
		System.out.println("HelmetDetails constructor is invoked");
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setVehicleServiceType(String vehicleServiceType){
		this.vehicleServiceType=vehicleServiceType;
	}
	public String getVehicleServiceType(){
		return vehicleServiceType;
	}
	public void setItemWeight(int itemWeight){
		this.itemWeight=itemWeight;
	}
	public int getItemWeight(){
		return itemWeight;
	}
	public void setMaterial(String material){
		this.material=material;
	}
	public String getMaterial(){
		return material;
	}
}