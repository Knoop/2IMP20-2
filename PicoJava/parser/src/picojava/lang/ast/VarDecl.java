package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class VarDecl extends BlockStatement {
    private final LitName s;
    private final Name n;

    public VarDecl(Name n, LitName s) {
        this.n = n;
        this.s = s;
    }
}
