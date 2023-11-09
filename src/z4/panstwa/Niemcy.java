package z4.panstwa;

import z4.Kontynent;
import z4.PanstwoEuropejskie;
import z4.PanstwoImpl;

public class Niemcy extends PanstwoImpl implements PanstwoEuropejskie {
    public Niemcy() {
        super(Kontynent.EUROPA, 83_000_000, "Berlin");
    }
}