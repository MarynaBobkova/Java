import entity.Button;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */
public class Task3 {

    public static void main(String[] args) {
        Button button = new Button();
        // Реализуйте обработку события "клик" и "двойной клик" с использованием анонимного класса.

        Button.OnClickListener listener1 = new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("I clicked button");
            }

            @Override
            public void onDoubleClick() {
                System.out.println("I double clicked button");
            }
        };

        button.setClickListener(listener1);
        button.simulateClick();
        button.simulateDoubleClick();

        button.removeClickListener();

        Button.OnClickListener listener2 = new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("I clicked F5 button");
            }

            @Override
            public void onDoubleClick() {
                System.out.println("I double clicked F1 button");
            }
        };
        System.out.println();
        button.setClickListener(listener2);
        button.simulateClick();
        button.simulateDoubleClick();
    }
}
