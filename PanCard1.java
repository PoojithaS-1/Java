class PanCard1{
	String panNo;
	String name;
	String fatherName;
	String dob;
	int cost;
	
	public PanCard1()
	{
		this("PANJF7896Y","Arjun");
		System.out.println("PANCard constructor called with no arguments!!");
	}
	public PanCard1(String panNo,String name)
	{
		this("Rajesh","12/09/2000",350);
		System.out.println("Parameterized constructor with two string type variable");
		this.panNo = panNo;
		this.name = name;
	}
	public PanCard1(String fatherName,String dob,int cost)
	{
		System.out.println("Parameterized constructor with two string and int type variable");
		this.fatherName = fatherName;
		this.dob = dob;
		this.cost = cost;
	}
	public void getDetails(){
		System.out.println("PAN Number: "+this.panNo);
		System.out.println("Name: "+this.name);
		System.out.println("Father name: "+this.fatherName);
		System.out.println("DOB: "+this.dob);
		System.out.println("Cost: "+this.cost);
	}
}