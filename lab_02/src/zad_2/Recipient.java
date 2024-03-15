package zad_2;

public class Recipient {
    private String name;
    private String language;
    private int price;

    public Recipient(
            String name,
            String language,
            int price
    ) {
        this.name = name;
        this.language = language;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public int getPrice() {
        return price;
    }
}
