package zad_2;

public class Translator implements ITranslation {
    @Override
    public String translate(
            String advertisement,
            String language
    ) {
        return String.format("%s translated to %s.", advertisement, language);
    }
}
