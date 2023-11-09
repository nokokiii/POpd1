package z3.postacie;

import z3.Postac;
import z3.Walczaca;

public class Rycerz extends Postac implements Walczaca {
    public Rycerz(int punktyZycia, int sila) {
        super(punktyZycia, sila);
    }

    public int getSila() {
        return sila;
    }

    @Override
    public void atakuj(Postac przeciwnik) {
        przeciwnik.setPunktyZycia(przeciwnik.getPunktyZycia() - sila);
    }
}