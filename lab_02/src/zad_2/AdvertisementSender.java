package zad_2;

public class AdvertisementSender {
    private ITranslation translation;
    private IMessageType messageType;

    public AdvertisementSender(
            ITranslation translation,
            IMessageType messageType
    ) {
        this.translation = translation;
        this.messageType = messageType;
    }

    public void setTranslation(ITranslation translation) {
        this.translation = translation;
    }

    public void setMessageType(IMessageType messageType) {
        this.messageType = messageType;
    }

    public void sendAdvertisement(
            String advertisement,
            String recipient,
            String language
    ) {
        String translatedMessage = translation.translate(advertisement, language);
        messageType.send(translatedMessage, recipient);
    }
}
