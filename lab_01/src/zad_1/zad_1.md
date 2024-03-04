# Wzorzec strategia:

Wzorzec Strategia jest wzorcem projektowym, który umożliwia zdefiniowanie rodziny algorytmów,
spakowanie ich w osobne klasy i uczynienie ich wzajemnie wymiennymi. Pozwala to na to, aby algorytmy
mogły się zmieniać niezależnie od klientów, którzy ich używają.


# Zwykła implementacja interfejsu:

Zwykła implementacja interfejsu polega na dostarczeniu konkretnych implementacji interfejsu w różnych klasach.
Te implementacje mogą być bezpośrednio używane przez klientów.

## Wady i zalety wzorca strategia:

### Zalety:
* Elastyczność - Pozwala na zmianę algorytmów w locie, bez konieczności ingerencji w kod klienta.
* Rozdzielenie odpowiedzialności - Oddziela logikę biznesową od implementacji konkretnych algorytmów.
* Testowalność - Ułatwia testowanie poszczególnych strategii niezależnie od reszty systemu.
* Hermetyzacja - Ukrywa szczegóły implementacji algorytmów przed klientem.

### Wady:
* Zwiększona złożoność: Wzorzec ten może zwiększyć liczbę klas i interfejsów w systemie, co może prowadzić do zwiększenia złożoności kodu.
* Potrzeba zarządzania strategiami: W systemach z dużą liczbą strategii może być potrzebne dodatkowe zarządzanie nimi.