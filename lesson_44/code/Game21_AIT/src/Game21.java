import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Andrej Reutow
 * created on 09.11.2023
 */
public class Game21 {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);

        Player player = getPlayer(scanner);
        System.out.println("Добро пожаловать " + player.getName());
        System.out.println("Игра начинается\n");

        // игровой процесс
        startGame(scanner, player, deck);

        scanner.close();
    }

    private static void startGame(Scanner scanner, Player player, Deck deck) {
        final Iterator<Card> deckIterator = deck.iterator();

        int roundCounter = 1;

        while (deckIterator.hasNext()) {

            System.out.println("Старт раунд: " + roundCounter++);
            System.out.println("#".repeat(30));

            String userInput = null;
            do {
                System.out.println("Введите 'y' что бы получить новую карту либо 'n' что бы завершить раунд и подсчитать результат");
                userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("y")) {
                    Card card = deckIterator.next();
                    player.drawCard(card);
                    player.displayHandCards();
                }

                if (userInput.equalsIgnoreCase("n")) {
                    if (player.getRoundScore() == 21) {
                        System.out.println("21! Отлично");
                        player.addPointToTotalScore();
                    } else if (player.getRoundScore() > 21) {
                        System.out.println("У вас перебор, " + player.getRoundScore());
                    } else if (player.getRoundScore() < 21) {
                        System.out.println("У вас недобор, " + player.getRoundScore());
                    }
                    player.resetRound();
                }
            } while (!"y".equalsIgnoreCase(userInput) && !"n".equalsIgnoreCase(userInput));
        }

        System.out.println("Игра окончена, ваш результат: " + player.getTotalScore());
    }

    private static Player getPlayer(Scanner scanner) {
        System.out.println("Введите имя игрока");
        String playerName = scanner.nextLine();
        return new Player(playerName);
    }
}
