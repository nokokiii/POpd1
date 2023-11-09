package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoEuropejskie;
import z4.PanstwoImpl;

public class Polska extends PanstwoImpl implements PanstwoEuropejskie {
    public Polska() {
        super(Kontynent.EUROPA, 37_750_000, "Warszawa");
    }
}
