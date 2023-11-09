package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoAzjatyckie;
import z4.PanstwoImpl;

public class Rosja extends PanstwoImpl implements PanstwoAzjatyckie {
    public Rosja() {
        super(Kontynent.AZJA, 143_400_000, "Moskwa");
    }
}
