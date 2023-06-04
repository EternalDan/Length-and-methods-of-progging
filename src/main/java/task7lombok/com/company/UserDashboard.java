package task7lombok.com.company;


import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
public class UserDashboard extends EngineerDashboard implements IDashboardUser {

    //реализовать высокоуровневые методы класса UserDashboard посредством
    // родительских низкоуровненвых методов класса EngineerDashboard
    @Override
    public int getPercentageFuel() {
        return (int) (getCurrentFuelVolume() / getFuelTankCapacity() * 100);
    }

    @Override
    public int getPercentageBatteryStatus() {
        return (int) (getCurrentBatteryVolume() / getBatteryCapacityInMah() * 100);
    }

    @Override
    public int getRecommendedRefuelTime() {
//        return (int) (getFuelConsumptionRateForRoadType(getCurrentRoadType()));
        return (int) (48);
    }

    protected void turnDashboardOnOff(boolean trueOnOff) {
        if (trueOnOff) {
            super.turnDashboardOnOff();
        } else {
//            System.out.println("\u001B[31m" + "Warning! Do not turn dashboard Off or On please!" + "\u001B[0m");
            System.out.println("Warning! Do not turn dashboard Off or On please!");
        }
    }
}
