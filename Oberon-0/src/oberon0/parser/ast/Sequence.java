package oberon0.parser.ast;

import java.util.*;

/**
 * Created by Guus on 20-05-16.
 */
public class Sequence<T> extends LangCons {
    private T element;
    private Sequence<T> previous;

    public Sequence(T element) {
        this(null, element);
    }

    public Sequence(Sequence<T> previous, T element){
        this.element = element;
        this.previous = previous;
    }

    public List<T> getElements() {

        List<T> list = previous != null ? previous.getElements() : new LinkedList<T>();
        list.add(element);
        return list;
    }

}
