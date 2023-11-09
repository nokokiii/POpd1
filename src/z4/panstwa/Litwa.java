package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoEuropejskie;
import z4.PanstwoImpl;

public class Litwa extends PanstwoImpl implements PanstwoEuropejskie {
    public Litwa() {
        super(Kontynent.EUROPA, 2_900_000, "Wilno");
    }
}
