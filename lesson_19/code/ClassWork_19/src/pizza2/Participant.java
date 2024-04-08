package pizza2;

public class Participant {
    private int id;
    private int pizzasEaten;

    public Participant(int id) {
        this.id = id;
        this.pizzasEaten = 0;
    }

    public int getId() {
        return id;
    }

    public int getPizzasEaten() {
        return pizzasEaten;
    }


    public void eatPizza() {
        pizzasEaten++;
    }
}
