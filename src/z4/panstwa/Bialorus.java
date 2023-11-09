package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoEuropejskie;
import z4.PanstwoImpl;

public class Bialorus extends PanstwoImpl implements PanstwoEuropejskie {
    public Bialorus() {
        super(Kontynent.EUROPA, 9_500_000, "Mińsk");
    }
}
