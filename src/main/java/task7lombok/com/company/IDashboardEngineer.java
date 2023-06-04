package task7lombok.com.company;


public interface IDashboardEngineer {
    double getFuelTankCapacity();//объем топливного бака

    double getCurrentFuelVolume();//текущий объем топлива

    double getBatteryCapacityInMah();//объем аккумулятора

    double getCurrentBatteryVolume();//объем текущего заряда аккумулятора

    double getBatteryRecirculationCoefficient();

    //условный коэффициент рециркуляции аккумулятора
    double averageSpeed();//средняя скорость за последний час

    double getCurrentSpeed();//текущая скорость

    double getFuelConsumptionRateForRoadType(RoadType roadType);

    //уровень потребления топлива в зависимости от вида дорожного покрытия
    RoadType getCurrentRoadType();//вид дорожного покрытия в данный момент
}
