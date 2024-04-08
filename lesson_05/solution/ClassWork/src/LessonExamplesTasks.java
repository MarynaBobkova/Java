/*
 * Условия задач:
 * 1. Определение дня недели для похода в спортзал: Поход в спортзал возможен только в будние дни и если на улице холодно (температура ниже 15 градусов).
 * 2. Проверка возможности получения кредита: Для получения кредита необходимо быть старше 21 года и иметь стабильный доход (больше 30 000 рублей).
 * 3. Определение тарифа для мобильной связи: Если пользователь активно пользуется интернетом (больше 10 ГБ в месяц) и совершает много звонков (больше 500 минут), ему стоит выбрать тариф "Премиум".
 */
public class LessonExamplesTasks {
    public static void main(String[] args) {
        gymDay();
        canGetCredit();
        chooseMobilePlan();
    }

    // Задача 1: Определение дня недели для похода в спортзал
    public static void gymDay() {
        String dayOfWeek = "Monday"; // текущий день недели
        int temperature = 10; // текущая температура

        if (("Monday".equals(dayOfWeek) || "Wednesday".equals(dayOfWeek) || "Friday".equals(dayOfWeek)) && temperature < 15) {
            System.out.println("Сегодня отличный день для похода в спортзал!");
        } else {
            System.out.println("Сегодня спортзал не посетить.");
        }
    }

    // Задача 2: Проверка возможности получения кредита
    public static void canGetCredit() {
        int age = 25; // возраст клиента
        int income = 35000; // доход клиента

        if (age > 21 && income > 30000) {
            System.out.println("Вы можете получить кредит.");
        } else {
            System.out.println("К сожалению, вы не можете получить кредит.");
        }
    }

    // Задача 3: Определение тарифа для мобильной связи
    public static void chooseMobilePlan() {
        int internetUsage = 15; // использование интернета в ГБ
        int callMinutes = 600; // минуты разговоров

        if (internetUsage > 10 && callMinutes > 500) {
            System.out.println("Вам стоит выбрать тариф 'Премиум'.");
        } else {
            System.out.println("Стандартный тариф будет достаточен.");
        }
    }
}
