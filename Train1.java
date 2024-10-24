class Train1{
	int trainNo ;
	int noOfCoaches ;
	String trainName;
	
	public Train1(){
		this(101,40);
		System.out.println("The no arguments Train constructor is invoked");
	}
	public Train1(int trainNo ,int noOfCoaches ){
		this("Rajdhani Express");
		System.out.println("The 2 arguments Train constructor is invoked");
		this.trainNo=trainNo;
		this.noOfCoaches=noOfCoaches;
		
	}
	public Train1(String trainName){
		System.out.println("The 1 argument Train constructor is invoked");
		this.trainName=trainName;
	}
	public void showDetails(){
	System.out.println("Train details: ");
	System.out.println("The Train number is: "+this.trainNo);
	System.out.println("Number of coaches are: "+this.noOfCoaches);
	System.out.println("The train name is: "+this.trainName);
	System.out.println();
}
}