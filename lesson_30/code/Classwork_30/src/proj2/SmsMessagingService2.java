package proj2;

import java.util.ArrayList;
import java.util.List;

// Имплементация интерфейса MessagingService для отправки SMS
class SmsMessagingService2 implements MessagingServicev2 {
    private List<String> contacts = new ArrayList<>();

    @Override
    public void sendMessage(String message) {
        // Логика отправки SMS
        System.out.println("Отправка SMS: " + message);
    }

    @Override
    public void addContact(String name, String phoneNumber) {
        // Логика добавления контакта
        contacts.add(name + ": " + phoneNumber);
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

