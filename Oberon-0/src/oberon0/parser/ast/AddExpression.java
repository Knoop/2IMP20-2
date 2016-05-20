package oberon0.parser.ast;

public class AddExpression extends Expression {

    private Expression se;
    private Term t;

    public AddExpression(Expression se, Term t) {
        this.se = se;
        this.t = t;
    }

    public Expression getSe() {
        return se;
    }

    public Term getT() {
        return t;
    }
}
