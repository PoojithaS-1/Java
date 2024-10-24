class PanCard1{ 
	String panNumber ;
	String name ;
	String fatherName ;
	String dob;
	public PanCard1(){
		System.out.println("The PanCard constructor is invoked");
	}
	public PanCard1(String pNumber ,String n,String fName ,String dofb){
		System.out.println("The PanCard constructor is invoked");
		panNumber=pNumber;
		name=n;
		fatherName=fName;
		dob=dofb;
		
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