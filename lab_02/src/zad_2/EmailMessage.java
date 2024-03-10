package zad_2;

public class EmailMessage implements IMessageType {
    @Override
    public String messageType() {
        return "Email";
    }
}