package game;

public class Game {
    public static void main(String[] args) {
        Character player = new Mage();
        player.attack(); // Вызывает метод attack() из класса Character
        ((Mage) player).castSpell(); // Приведение типа и вызов метода castSpell()
    }
}
