class TrainTicket1{
	int pnr;
	int age;
	String name;
	String gender ;
	public TrainTicket1(){
		System.out.println("The TrainTicket constructor invoked");
	}
	public TrainTicket1(int p,int a,String n,String g){
		System.out.println("The TrainTicket constructor invoked");
		pnr=p;
		age=a;
		name=n;
		gender=g;
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