package z2.zwierzeta;

import z2.Zwierze;

public record Ryba(int wiek) implements Zwierze {
    @Override
    public int getIleNog() {
        return 0;
    }

    @Override
    public String dajGlos() {
        return "Bul bul";
    }

}
