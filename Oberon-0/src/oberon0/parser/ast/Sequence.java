package oberon0.parser.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guus on 20-05-16.
 */
public class Sequence<T> extends LangCons {
    private List<T> elements;

    public Sequence(List<T> elements) {
        this.elements = elements;
    }

    public List<T> getElements() {
        return elements;
    }
}
