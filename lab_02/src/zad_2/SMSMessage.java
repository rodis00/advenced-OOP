package zad_2;

public class SMSMessage implements IMessageType {
    @Override
    public void send(
            String advertisement,
            String recipient
    ) {
        System.out.println(String.format("%s sending to %s via sms", advertisement, recipient));
    }
}
