package zad_2;

public class EmailMessage implements IMessageType {
    @Override
    public void send(
            String advertisement,
            String recipient
    ) {
        System.out.println(String.format("%s sending to %s via email", advertisement, recipient));
    }
}