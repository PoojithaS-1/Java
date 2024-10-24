class ElectricityBill{
	String rrNo ;
	long accountId; 
	String address;
	public ElectricityBill(){
		System.out.println("ElectricityBill Constructor is invoked");
	}
	public void getInfo(){
	System.out.println("The ElectricityBill consists of:");
	System.out.println("The rrNo is: "+rrNo);
	System.out.println("The accountId is: "+accountId);
	System.out.println("The address is: "+address);
	
	}
}