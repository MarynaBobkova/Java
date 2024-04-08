package wrapper_char;

/**
 * @author Andrej Reutow
 * created on 10.10.2023
 */
public class WrapperCharacter {

    public static void main(String[] args) {
        char iconArrow = '\u27B3'; // ➳
        char iconA = '\u0041';
        char letterA = 65;
        char letterAAsChar = 'A';
        char letterALowerCase = 'a';

        System.out.println(iconArrow);
        System.out.println(iconA);
        System.out.println(letterA);

        System.out.println((int) iconArrow);

        char arrow = 10163;
        System.out.println(arrow);

        System.out.println('\uBDE7'); // 뷧

        char someChar = '➳';

        String testString = "➳뷧A";
        System.out.println();

        char charA = 65; // A
        char charB = 66; // B

        System.out.println(charB);
        System.out.println(charA);
        System.out.println((charB > charA));
    }
}
