package oberon0.parser.ast;

/**
 * Created by Guus on 20-05-16.
 */
public class GreaterEqualComparison extends Comparison {

    private Expression e1;
    private Expression e2;

    public GreaterEqualComparison(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Expression getE1() {
        return e1;
    }

    public Expression getE2() {
        return e2;
    }
}

