package z4;

import java.util.ArrayList;
import java.util.List;

public class PanstwoImpl implements Panstwo {
    private final Kontynent kontynent;
    private int liczbaLudnosci;
    private final String stolica;
    private final List<Panstwo> sasiedzi = new ArrayList<>();

    public PanstwoImpl(Kontynent kontynent, int liczbaLudnosci, String stolica) {
        this.kontynent = kontynent;
        this.liczbaLudnosci = liczbaLudnosci;
        this.stolica = stolica;
    }

    @Override
    public Kontynent getKontynent() {
        return kontynent;
    }

    @Override
    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    @Override
    public void setLiczbaLudnosci(int liczbaLudnosci) {
        this.liczbaLudnosci = liczbaLudnosci;
    }

    @Override
    public void migruj(Panstwo panstwo, int liczbaEmigrantow) {
        if (liczbaEmigrantow <= 0 || liczbaEmigrantow > getLiczbaLudnosci()) {
            throw new IllegalArgumentException("Liczba emigrantów musi być dodatnia i nie większa niż liczba ludności");
        }

        setLiczbaLudnosci(getLiczbaLudnosci() - liczbaEmigrantow);
        panstwo.setLiczbaLudnosci(panstwo.getLiczbaLudnosci() + liczbaEmigrantow);
    }

    @Override
    public String getStolica() {
        return stolica;
    }

    @Override
    public List<Panstwo> getSasiedzi() {
        return sasiedzi;
    }

    @Override
    public void dodajSasiada(Panstwo panstwo) {
        sasiedzi.add(panstwo);
    }
}