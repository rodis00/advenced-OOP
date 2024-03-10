package zad_2;

public class PolishLanguage implements ILanguage{
    @Override
    public String translate(String message) {
        return String.format("%s translated to polish.", message);
    }
}
