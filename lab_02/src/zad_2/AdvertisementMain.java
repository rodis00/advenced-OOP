package zad_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdvertisementMain {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(
                "Maria",
                "PL",
                30)
        );
        users.add(new User(
                "John",
                "AL",
                50)
        );

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("First message"));
        messages.add(new Message("Second message"));

        Random random = new Random();
        int userId = random.nextInt(users.size());
        int messageId = random.nextInt(messages.size());

        User user = users.get(userId);
        Message message = messages.get(messageId);

        Advertisement advertisement = new Advertisement(
                user.getPrice(),
                user.getLanguage(),
                message.getMessage(),
                user.getName());

        advertisement.sendMessage();
    }
}
