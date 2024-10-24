class Library1{ 
	int libraryId ;
	String address ; 
	String libraryOwnerName;
	public Library1(){
		System.out.println("The Library constructor is invoked");
	}
	public Library1(int libId ,String addr ,String libOwnerName){
		System.out.println("The Library constructor is invoked");
		libraryId=libId;
		address=addr;
		libraryOwnerName=libOwnerName;
		
	}
	public void getDetails(){
	System.out.println("The Library details: ");
	System.out.println("The libraryId is: "+libraryId);
	System.out.println("The address is: "+address);
	System.out.println("The libraryOwnerName is : "+libraryOwnerName);
	System.out.println();
	}
}