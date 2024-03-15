package zad_2;

import java.util.List;
import java.util.Random;

public class AdvertisementMain {
    public static void main(String[] args) {

        List<Recipient> recipients = List.of(
                new Recipient("Maria", "PL", 30),
                new Recipient("John", "AL", 50),
                new Recipient("Jimmy", "EN", 10)
        );

        List<Advertisement> advertisements = List.of(
                new Advertisement("First advertisement."),
                new Advertisement("Second advertisement."),
                new Advertisement("Third advertisement.")
        );

        Random random = new Random();
        Recipient recipient = recipients.get(random.nextInt(recipients.size()));
        Advertisement advertisement = advertisements.get(random.nextInt(advertisements.size()));

        AdvertisementSender advertisementSender = new AdvertisementSender(
                new Translator(),
                new EmailMessage()
        );

        if (recipient.getPrice() >= 50)
            advertisementSender.setMessageType(new VoiceMessage());
        else if (recipient.getPrice() >= 30)
            advertisementSender.setMessageType(new SMSMessage());
        else
            advertisementSender.setMessageType(new EmailMessage());

        advertisementSender.sendAdvertisement(
                advertisement.getMessage(),
                recipient.getName(),
                recipient.getLanguage()
        );
    }
}
