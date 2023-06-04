package task7lombok.com.company;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Builder
public class EngineerDashboard implements IDashboardEngineer {
    boolean on = true; //панель приборов включена
    final MeasurementType measurementType = MeasurementType.liter;

    //реализовать методы через заглушки

    protected void turnDashboardOnOff() {
        updateData();
        on = !on;
    }

    private void updateData() {
        //реализовать метод обновления данных в микросхеме при включении/выключении панели

        RoadType roadType = RoadType.asphalt;

//        RoadType roadType = RoadType.gravel;
//        RoadType roadType = RoadType.soil;
//        RoadType roadType = RoadType.sand;

//        getFuelTankCapacity();

        getCurrentFuelVolume();
        getBatteryCapacityInMah();
        getCurrentBatteryVolume();
        getBatteryRecirculationCoefficient();
        averageSpeed();
        getCurrentSpeed();
        getFuelConsumptionRateForRoadType(roadType);
        getCurrentRoadType();


    }

    @Override
    public double getFuelTankCapacity() {
        double fuelTankCapacity = 42;
        fuelTankCapacity--;
        if (fuelTankCapacity != 42) {
            turnDashboardOnOff();
        }
        return 0;
    }

    @Override
    public double getCurrentFuelVolume() {
        double currentFuelVolume = 27.0231;
        currentFuelVolume--;
        if (currentFuelVolume < 1) {
            turnDashboardOnOff();
        }
        return 0;

    }

    @Override
    public double getBatteryCapacityInMah() {
        return 0;
    }

    @Override
    public double getCurrentBatteryVolume() {
        return 0;
    }

    @Override
    public double getBatteryRecirculationCoefficient() {
        return 0;
    }

    @Override
    public double averageSpeed() {
        return 0;
    }

    @Override
    public double getCurrentSpeed() {
        return 0;
    }

    @Override
    public double getFuelConsumptionRateForRoadType(RoadType roadType) {
        return 0;
    }

    @Override
    public RoadType getCurrentRoadType() {
        return null;
    }
}
