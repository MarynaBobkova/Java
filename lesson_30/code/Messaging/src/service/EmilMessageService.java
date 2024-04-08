package service;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public class EmilMessageService implements IMessageService2, IKontaktService {
    @Override
    public boolean sendMessage(String message) {
        System.out.println("Send message via email: " + message);
        return false;
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
