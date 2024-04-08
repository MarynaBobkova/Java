package proj2;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public interface MessagingServicev2 extends KontaktService {

    void sendMessage(String message); // Метод для отправки сообщения

}
