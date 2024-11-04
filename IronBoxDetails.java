public class IronBoxDetails{
	private String type;
	private String brand;
	private String model;
	private double price;
	private boolean isSteamFunction;
	
	public IronBoxDetails(){
		System.out.println("The IronBox constructor is invoked");
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	public void setSteamFunction(boolean isSteamFunction){
		this.isSteamFunction=isSteamFunction;
	}
	public boolean isSteamFunction(){
		return isSteamFunction;
	}
}