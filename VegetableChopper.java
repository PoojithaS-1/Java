public class VegetableChopper{
	private int size; 
	private String brand;	
	private String productDimensions;	
	private String color;
	private float bowlCapacity;	
	
	public VegetableChopper(){
		System.out.println("VegetableChopper constructor invoked");
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
	public void setProductDimensions(String productDimensions){
		this.productDimensions=productDimensions;
	}
	public String getProductDimensions(){
		return productDimensions;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setBowlCapacity(float bowlCapacity){
		this.bowlCapacity=bowlCapacity;
	}
	public float getBowlCapacity(){
		return bowlCapacity;
	}
}