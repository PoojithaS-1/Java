class TrainTicket1{
	int pnr;
	int age;
	String name;
	String gender ;
	public TrainTicket1(){
		this(1,24);
		System.out.println("The no arguments TrainTicket constructor invoked");
	}
	public TrainTicket1(int pnr,int age){
		this("pooja","female");
		System.out.println("The 2 arguments(int,int) TrainTicket constructor invoked");
		this.pnr=pnr;
		this.age=age;
		
	}
	public TrainTicket1(String name,String gender){
		System.out.println("The 2 arguments(string,string) TrainTicket constructor invoked");
		this.name=name;
		this.gender=gender;
	}
	public void getDetails(){
	System.out.println("The TrainTicket details: ");
	System.out.println("The passanger pnr is: "+this.pnr);
	System.out.println("The passanger age is: "+this.age);
	System.out.println("The passanger name is: "+this.name);
	System.out.println("The passanger gender is: "+this.gender);
	System.out.println();
	}
}