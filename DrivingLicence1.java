class DrivingLicence1{
	String dlNo;
	String name;
	String dob ;
	String validTill ;
	String bloodGroup;
	String fatherName ; 
	long rtoOfficeNumber;
	public DrivingLicence1(){
		System.out.println("The DrivingLicence constructor is invoked");
	}
	public DrivingLicence1(String dNo,String n,String dofb ,String vT ,String bG,String fName ,long rtoNumber){
		System.out.println("The DrivingLicence constructor is invoked");
		dlNo=dNo;
		name=n;
		dob=dofb;
		validTill=vT;
		bloodGroup=bG;
		fatherName=fName;
		rtoOfficeNumber=rtoNumber;
	}
	public void getInfo(){
	System.out.println("The DrivingLicence details: ");
	System.out.println("The dlNo is: "+dlNo);
	System.out.println("Name is: "+name);
	System.out.println("Date of birth is: "+dob);
	System.out.println("validTill: "+validTill);
	System.out.println("The bloodGroup is: "+bloodGroup);
	System.out.println("Father Name is: "+fatherName);
	System.out.println("The rtoOfficeNumber is: "+rtoOfficeNumber);
	System.out.println();
	}
}