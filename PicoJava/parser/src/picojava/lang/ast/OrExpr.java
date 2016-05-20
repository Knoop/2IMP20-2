package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class OrExpr extends Expr{


    private final Expr a, b;

    public OrExpr(Expr a, Expr b){
        this.a = a;
        this.b = b;
    }


    @Override
    public boolean evaluate() {
        return a.evaluate() || b.evaluate();
    }
}
