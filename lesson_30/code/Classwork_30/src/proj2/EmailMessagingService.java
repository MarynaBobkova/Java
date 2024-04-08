package proj2;

import java.util.ArrayList;
import java.util.List;

// Имплементация интерфейса MessagingService для отправки почтовых сообщений
class EmailMessagingService implements MessagingService {
    private List<String> contacts = new ArrayList<>();

    @Override
    public void sendMessage(String message) {
        // Логика отправки сообщения по электронной почте
        System.out.println("Отправка сообщения по электронной почте: " + message);
    }

    @Override
    public void addContact(String name, String emailAddress) {
        // Логика добавления контакта
        contacts.add(name + ": " + emailAddress);
    }

    @Override
    public void removeContact(String name) {
        // Логика удаления контакта по имени
        for (String contact : contacts) {
            if (contact.startsWith(name + ": ")) {
                contacts.remove(contact);
                break;
            }
        }
    }

    @Override
    public List<String> getContacts() {
        // Возвращает список всех контактов
        return contacts;
    }
}
