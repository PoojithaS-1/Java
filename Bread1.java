class Bread1{
	String brandName; 
	int noOfSlices;
	String type;
	public Bread1(){
		this("Whole Wheat",20);
		System.out.println("Bread no arguments Constructor is invoked");
	}
	public Bread1(String brandName,int noOfSlices){
		this("Whole Grain");
		System.out.println("2 arguments Bread Constructor is invoked");
		this.brandName=brandName;
		this.noOfSlices=noOfSlices;
		
	}
	public Bread1(String type){
		System.out.println("1 argument Bread Constructor is invoked");
		this.type=type;
	}
	public void getInfo(){
		System.out.println("The bread details: ");
		System.out.println("The brandName is: "+this.brandName);
		System.out.println("The noOfSlices is: "+this.noOfSlices);
		System.out.println("The type is: "+this.type);
		System.out.println();
	}
}
