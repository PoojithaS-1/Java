class Bread{
	String brandName; 
	int noOfSlices;
	String type;
	public Bread(){
		System.out.println("The Bread Constructor is invoked");
	}
	public void getInfo(){
		System.out.println("The bread details: ");
		System.out.println("The brandName is: "+brandName);
		System.out.println("The noOfSlices is: "+noOfSlices);
		System.out.println("The type is: "+type);
		System.out.println();
	}
}
