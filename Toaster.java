public class Toaster{
	private String brand;	
	private double price; 
	private String material;	
	private String productDimensions;	
	private String specificUseOfProduct;	
	
	public Toaster(){
		System.out.println("Toaster constructor is invoked");
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	public void setMaterial(String material){
		this.material=material;
	}
	public String getMaterial(){
		return material;
	}
	public void setProductDimensions(String productDimensions){
		this.productDimensions=productDimensions;
	}
	public String getProductDimensions(){
		return productDimensions;
	}
	public void setSpecificUseOfProduct(String specificUseOfProduct){
		this.specificUseOfProduct=specificUseOfProduct;
	}
	public String getSpecificUseOfProduct(){
		return specificUseOfProduct;
	}
}