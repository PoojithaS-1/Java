class PanCard{ 
	String panNumber ;
	String name ;
	String fatherName ;
	String dob;
	public PanCard(){
		System.out.println("The PanCard constructor is invoked");
	}
	public void getDetails(){
	System.out.println("The PanCarddetails: ");
	System.out.println("The panNumber is: "+panNumber);
	System.out.println("The name is: "+name);
	System.out.println("Father name is: "+fatherName);
	System.out.println("Date of birth is: "+dob);
	System.out.println();
	}
}