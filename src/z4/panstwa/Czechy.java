package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoEuropejskie;
import z4.PanstwoImpl;

public class Czechy extends PanstwoImpl implements PanstwoEuropejskie {
    public Czechy() {
        super(Kontynent.EUROPA, 10_550_000, "Praga");
    }
}
