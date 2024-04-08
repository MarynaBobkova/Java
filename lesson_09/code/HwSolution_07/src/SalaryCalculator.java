/**
 * @author Andrej Reutow
 * created on 15.09.2023
 */

//    У Пети есть два ведра: одно пустое, а в другом 100 яблок.
//    Ваша задача помочь Пете переложить все яблоки из полного ведра в пустое.
//    Как только все яблоки будут переложены, Петя может идти гулять.
//    Требования:
//      Используйте цикл while для перекладывания яблок.
//      После каждого перекладывания яблока выводите количество оставшихся яблок в полном ведре и количество яблок в пустом ведре.
//      Когда все яблоки будут переложены, выведите сообщение, что Петя может идти гулять

public class SalaryCalculator {

    static final double BASE_SALARY = 500;
    static final double BONUS_3 = .1;
    static final double BONUS_5 = .5;
    static final double BONUS_10 = 1;
    static final double BONUS_15 = 1.5;

    public static void main(String[] args) {
        int employerExperience = 4;
        double bonus = calculateBonus(employerExperience);
        System.out.println("Бонус для " + employerExperience + " лет: " + bonus + ", при зарплате " + BASE_SALARY);
        double result = BASE_SALARY + bonus;
        System.out.println("Зарплата с учетом бонуса за стаж: " + result);

        employerExperience = 20;
        bonus = calculateBonus(employerExperience);
        System.out.println("Бонус для " + employerExperience + " лет: " + bonus + ", при зарплате " + BASE_SALARY);
        result = BASE_SALARY + bonus;
        System.out.println("Зарплата с учетом бонуса за стаж: " + result);

        employerExperience = 1;
        bonus = calculateBonus(employerExperience);
        System.out.println("Бонус для " + employerExperience + " лет: " + bonus + ", при зарплате " + BASE_SALARY);
        result = BASE_SALARY + bonus;
        System.out.println("Зарплата с учетом бонуса за стаж: " + result);
    }

    public static double calculateBonus(int experience) {
        double bonus = 0;

        if (experience >= 3 && experience <= 4) {
            bonus = BASE_SALARY * BONUS_3;
        } else if (experience >= 5 && experience < 10) {
            bonus = BASE_SALARY * BONUS_5;
        } else if (experience >= 10 && experience < 15) {
            bonus = BASE_SALARY * BONUS_10;
        } else if (experience >= 15) {
            bonus = BASE_SALARY * BONUS_15;
        }

        return bonus;
    }
}
