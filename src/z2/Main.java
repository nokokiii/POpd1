package z2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadanie 2");
        List<Zwierze> zwierzeta = List.of(new Pies(10, "Burek"), new Ryba(1));
        Pies pies = (Pies) zwierzeta.get(0);
        Ryba ryba = (Ryba) zwierzeta.get(1);

        assert pies.getIleNog() == 4;
        assert pies.getWiek() == 10;
        assert pies.getImie().equals("Burek");
        assert ryba.getIleNog() == 0;
        assert ryba.getWiek() == 1;
        assert pies.dajGlos().equals("Hau hau");
        assert ryba.dajGlos().equals("Bul bul");
        assert ImienneZwierze.class.isInstance(pies);
        assert !ImienneZwierze.class.isInstance(ryba);
    }
}
