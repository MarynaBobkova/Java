package task_2;

public class Main {

    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {

        // Есть общая переменная (целочисленная). В начале равна 0.
        // Есть 3 потока.
        // Задача каждого потока - увеличить переменную на единицу миллион раз.
        // После этого вывести значение переменной в консоль.
        // Ожидаемый результат - 3 000 000.

//        for (int i = 0; i < 1_000_000; i++) {
//            counter++;
//        }

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Окончательное значение - " + counter);
    }
}