public class CommonSymbols {
    public static void main(String[] args) {

        printSymbolsByGroups();
        printSymbolsInReverse();
        printSymbols();

    }

    public static void printSymbols() {
        System.out.println(" +-*/<> <= >= . , ; : ! ? [ ] { } ( ) '");
        // code..
    }

    public static void printSymbolsInReverse() {
        System.out.println("' ) ( } { ] [ ? ! : ; , . >= <= > < = / * - + ");
        // code..

    }

    public static void printSymbolsByGroups() {
        System.out.println("Символы по группам:");
        System.out.println("Арифметические: + - * / = ");
        System.out.println("Сравнение: < > <= >= ");
        System.out.println("Пунктуация: . , ; : ");
        System.out.println("Логические: ! ? ");
        System.out.println("Скобки: [ ] { } ( ) ");
        System.out.println("Прочие: ' ");

        // ...
    }
}