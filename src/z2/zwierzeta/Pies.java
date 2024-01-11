package z2.zwierzeta;

import z2.ImienneZwierze;
import z2.Zwierze;

public record Pies(int wiek, String imie) implements Zwierze, ImienneZwierze {
    @Override
    public int getIleNog() {
        return 4;
    }

    @Override
    public String dajGlos() {
        return "Hau hau";
    }

    @Override
    public String getImie() {
        return imie;
    }
}