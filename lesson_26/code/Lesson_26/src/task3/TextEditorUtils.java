package task3;

/**
 * @author Andrej Reutow
 * created on 10.10.2023
 */
public class TextEditorUtils {

    public static void main(String[] args) {
        String text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation\n" +
                "dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run\n" +
                "anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to\n" +
                "recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM)\n" +
                "regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level\n" +
                "facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code\n" +
                "modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most\n" +
                "popular programming languages in use according to GitHub, particularly for client–server web\n" +
                "applications, with a reported 9 million developers.\n" +
                "\n" +
                "Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of\n" +
                "Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class\n" +
                "libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the\n" +
                "specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only\n" +
                "license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the\n" +
                "OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux\n" +
                "distributions.\n" +
                "\n" +
                "As of September 2023, Java 21 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)\n" +
                "versions.\n" +
                "\n" +
                "Quelle: wikipedia";

//        work(text);
//        work2(text);

        System.out.println("Find word Java at start:" + startsWithWord(text, "Java"));
        System.out.println("Find word Java at end:" + endsWithWord(text, "Quelle: wikipedia"));
    }

    public static void work(String source) {
        String[] sent = source.split("\\.");
        for (int i = 0; i < sent.length; i++) {
            String current = sent[i].trim();
            if (current.startsWith("It")) {
                System.out.println(current);
            }
        }
    }

    public static void work2(String source) {
        String[] sent = source.split("\\.");
        for (int i = 0; i < sent.length; i++) {
            String current = sent[i].trim();

            String[] words = current.split(" ");

            if (words[0].equals("It")) {
                System.out.println(current);
            }
        }
    }

    public static boolean startsWithWord(String source, String startText) {
        return source.startsWith(startText);
    }

    public static boolean endsWithWord(String source, String endText) {
        return source.endsWith(endText);
    }
}
