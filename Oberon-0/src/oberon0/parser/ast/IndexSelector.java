package oberon0.parser.ast;

public class IndexSelector extends Selector {

    private Expression expression;

    public IndexSelector(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
