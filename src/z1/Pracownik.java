package z1;

public class Pracownik {
    private final Pracownik przelozony;
    private final Integer pensja;

    protected Pracownik(Pracownik przelozony, Integer pensja) {
        this.przelozony = przelozony;
        this.pensja = pensja;
    }

    protected Pracownik getPrzelozony() {
        return przelozony;
    }

    protected Integer getPensja() {
        return pensja;
    }
}
