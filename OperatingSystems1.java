class OperatingSystems1{
	String name ;
	String version;
	public OperatingSystems1(){
		this("Windows","Windows 11 (2021)");
		System.out.println("The OperatingSystems no arguments constructor invoked");
	}
	public OperatingSystems1(String name,String version){
		
		System.out.println("The OperatingSystems 2 arguments constructor invoked");
		this.name=name;
		this.version=version;
	}
	
	public void getDetails(){
	System.out.println("The OperatingSystems details: ");
	System.out.println("The Os name is: "+this.name);
	System.out.println("The Os version is: "+this.version);
	System.out.println();
}
}