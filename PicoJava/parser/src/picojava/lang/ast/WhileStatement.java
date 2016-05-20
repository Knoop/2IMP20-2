package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class WhileStatement extends Statement {

    private final Expr e;
    private final Statement s;

    public WhileStatement(Expr e, Statement s) {
        this.e = e;
        this.s = s;
    }
}
