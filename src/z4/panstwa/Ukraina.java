package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoEuropejskie;
import z4.PanstwoImpl;

public class Ukraina extends PanstwoImpl implements PanstwoEuropejskie {
    public Ukraina() {
        super(Kontynent.EUROPA, 42_000_000, "Kijów");
    }
}
