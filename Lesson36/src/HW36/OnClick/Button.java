package HW36.OnClick;

public class Button {
    private OnClickListener[] listeners = new OnClickListener[10];
    private int listenerCount = 0;

    // создайте внутрений интефейс OnClickListener c двумя методами onClick, onDoubleClick
    interface OnClickListener {
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
