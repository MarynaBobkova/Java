package Game21.src;

import java.util.Arrays;

public class Player {
    private final String NAME;
    private Card[] hand; // карты игрока в текущем раунде
    private int score; // суммарное значение карт в руках игрока
    private int totalScore; // кол-во побед

    public Player(String name) {
        this.NAME = name;
        this.hand = new Card[0];
    }

    // метод drawCard - для добавление карты в руку и обновления счета score
    public void drawCard(Card card){
       Card[] copy = Arrays.copyOf(this.hand, this.hand.length+1);
       copy[copy.length - 1] = card;

       this.hand = copy;
       this.score += card.getVALUE();
    }
    //для сброса руки и счета за раунд.
    public void resetRound() {
        this.score= 0;
        this.hand = new Card[0];

    }
    //для добавления балла к общему счету.
    public void addPointToTotalScore(){
        this.totalScore++;

    }
}
