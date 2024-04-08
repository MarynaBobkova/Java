package pizza1;

import java.util.Random;

/**
 * У нас проводится конкурс по съеданию пиццы с участием группы из 5 до 8 человек. Каждый участник принимает участие в конкурсе и съедает случайное количество кусков пиццы, которое может быть от 0 до 6. Нам нужно провести анализ результатов конкурса и определить следующее:
 * <p>
 * 1. Сколько кусков пиццы съел каждый участник.
 * 2. Кто из участников съел наибольшее количество кусков пиццы и стал победителем конкурса.
 * 3. Кто занял второе и третье место в конкурсе.
 * 4. Сколько всего пицц было использовано для конкурса, если каждая пицца была разрезана на 8 кусков.
 * 5. Сколько кусков пиццы осталось несъеденными после завершения конкурса.
 * 6. Победителям с первого по третье места вручить награды: первому месту - золотую медаль и сертификат на бесплатную пиццу, второму месту - серебряную медаль и сертификат на скидку 50% на следующую пиццу, третьему месту - бронзовую медаль и сертификат на скидку 25% на следующую пиццу.
 * <p>
 */
public class PizzaContest {
    public static void main(String[] args) {
        int minParticipants = 5;
        int maxParticipants = 8;
        int slicesPerPizza = 8;

        // Генерируем случайное количество участников от 5 до 8
        Random random = new Random();
        int numParticipants = random.nextInt(maxParticipants - minParticipants + 1) + minParticipants;

        // Создаем список участников конкурса
        Contestant[] contestants = new Contestant[numParticipants];

        for (int i = 0; i < numParticipants; i++) {
            contestants[i] = new Contestant("Участник " + (i + 1));
        }

        // Участники начинают есть пиццу и случайно выбирают количество кусков
        for (int i = 0; i < contestants.length; i++) {
            Contestant contestant = contestants[i];
            int slicesEaten = random.nextInt(7); // От 0 до 6
            contestant.setSlicesEaten(slicesEaten);
        }

        // Находим победителей (первое, второе и третье место)
        sort(contestants);

        // Вычисляем общее количество съеденных кусков пиццы
        int totalSlicesEaten = calculateTotalSlices(contestants);

        // Вычисляем общее количество предложенных пицц и оставшиеся куски
        int totalPizzas = totalSlicesEaten / slicesPerPizza;
        int remainingSlices = totalSlicesEaten % slicesPerPizza;

        System.out.println("Сколько кусков пиццы съел каждый участник:");
        for (int i = 0; i < contestants.length; i++) {
            Contestant contestant = contestants[i];
            System.out.println(contestant.getName() + ": " + contestant.getSlicesEaten() + " кусков пиццы");
        }

        System.out.println("Победители (первое, второе и третье место):");
        for (int i = 0; i < 3; i++) {
            System.out.println(contestants[i].getName());
        }

        System.out.println("Общее количество предложенных пицц: " + totalPizzas);
        System.out.println("Оставшиеся куски пиццы: " + remainingSlices);
    }


    public static int calculateTotalSlices(Contestant[] contestants) {
        int total = 0;
        for (int i = 0; i < contestants.length; i++) {
            total += contestants[i].getSlicesEaten();
        }
        return total;
    }

    public static Contestant findMax(Contestant[] contestants) {
        int maxIndex = 0;
        Contestant max = contestants[maxIndex];
        for (int i = 0; i < contestants.length; i++) {
            if (contestants[i].getSlicesEaten() > contestants[maxIndex].getSlicesEaten()) {
                maxIndex = i;
                max = contestants[maxIndex];
            }
        }

        return max;
    }

    public static void sort(Contestant[] contestants) {
        for (int indexOut = 0; indexOut < contestants.length - 1; indexOut++) {
            for (int indexIn = 0; indexIn < contestants.length - 1 - indexOut; indexIn++) {
                if (contestants[indexIn].getSlicesEaten() > contestants[indexIn + 1].getSlicesEaten()) {
                    Contestant temp = contestants[indexIn];
                    contestants[indexIn] = contestants[indexIn + 1];
                    contestants[indexIn + 1] = temp;
                }
            }
        }
    }
}

