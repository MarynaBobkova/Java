import java.util.Scanner;

public class ShopBattle {

    public static void main(String[] args) {
        // Инициализация поля
        int[] field = new int[10];
        field[2] = 1; // первый корабль
        field[7] = 1; // второй корабль

        Scanner scanner = new Scanner(System.in);
        int ships = 2; // количество кораблей
        int shots = 0; // количество выстрелов

        // Игровой цикл
        while (ships > 0) {
            System.out.println("Введите индекс для выстрела (0-9):");
            int shot = scanner.nextInt();
            shots++; // увеличиваем количество выстрелов

            // Проверка на корректность индекса
            if (shot < 0 || shot >= field.length) {
                System.out.println("Индекс вне допустимого диапазона.");
            } else {
                // Проверка, попал ли выстрел в корабль
                if (field[shot] == 1) {
                    System.out.println("Попадание! Корабль потоплен.");
                    field[shot] = -1; // обозначаем, что корабль потоплен
                    ships--; // уменьшаем количество кораблей
                } else if (field[shot] == 0) {
                    System.out.println("Промах. Попробуйте ещё раз.");
                } else if (field[shot] == -1) {
                    System.out.println("Вы стреляете в ячейку, где уже был потоплен корабль.");
                }
            }
        }

        System.out.println("Все корабли потоплены! Вы победили!");
        System.out.println("Количество выстрелов: " + shots);
    }
}
