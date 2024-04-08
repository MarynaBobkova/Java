/**
 * @author Andrej Reutow
 * created on 16.10.2023
 */
public class StringBufferBuilder {

    public static void main(String[] args) {
        String line1 = "Hello" + " World";              //  Hello World
//        String line1 = "Hello".concat(" World");    // Hello World
        String line2 = line1.toLowerCase().concat("!").substring(0, 5);
        // Hello World
        // toLowerCase() -> hello world
        // concat("!") -> hello world!
        // substring(0, 5) -> hello
        // line = hello

        System.out.println(line1); // Hello World
        System.out.println(line2); // hello

        System.out.println("#".repeat(20));
        System.out.println("StringBuilder task:\n");
        stringBuilderTask();

        System.out.println("#".repeat(20));
        System.out.println("Reverse words:\n");
        System.out.println(reverseWords("Hello World"));
    }

    public static void stringBuilderTask() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        // append() - это как конкатинация(склеивание) строк
        sb.append("Hello"); // "" + "Hello"
//        sb.reverse();
        sb.append(" ");     // "Hello" + " "
        sb.append("World"); // "Hello " + "World"
        // "Hello World"
        sb.append("#".repeat(36));

        System.out.println(sb.capacity());

        System.out.println(sb);
    }

    public static String reverseWords(String someText) {
        String[] words = someText.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            String word = words[i];
            sb.append(word).reverse();
            result.append(sb).append(" ");
        }

        return result.toString().trim();
    }
}
