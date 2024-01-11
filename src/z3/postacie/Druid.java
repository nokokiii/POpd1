package z3.postacie;

import z3.Leczaca;
import z3.Postac;

public class Druid extends Postac implements Leczaca {
    private int mana = 100;

    public Druid(int punktyZycia, int mana) {
        super(punktyZycia, mana);
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void wylecz(Postac ranny) {
        if (mana >= 10) {
            ranny.setPunktyZycia(ranny.getPunktyZycia() + 200);
            mana -= 10;
        } else {
            System.out.println("Brak many");
        }
    }

    @Override
    public void atakuj(Postac przeciwnik) {
        przeciwnik.setPunktyZycia(przeciwnik.getPunktyZycia() - sila);
    }
}