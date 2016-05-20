package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class AssignStatement extends Statement {

    private final Expr e;
    private final Name n;

    public AssignStatement(Name n, Expr e) {
        this.n = n;
        this.e = e;
    }
}
