class TrainTicket{
	int pnr;
	int age;
	String name;
	String gender ;
	public TrainTicket(){
		System.out.println("The TrainTicket constructor invoked");
	}
	public void getDetails(){
	System.out.println("The TrainTicket details: ");
	System.out.println("The passanger pnr is: "+pnr);
	System.out.println("The passanger age is: "+age);
	System.out.println("The passanger name is: "+name);
	System.out.println("The passanger gender is: "+gender);
	System.out.println();
	}
}