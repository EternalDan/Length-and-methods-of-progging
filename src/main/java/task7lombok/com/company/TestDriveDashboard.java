package task7lombok.com.company;

public class TestDriveDashboard {

    public static void main(String[] args) {

        UserDashboard userDashboard = new UserDashboard();
//        userDashboard.turnDashboardOnOff();
//        userDashboard.getFuelConsumptionRateForRoadType(RoadType.sand);
        System.out.println(userDashboard.getPercentageFuel());
        System.out.println(userDashboard.getPercentageBatteryStatus());
        System.out.println(userDashboard.getRecommendedRefuelTime());
    }
}
