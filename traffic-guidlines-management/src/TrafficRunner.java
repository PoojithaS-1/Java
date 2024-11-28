import com.xworkz.trafficapp.trafficguidlines.TrafficGuidlines;
import com.xworkz.trafficapp.trafficguidlinesimpl.TrafficGuidelinesImpl;

public class TrafficRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        TrafficGuidlines trafficGuidlines=new TrafficGuidelinesImpl();
        System.out.println("Traffic Guidelines: ");
        trafficGuidlines.wearAHelmet();
        trafficGuidlines.followTrafficSignals();
        trafficGuidlines.maintainSpeedLimits();
        trafficGuidlines.useSeatbelts();
        trafficGuidlines.avoidUsingMobilePhones();
        trafficGuidlines.giveWayToPedestrians();
        trafficGuidlines.useIndicators();
        trafficGuidlines.avoidOvertaking();
        trafficGuidlines.respectPedestrianCrossings();
        trafficGuidlines.avoidDrivingUnderInfluence();
        trafficGuidlines.maintainVehicleFitness();
        trafficGuidlines.followLaneDiscipline();
        trafficGuidlines.useHeadlights();
        trafficGuidlines.avoidHonking();
        trafficGuidlines.beCourteous();
        System.out.println("Main Ended");
    }
}
