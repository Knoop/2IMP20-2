package oberon0.parser.ast;

public class SmallerEqualComparison extends Comparison {

    private Expression e1;
    private Expression e2;

    public SmallerEqualComparison(Expression e1, Expression e2) {
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