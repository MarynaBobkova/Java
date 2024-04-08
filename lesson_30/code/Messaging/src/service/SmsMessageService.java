package service;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public class SmsMessageService implements IMessageService {

    @Override
    public boolean sendMessage(String message) {
        System.out.println("Send Message via sms: " + message);
        return true;
    }

    @Override
    public String addKontakt(String name) {
        return null;
    }

    @Override
    public String[] getAllKontakts() {
        return new String[0];
    }
}
