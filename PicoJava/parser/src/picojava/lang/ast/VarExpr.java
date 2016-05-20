package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class VarExpr extends Expr{

    private final Name name;

    public VarExpr(Name name) {
        this.name = name;
    }

    @Override
    public boolean evaluate() {
        return false;
    }
}
