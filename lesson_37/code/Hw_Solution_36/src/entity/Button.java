package entity;

/**
 * @author Andrej Reutow
 * created on 26.10.2023
 */

//Описание:
// Создайте внутренний интерфейс OnClickListener с методами onClick и onDoubleClick. Создайте класс Button, у которого будет метод setClickListener, принимающий объект типа OnClickListener.
// Дополнительные условия:
// Реализуйте обработку события "клик" и "двойной клик" с использованием анонимного класса.
// Добавьте возможность отключать слушатель событий.
public class Button {
    private OnClickListener[] listeners = new OnClickListener[10];
    private int listenerCount = 0;

    // создайте внутрений интефейс OnClickListener c двумя методами onClick, onDoubleClick
    public interface OnClickListener {
        void onClick();
        void onDoubleClick();
    }


    public void setClickListener(OnClickListener listener) {
        if (listenerCount < listeners.length) {
            listeners[listenerCount++] = listener;
        }
    }

    public void removeClickListener() {
        listenerCount = 0;
    }

    public void simulateClick() {
        for (int i = 0; i < listenerCount; i++) {
            listeners[i].onClick();
        }
    }

    public void simulateDoubleClick() {
        for (int i = 0; i < listenerCount; i++) {
            listeners[i].onDoubleClick();
        }
    }
}
