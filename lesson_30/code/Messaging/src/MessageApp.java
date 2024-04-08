import service.EmilMessageService;
import service.IMessageService;
import service.IMessageService2;
import service.SmsMessageService;

/**
 * @author Andrej Reutow
 * created on 17.10.2023
 */
public class MessageApp {

    public static void main(String[] args) {
        IMessageService smsMessageService = new SmsMessageService();
        IMessageService2 emialMessageService = new EmilMessageService();

        smsMessageService.sendMessage("Hello bro!");
        emialMessageService.sendMessage("Sher geehrter Herr Pupkin");


        StringBuilder stringBuilder = new StringBuilder();
        String someStr = "";

        stringBuilder.length();
        someStr.length();

//        CharSequence charSequence = new StringBuilder();
//
//        if (charSequence instanceof StringBuilder) {
//            StringBuilder sb = (StringBuilder) charSequence;
//            sb.append();
//            ((StringBuilder) charSequence).append();
//
//        }

    }
}
