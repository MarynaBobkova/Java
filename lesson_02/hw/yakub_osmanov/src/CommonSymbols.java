public class CommonSymbols {

    //HomeWork2_3

    public static void main(String[] args) {

        String allSymbols = "+ - * / = < > <= >= . , ; : ! ? [ ] { } ( ) '";


        printSymbols(allSymbols);
        printSymbolsInReverse(allSymbols);
        printSymbolsByGroups();


    }

    public static void printSymbols(String allSymb) {
        System.out.println("Все символы: "+allSymb);
    }

    public static void printSymbolsInReverse(String allSymb) {

        String result = "";

        // Когда лень переписывать все символы, можно их прокрутить в цикле в обратном порядке
        for(int t=allSymb.length()-1; t>0; t--){

            char temp = allSymb.charAt(t);
            result += temp;

        }

        System.out.println("Все символы в обратном порядке: "+result);
    }

    public static void printSymbolsByGroups() {
        System.out.println("Символы по группам:");
        System.out.println("Арифметические: + - * / =");
        System.out.println("Сравнение: < > <= >=");
        System.out.println("Пунктуация: . , ; :");
        System.out.println("Логические: ! ?");
        System.out.println("Скобки: [ ] { } ( )");
        System.out.println("Прочие: '");
    }
}