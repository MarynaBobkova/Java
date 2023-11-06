package HW36.OnClick;
// Создайте внутренний интерфейс OnClickListener с методами onClick и onDoubleClick. Создайте класс Button,
// у которого будет метод setClickListener, принимающий объект типа OnClickListener.
//
//Дополнительные условия:
//
//Реализуйте обработку события "клик" и "двойной клик" с использованием анонимного класса.
//Добавьте возможность отключать слушатель событий.
//Цель:
//Научиться создавать и использовать анонимные классы для реализации интерфейсов и управления событиями.


public class Main{
     public static void main(String[] args) {
        Button button = new Button();

        button.setClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick() {
                        System.out.println("One click");

                    }

                    @Override
                    public void onDoubleClick() {
                        System.out.println("Double click");
                    }
                }
        );

        button.simulateClick();
        button.simulateDoubleClick();
        button.removeClickListener();

    }
}