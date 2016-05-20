package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class AndExpr extends Expr{

    private final Expr a, b;

    public AndExpr(Expr a, Expr b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean evaluate() {
        return a.evaluate() && b.evaluate();
    }
}
