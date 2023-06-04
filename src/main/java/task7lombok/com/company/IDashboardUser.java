package task7lombok.com.company;

public interface IDashboardUser {

    int getPercentageFuel();//оставшееся топливо в процентах
    int getPercentageBatteryStatus();//уровень здоровья аккумулятора
    // (зависит от текущего объёма заряда, общего объема,
    // коэффициента рециркуляции и т.д.)
    int getRecommendedRefuelTime();//рекомендуемое время для
    // перезаправки с учетом средней скорости, оставшегося топлива,
    // вида дорожного покрытия и т.д.
}
