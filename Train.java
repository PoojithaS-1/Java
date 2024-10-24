class Train{
	int trainNo ;
	int noOfCoaches ;
	String trainName;
	public Train(){
		System.out.println("The Train constructor is invoked");
	}
	public void showDetails(){
	System.out.println("Train details: ");
	System.out.println("The Train number is: "+trainNo);
	System.out.println("Number of coaches are: "+noOfCoaches);
	System.out.println("The train name is: "+trainName);
	System.out.println();
}
}