package HW2;

public class GameAppl {
    public static void main(String[] args) {
        GameCharacter mag = new Mage();
        GameCharacter warrior = new Warrior();
        GameCharacter archer = new Archer();

        GameCharacter [] gameCharacters = {mag, warrior, archer};
        for (int i = 0; i < gameCharacters.length; i++) {
           String string = gameCharacters[i].attack();
            System.out.println(string);
        }
    }
}
