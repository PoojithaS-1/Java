class Glass{
	int glassId;
	String type;
	public Glass(){
		System.out.println("The Glass constructor invoked");
	}
	public void showInfo(){
		System.out.println("The glass details: ");
		System.out.println("The glassId is: "+glassId);
		System.out.println("The glass type is: "+type);
		System.out.println();
	}
}