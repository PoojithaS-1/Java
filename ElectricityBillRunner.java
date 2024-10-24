class ElectricityBillRunner{
	public static void main (String bill[]){
	ElectricityBill bills1= new ElectricityBill();
	bills1.rrNo="2345E";
	bills1.accountId=22345678910l;
	bills1.address="9th Main Girinagar";
	bills1.getInfo();
	System.out.println();
	
	ElectricityBill bills2=new ElectricityBill();
	bills2.rrNo="2875E";
	bills2.accountId=11345675910l;
	bills2.address="2nd stage Srinagar";
	bills2.getInfo();
	System.out.println();
	
	ElectricityBill bills3=new ElectricityBill();
	bills3.rrNo="3335E";
	bills3.accountId=444675912l;
	bills3.address="Rajajinagar 5th block";
	bills3.getInfo();
	System.out.println();
	
	ElectricityBill bills4=new ElectricityBill();
	bills4.rrNo="4444E";
	bills4.accountId=98765432345l;
	bills4.address="3rd stage Hanumanthnagar";
	bills4.getInfo();
	System.out.println();
	
	ElectricityBill bills5=new ElectricityBill();
	bills5.rrNo="5678E";
	bills5.accountId=98456798745l;
	bills5.address="4th stage Srinivasnagar";
	bills5.getInfo();
	System.out.println();
	
	ElectricityBill bills6=new ElectricityBill();
	bills6.rrNo="09877E";
	bills6.address="5th stage Srinagar";
	bills6.getInfo();
	System.out.println();
	
	ElectricityBill bills7=new ElectricityBill();
	bills7.rrNo="87646E";
	bills7.accountId=468654563330l;
	bills7.address="3rd stage vijaynagar";
	bills7.getInfo();
	System.out.println();
	
	ElectricityBill bills8=new ElectricityBill();
	bills8.rrNo="45677878E";
	bills8.getInfo();
	System.out.println();
	
	ElectricityBill bills9=new ElectricityBill();
	bills9.rrNo="3457E";
	bills9.accountId=11345675678l;
	bills9.address="6th stage Mahalakshmi";
	bills9.getInfo();
	System.out.println();
	
	
	}
}