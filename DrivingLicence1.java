class DrivingLicence1{
	String dlNo;
	String name;
	String dob ;
	String validTill ;
	String bloodGroup;
	String fatherName ; 
	long rtoOfficeNumber;
	public DrivingLicence1(){
		this("l3456767","pooja","20-09-2001","04/2024");
		System.out.println("The DrivingLicence no arguments constructor is invoked");
	}
	public DrivingLicence1(String dlNo,String name,String dob ,String validTill ){
		this("A+","Srinivas",987653456789l);
		System.out.println("The DrivingLicence 4 arguments constructor is invoked");
		this.dlNo=dlNo;
		this.name=name;
		this.dob=dob;
		this.validTill=validTill;
		
	}
	public DrivingLicence1(String bloodGroup,String fatherName ,long rtoOfficeNumber){
		System.out.println("The DrivingLicence 3 arguments constructor is invoked");
	
		this.bloodGroup=bloodGroup;
		this.fatherName=fatherName;
		this.rtoOfficeNumber=rtoOfficeNumber;
	}
	public void getInfo(){
	System.out.println("The DrivingLicence details: ");
	System.out.println("The dlNo is: "+this.dlNo);
	System.out.println("Name is: "+this.name);
	System.out.println("Date of birth is: "+this.dob);
	System.out.println("validTill: "+this.validTill);
	System.out.println("The bloodGroup is: "+this.bloodGroup);
	System.out.println("Father Name is: "+this.fatherName);
	System.out.println("The rtoOfficeNumber is: "+this.rtoOfficeNumber);
	System.out.println();
	}
}