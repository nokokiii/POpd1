package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoEuropejskie;
import z4.PanstwoImpl;

public class Slowacja extends PanstwoImpl implements PanstwoEuropejskie {
    public Slowacja() {
        super(Kontynent.EUROPA, 5_450_000, "Bratyslawa");
    }
}
