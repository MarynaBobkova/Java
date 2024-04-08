package stack;

import interfaces.MyCollection;

public class Main {

    public static void main(String[] args) {

//        Stack<String> stack = new Stack<>();
//
//        for (String current : stack) {
//
//        }

        MyCollection<String> stack = new MyStack<>();

        System.out.println("Пустой ли стек? - " + stack.isEmpty());
        System.out.println("Размер стека - " + stack.size());
        System.out.println(stack);

        stack.push("AAA");
        stack.push("BBB");
        stack.push("CCC");

        System.out.println("Пустой ли стек? - " + stack.isEmpty());
        System.out.println("Размер стека - " + stack.size());
        System.out.println(stack);

        String removedElement = stack.pop();
        System.out.println("Удалённый элемент - " + removedElement);
        System.out.println("Размер стека - " + stack.size());
        System.out.println(stack);

        String receivedElement = stack.peek();
        System.out.println("Полученный элемент - " + receivedElement);
        System.out.println("Размер стека - " + stack.size());
        System.out.println(stack);

        stack.push("CCC");
        stack.push("DDD");
        stack.push("EEE");

        System.out.println(stack);

        System.out.println("Порядковый номер элемента CCC - " + stack.search("CCC"));
        System.out.println("Порядковый номер элемента EEE - " + stack.search("EEE"));
        System.out.println("Порядковый номер элемента BBB - " + stack.search("BBB"));
        System.out.println("Порядковый номер элемента FFF - " + stack.search("FFF"));
    }
}