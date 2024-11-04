public class RainCoats{
	private String closure;
	private String fabric;
	private String color;
	private int netQuantity;
	private double price;
	
	public RainCoats(){
		System.out.println("RainCoats constructor is invoked");
	}
	public void setClosure(String closure){
		this.closure=closure;
	}
	public String getClosure(){
		return closure;
	}
	public void setFabric(String fabric){
		this.fabric=fabric;
	}
	public String getFabric(){
		return fabric;
	}
	public void setColor(String  color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setNetQuantity(int netQuantity){
		this.netQuantity=netQuantity;
	}
	public int getNetQuantity(){
		return netQuantity;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
}