package pizza2;

public class PizzaContest {
    public static void main(String[] args) {
        int totalSlices = 20;

        // Создаем участников конкурса
        Participant[] participants = new Participant[6];
        participants[0] = new Participant(1);
        participants[1] = new Participant(2);
        participants[2] = new Participant(3);
        participants[3] = new Participant(4);
        participants[4] = new Participant(5);
        participants[5] = new Participant(6);

        int rounds = 0;
        Participant secondLastEater = null;

        // Начинаем конкурс
        while (totalSlices > 0) {
            rounds++;
            System.out.println("Round: " + rounds);

            for (int i = 0; i < participants.length; i++) {

                if (totalSlices == 0) {
                    break;
                }

                Participant participant = participants[i];
                participant.eatPizza();
                totalSlices--;

                if (totalSlices == 1) {
                    secondLastEater = participant;
                }
            }

            printAll(participants);
        }

        // Определяем победителя сортировкой пузырьком
        for (int i = 0; i < participants.length - 1; i++) {
            for (int j = 0; j < participants.length - 1 - i; j++) {
                if (participants[j].getPizzasEaten() > participants[j + 1].getPizzasEaten()) {
                    // Меняем местами участников, чтобы получить сортировку по возрастанию
                    Participant temp = participants[j];
                    participants[j] = participants[j + 1];
                    participants[j + 1] = temp;
                }
            }
        }

        System.out.println();
        printAll(participants);
        // Выводим результаты
        System.out.println("Победитель: " + participants[participants.length - 1].getId());
        System.out.println("Количество кругов: " + rounds);
        System.out.println("Предпоследний  кусок съеден участником: " + secondLastEater.getId());
    }

    private static void printAll(Participant[] participants) {
        for (int i = 0; i < participants.length; i++) {
            System.out.println("ID: " + participants[i].getId() +
                    " eat: " + participants[i].getPizzasEaten());
        }
    }
}
