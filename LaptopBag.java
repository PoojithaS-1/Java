public class LaptopBag{
	private int size;
	private String color;
	private String material;
	private boolean isWaterproof; 
	private int numberOfCompartments;
	
	public LaptopBag(){
		System.out.println("LaptopBag constructor is invoked");
	}
	public void setSize(int size){
		this.size=size;
	}
	public int getSize(){
		return size;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setMaterial(String material){
		this.material=material;
	}
	public String getMaterial(){
		return material;
	}
	public void setWaterProof(boolean isWaterproof){
		this.isWaterproof=isWaterproof;
	}
	public boolean isWaterproof(){
		return isWaterproof;
	}
	public void setNumberOfCompartments(int numberOfCompartments){
		this.numberOfCompartments=numberOfCompartments;
	}
	public int getNumberOfCompartments(){
		return numberOfCompartments;
	}
}
	