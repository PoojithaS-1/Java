class TrainingBatch1{
	String batchName;
	int noOfTrinees ;
	String trainerName;  
	String instituteName;
	public TrainingBatch1(){
		System.out.println("The TrainingBatch constructor is invoked");
	}
	public TrainingBatch1(String bName,int trainees,String tName,String iName){
		System.out.println("The TrainingBatch constructor is invoked");
		batchName=bName;
		noOfTrinees=trainees;
		trainerName=tName;
		instituteName=iName;
	}
	public void getInfo(){
	System.out.println("The TrainingBatch details: ");
	System.out.println("The TrainingBatch name is: "+batchName);
	System.out.println("The noOfTrinees are: "+noOfTrinees );
	System.out.println("The trainerName is: "+trainerName);
	System.out.println("The instituteName is: "+instituteName);
	System.out.println();
	}
}