class TrainingBatch{
	String batchName;
	int noOfTrinees ;
	String trainerName;  
	String instituteName;
	public TrainingBatch(){
		System.out.println("The TrainingBatch constructor is invoked");
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