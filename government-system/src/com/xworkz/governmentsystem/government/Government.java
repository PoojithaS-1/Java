package com.xworkz.governmentsystem.government;

public class Government {
        private String state;
        private int noOfMlas;
        private  String partyHeadName;
        private String homeMinisterName;

        public Government() {
            System.out.println("Abki baar Modi Sarkar");
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getNoOfMlas() {
            return noOfMlas;
        }

        public void setNoOfMlas(int noOfMlas) {
            this.noOfMlas = noOfMlas;
        }

        public String getPartyHeadName() {
            return partyHeadName;
        }

        public void setPartyHeadName(String partyHeadName) {
            this.partyHeadName = partyHeadName;
        }

        public String getHomeMinisterName() {
            return homeMinisterName;
        }

        public void setHomeMinisterName(String homeMinisterName) {
            this.homeMinisterName = homeMinisterName;
        }

        public void freeEducation(){
            System.out.println("invoked from government class");
            System.out.println("Free education for all students under the age of 15");
        }

        public void  getGovernmentInfo(){
            System.out.println("Government Info: ");
            System.out.println("State: "+getState());
            System.out.println("Number of MLAs: "+getNoOfMlas());
            System.out.println("Party head name: "+getPartyHeadName());
            System.out.println("Home minister name: "+getHomeMinisterName());
        }
}
