package oberon0.parser.ast;

public class SubtractExpression extends Expression {

    private Expression expression;
    private Term term;

    public SubtractExpression(Expression expression, Term term) {
        this.expression = expression;
        this.term = term;
    }

    public Expression getExpression() {
        return expression;
    }

    public Term getTerm() {
        return term;
    }
}
