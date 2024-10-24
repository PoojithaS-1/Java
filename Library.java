class Library{ 
	int libraryId ;
	String address ; 
	String libraryOwnerName;
	public Library(){
		System.out.println("The Library constructor is invoked");
	}
	public void getDetails(){
	System.out.println("The Library details: ");
	System.out.println("The libraryId is: "+libraryId);
	System.out.println("The address is: "+address);
	System.out.println("The libraryOwnerName is : "+libraryOwnerName);
	System.out.println();
	}
}