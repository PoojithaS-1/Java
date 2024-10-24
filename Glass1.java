class Glass1{
	int glassId;
	String type;
	public Glass1(){
		this(101);
		System.out.println("The no argument Glass constructor invoked");
	}
	public Glass1(int glassId){
		this("Water Glass");
		System.out.println("1 argument(int) Glass constructor invoked");
		this.glassId=glassId;
		
	}
	public Glass1(String type){
		System.out.println("1 argument Glass constructor invoked");
		this.type=type;
	}
	public void showInfo(){
		System.out.println("The glass details: ");
		System.out.println("The glassId is: "+this.glassId);
		System.out.println("The glass type is: "+this.type);
		System.out.println();
	}
}