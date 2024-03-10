package zad_2;

import java.util.ArrayList;
import java.util.List;

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

        User user = users.get(1);
        Message message = messages.get(1);

        Advertisement advertisement = new Advertisement(
                user.getPrice(),
                user.getLanguage(),
                message.getMessage(),
                user.getName());

        advertisement.sendMessage();
    }
}
