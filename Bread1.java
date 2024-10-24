class Bread1{
	String brandName; 
	int noOfSlices;
	String type;
	public Bread1(){
		System.out.println("The Bread Constructor is invoked");
	}
	public Bread1(String bName,int noOfSlice,String tp){
		System.out.println("The Bread Constructor is invoked");
		brandName=bName;
		noOfSlices=noOfSlice;
		type=tp;
	}
	public void getInfo(){
		System.out.println("The bread details: ");
		System.out.println("The brandName is: "+brandName);
		System.out.println("The noOfSlices is: "+noOfSlices);
		System.out.println("The type is: "+type);
		System.out.println();
	}
}
