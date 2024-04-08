public class Main {
    public static void main(String[] args) {
        yourName();
        yourNickname();
        casualTalk();
        currentCity();
    }

    public static void yourName() {
        System.out.println("What is your name?");
        System.out.println("My name is Bekhan.");
        System.out.println();
    }

    public static void yourNickname() {
        System.out.println("How should I address you in class?");
        System.out.println("Bekhan");
        System.out.println();
    }

    public static void casualTalk() {
        System.out.println("Would you mind switching to first-name terms later?");
        System.out.println("In time, yes");
        System.out.println();
    }

    public static void currentCity() {
        System.out.println("Which city do you currently live in?");
        System.out.println("Berlin");
    }
}

// Bekhan Davletmurzaev
// Homework 02 - Task 02
public class Main { // 'Main' was replaced with 'BrokenProgram'
    public static void main(String[] args) { // 'public' was missing
        System.out.println("Hello, World!"); // ; was missing
    }
} // } was missing

public class Main {
    public static void main(String[] args) {
        printSymbols();
        printSymbolsInReverse();
        printSymbolsByGroups();
    }

    public static void printSymbols() {
        System.out.println("All Symbols: +-+/= < > <= >= . , ; : ! ? [ ] { } ( ) '");
    }

    public static void printSymbolsInReverse() {
        System.out.println("All Symbols in reverse: ' ) ( } { ] [ ? ! : ; , . >= <= > < = /*-+");
    }

    public static void printSymbolsByGroups() {
        System.out.println("Symbols by Groups:");
        System.out.println("Arithmetic: +-*/=");
        System.out.println("Comparison: < > <= >=");
        System.out.println("Punctuation: . , ; :");
        System.out.println("Logical: ! ?");
        System.out.println("Brackets: [ ] { } ( )");
        System.out.println("Others: '");
    }
}
