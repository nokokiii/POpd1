package z4;

import java.util.List;


public interface Panstwo {
    Kontynent getKontynent();
    int getLiczbaLudnosci();
    void setLiczbaLudnosci(int liczbaLudnosci);
    void migruj(Panstwo panstwo, int liczbaEmigrantow);
    String getStolica();
    List<Panstwo> getSasiedzi();
    void dodajSasiada(Panstwo sasiad);
}
