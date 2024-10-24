class Library1{ 
	int libraryId ;
	String address ; 
	String libraryOwnerName;
	public Library1(){
		this(101,"Bhadravathi");
		System.out.println("The Library no arguments constructor is invoked");
	}
	public Library1(int libraryId ,String address){
		this("Ramesh");
		System.out.println("The Library 2 arguments constructor is invoked");
		this.libraryId=libraryId;
		this.address=address;
		
		
	}
	public Library1(String libraryOwnerName){
		
		System.out.println("The Library 1 argument constructor is invoked");
		
		this.libraryOwnerName=libraryOwnerName;
		
	}
	public void getDetails(){
	System.out.println("The Library details: ");
	System.out.println("The libraryId is: "+this.libraryId);
	System.out.println("The address is: "+this.address);
	System.out.println("The libraryOwnerName is : "+this.libraryOwnerName);
	System.out.println();
	}
}