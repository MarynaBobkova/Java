import java.util.Iterator;

/**
 * @author Andrej Reutow
 * created on 07.11.2023
 */
public class MyStringApp {

    public static void main(String[] args) {
        MyString myString = new MyString("Hello world!");
        System.out.println(myString);

        myString.addChar('!');
        System.out.println(myString);

//        StringBuilder myStringSource = myString.getSource();
//        for (int i = 0; i < myStringSource.length(); i++) {
//            System.out.println(myStringSource.charAt(i));
//            System.out.println(Character.toUpperCase(myStringSource.charAt(i)));
//        }
//
//        System.out.println("#".repeat(30));
//        myStringSource.setLength(3);
//        for (int i = 0; i < myStringSource.length(); i++) {
//            System.out.println(myStringSource.charAt(i));
//            System.out.println(Character.toUpperCase(myStringSource.charAt(i)));
//        }


        for (Character c : myString) {
            System.out.println(c);
        }

        System.out.println();


        Iterator<Character> iterator = myString.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
