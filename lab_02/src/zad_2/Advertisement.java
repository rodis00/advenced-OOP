package zad_2;

public class Advertisement {
    private ILanguage language;
    private IMessageType messageType;
    private String recipient;
    private String message;

    public Advertisement(
            int price,
            String language,
            String message,
            String recipient
    ) {
        selectMessageType(price);
        selectLanguage(language);
        this.message = message;
        this.recipient = recipient;
    }

    private void selectLanguage(String language) {
        if (language.equals("PL"))
            this.language = new PolishLanguage();
        if (language.equals("AL"))
            this.language = new AlbaniaLanguage();
    }

    private void selectMessageType(int price) {
        if (price == 30)
            this.messageType = new EmailMessage();
        if (price == 40)
            this.messageType = new SMSMessage();
        if (price == 50)
            this.messageType = new VoiceMessage();
    }

    public void sendMessage() {
        System.out.println("Message sent to: " + this.recipient);
        System.out.println("Translated message: " + this.language.translate(this.message));
        System.out.print("Message type: " + this.messageType.messageType());
    }
}
