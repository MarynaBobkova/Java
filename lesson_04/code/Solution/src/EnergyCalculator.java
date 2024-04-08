public class EnergyCalculator {

//    public static double calculateHourlyConsumption(double fridge, double ac) {
//        return fridge + ac;
//    }
//
//    public static double calculateMonthlyCost(double hourlyConsumption, double costPerKWh) {
//        return (hourlyConsumption / 1000) * 24 * 30 * costPerKWh;
//    }
//
//    public static void main(String[] args) {
//        double fridge = 150;
//        double ac = 2000;
//        double costPerKWh = 0.15;
//
//        double hourlyConsumption = calculateHourlyConsumption(fridge, ac);
//        double monthlyCost = calculateMonthlyCost(hourlyConsumption, costPerKWh);
//
//        System.out.println("Hourly Consumption: " + hourlyConsumption + " W");
//        System.out.println("Monthly Cost: " + monthlyCost + " EUR");
//    }

    // Расчет электроэнергии в час
    public static double calculateHourlyConsumption(double fridgeWatt, double acWatt) {
        return (fridgeWatt + acWatt) / 1000; // В кВт
    }

    // Расчет месячных расходов на электроэнергию
    public static double calculateMonthlyCost(double hourlyConsumption, double costPerKWh) {
        return hourlyConsumption * 24 * 30 * costPerKWh;
    }

    public static void main(String[] args) {
        // Примеры
        System.out.println("Месячные расходы (150 Вт холодильник, 2000 Вт кондиционер, 0.15 евро/кВтч): " +
                calculateMonthlyCost(calculateHourlyConsumption(150, 2000), 0.15));
        System.out.println("Месячные расходы (200 Вт холодильник, 1800 Вт кондиционер, 0.20 евро/кВтч): " +
                calculateMonthlyCost(calculateHourlyConsumption(200, 1800), 0.20));
    }
}
