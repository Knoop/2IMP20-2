package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class ComposedName extends Name{

    private final Name attributeOf;
    private final LitName attribute;

    public ComposedName(LitName ln) {
        this(null, ln);
    }
    public ComposedName(Name n, LitName ln) {

        this.attribute = ln;
        this.attributeOf = n;
    }
}
