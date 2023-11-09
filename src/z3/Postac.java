package z3;

public abstract class Postac {
    public int punktyZycia;
    public int sila;

    public Postac(int punktyZycia, int sila) {
        this.punktyZycia = punktyZycia;
        this.sila = sila;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public void setPunktyZycia(int punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    public void atakuj(Postac przeciwnik) {
        przeciwnik.setPunktyZycia(przeciwnik.getPunktyZycia() - this.sila);
    }
}