class OperatingSystems1{
	String name ;
	String version;
	public OperatingSystems1(){
		System.out.println("The OperatingSystems constructor invoked");
	}
	public OperatingSystems1(String n,String v){
		System.out.println("The OperatingSystems constructor invoked");
		name=n;
		version=v;
		
	}
	public void getDetails(){
	System.out.println("The OperatingSystems details: ");
	System.out.println("The Os name is: "+name);
	System.out.println("The Os version is: "+version);
	System.out.println();
}
}