package oberon0.parser.ast;

/**
 * Created by Guus on 20-05-16.
 */
public class AssignStatement extends Statement {

    Reference reference;
    Expression expression;

    public AssignStatement(Reference reference, Expression expression) {
        this.reference = reference;
        this.expression = expression;
    }

    public Reference getReference() {
        return reference;
    }

    public Expression getExpression() {
        return expression;
    }
}
