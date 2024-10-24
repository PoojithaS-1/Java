class Train1{
	int trainNo ;
	int noOfCoaches ;
	String trainName;
	
	public Train1(){
		System.out.println("The Train constructor is invoked");
	}
	public Train1(int tNo ,int coaches ,String tName){
		System.out.println("The Train constructor is invoked");
		trainNo=tNo;
		noOfCoaches=coaches;
		trainName=tName;
	}
	public void showDetails(){
	System.out.println("Train details: ");
	System.out.println("The Train number is: "+trainNo);
	System.out.println("Number of coaches are: "+noOfCoaches);
	System.out.println("The train name is: "+trainName);
	System.out.println();
}
}