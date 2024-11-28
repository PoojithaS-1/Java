package com.xworkz.railwaystationsystem;

import com.xworkz.railwaystationsystem.railwaystationguidelines.RailwayStationGuidelines;
import com.xworkz.railwaystationsystem.railwaystationguidelinesimpl.RailwayStationGuidelinesImpl;

public class RailwayStationRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        RailwayStationGuidelines railwayStationGuidelines = new RailwayStationGuidelinesImpl();
        System.out.println("Railway Station Guidelines: ");
        railwayStationGuidelines.arriveAtLeast30MinutesBeforeTrainDeparture();
        railwayStationGuidelines.carryValidTicketAndIDProof();
        railwayStationGuidelines.followStationRulesAndAnnouncements();
        railwayStationGuidelines.keepLuggageSecureAndTagged();
        railwayStationGuidelines.beAwareOfPickpocketingAndTheft();
        railwayStationGuidelines.useDesignatedSmokingAreas();
        railwayStationGuidelines.keepStationPremisesClean();
        railwayStationGuidelines.followPlatformRulesAndSigns();
        railwayStationGuidelines.beCautiousOfMovingTrainsAndPlatforms();
        railwayStationGuidelines.useEscalatorsAndElevatorsSafely();
        railwayStationGuidelines.followInstructionsFromRailwayStaff();
        railwayStationGuidelines.keepChildrenUnderAdultSupervision();
        railwayStationGuidelines.avoidEatingOnPlatforms();
        railwayStationGuidelines.usePublicAddressSystemForAnnouncements();
        railwayStationGuidelines.followEmergencyEvacuationProcedures();
        System.out.println("Main Ended");
    }
}