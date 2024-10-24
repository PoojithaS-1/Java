class TrainingBatch1{
	String batchName;
	int noOfTrinees ;
	String trainerName;  
	String instituteName;
	public TrainingBatch1(){
		this("java2017",3);
		System.out.println("The no arguments TrainingBatch constructor is invoked");
	}
	public TrainingBatch1(String batchName,int noOfTrinees){
		this("Ram","TAP Academy");
		System.out.println("The 2 arguments(string,int) TrainingBatch constructor is invoked");
		this.batchName=batchName;
		this.noOfTrinees=noOfTrinees;
		
	}
	public TrainingBatch1(String trainerName,String instituteName){
		System.out.println("The 2 arguments(string,string)TrainingBatch constructor is invoked");
		
		this.trainerName=trainerName;
		this.instituteName=instituteName;
	}
	public void getInfo(){
	System.out.println("The TrainingBatch details: ");
	System.out.println("The TrainingBatch name is: "+this.batchName);
	System.out.println("The noOfTrinees are: "+this.noOfTrinees );
	System.out.println("The trainerName is: "+this.trainerName);
	System.out.println("The instituteName is: "+this.instituteName);
	System.out.println();
	}
}