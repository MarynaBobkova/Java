package message_sender;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Main {

    public static void main(String[] args) {
        // Создаем объекты разных типов сообщений
        TextMessage textMessage = new TextMessage("Привет, как дела?");
        AudioMessage audioMessage = new AudioMessage("Аудиофайл.mp3");
        VideoMessage videoMessage = new VideoMessage("Видеофайл.mp4");


        // Отправляем сообщения с использованием статического полиморфизма
        sendMessage(textMessage);  // Отправка текстового сообщения
        sendMessage(audioMessage); // Отправка аудио сообщения
        sendMessage(videoMessage); // Отправка видео сообщения
    }

    public static void sendMessage(TextMessage message) {
        System.out.println("Отправка текстового сообщения: " + message.getText());
    }

    public static void sendMessage(AudioMessage message) {
        System.out.println("Отправка аудио сообщения: " + message.getAudio());
    }

    public static void sendMessage(VideoMessage message) {
        System.out.println("Отправка видео сообщения: " + message.getVideo());
    }
}
