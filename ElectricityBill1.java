class ElectricityBill1{
	String rrNo ;
	long accountId; 
	String address;
	public ElectricityBill1(){
		this("2345E",22345678910l);
		System.out.println("ElectricityBill no arguments Constructor is invoked");
	}
	public ElectricityBill1(String rrNo,long accountId){
		this("9th Main Girinagar");
		System.out.println("2 arguments ElectricityBill Constructor is invoked");
		this.rrNo=rrNo ;
		this.accountId=accountId; 
		this.address=address;
	}
	public ElectricityBill1(String address){
		
		System.out.println("1 argument ElectricityBill Constructor is invoked");
		this.address=address;
	}
	public void getInfo(){
	System.out.println("The ElectricityBill consists of:");
	System.out.println("The rrNo is: "+this.rrNo);
	System.out.println("The accountId is: "+this.accountId);
	System.out.println("The address is: "+this.address);
	
	}
}