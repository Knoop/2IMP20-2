package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class LitExpr extends Expr {

    private final boolean value;

    public LitExpr(boolean value){
        this.value = value;
    }


    @Override
    public boolean evaluate() {
        return this.value;
    }
}
