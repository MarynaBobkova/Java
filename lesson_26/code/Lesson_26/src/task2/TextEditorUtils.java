package task2;

/**
 * @author Andrej Reutow
 * created on 10.10.2023
 */
public class TextEditorUtils {

    public static void main(String[] args) {
//        final String text = "Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);It is one of the most popular programming language in the world; It has a large demand in the current job market; It is easy to learn and simple to use; It is open-source and free; It is secure, fast and powerful; It has a huge community support (tens of millions of developers); Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs; As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;";

        final String text = "Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);It is one of the most popular programming\n" +
                "language in the world; It has a large demand in the current job market; It is easy to learn and simple to use; It is\n" +
                "open-source and free; It is secure, fast and powerful; It has a huge community support (tens of millions of developers);\n" +
                "Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering\n" +
                "development costs; As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;";

        String result = text.replace("\n", "");
        String[] strings = result.split(";");

        System.out.println("Why Use Java?");
        char pointChar = '\u2022';

        for (int i = 0; i < strings.length; i++) {
            System.out.println(pointChar + " " + strings[i].trim());
        }

    }
}
