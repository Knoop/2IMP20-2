package oberon0.parser.ast;

public class OrExpression extends Expression {

    private Expression expression;
    private Term term;

    public OrExpression(Expression expression, Term term) {
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
