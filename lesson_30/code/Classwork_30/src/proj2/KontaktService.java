package proj2;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public interface KontaktService {

    // Метод для добавления контакта
    void addContact(String name, String phoneNumber);

    // Метод для удаления контакта
    void removeContact(String name);

    // Метод для получения списка контактов
    List<String> getContacts();
}
