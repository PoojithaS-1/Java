class Glass1{
	int glassId;
	String type;
	public Glass1(){
		System.out.println("The Glass constructor invoked");
	}
	public Glass1(int gId,String tp){
		System.out.println("The Glass constructor invoked");
		glassId=gId;
		type=tp;
	}
	public void showInfo(){
		System.out.println("The glass details: ");
		System.out.println("The glassId is: "+glassId);
		System.out.println("The glass type is: "+type);
		System.out.println();
	}
}