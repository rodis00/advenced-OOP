package zad_2;

public class VoiceMessage implements IMessageType {

    @Override
    public void send(
            String advertisement,
            String recipient
    ) {
        System.out.println(String.format("%s sending to %s via voice message.", advertisement, recipient));
    }
}
