package zad_2;

public class AlbaniaLanguage implements ILanguage {
    @Override
    public String translate(String message) {
        return String.format("%s translated to albanian.", message);
    }
}
