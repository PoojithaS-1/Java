class ElectricityBill1{
	String rrNo ;
	long accountId; 
	String address;
	public ElectricityBill1(){
		System.out.println("ElectricityBill Constructor is invoked");
	}
	public ElectricityBill1(String rNo,long accId,String addr){
		System.out.println("ElectricityBill Constructor is invoked");
		rrNo=rNo ;
		accountId=accId; 
		address=addr;
	}
	public void getInfo(){
	System.out.println("The ElectricityBill consists of:");
	System.out.println("The rrNo is: "+rrNo);
	System.out.println("The accountId is: "+accountId);
	System.out.println("The address is: "+address);
	
	}
}