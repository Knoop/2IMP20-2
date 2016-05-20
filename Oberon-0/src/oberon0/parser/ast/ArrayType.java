package oberon0.parser.ast;

/**
 * Created by Guus on 20-05-16.
 */
public class ArrayType extends Type {

    Expression expression;
    Type type;

    public ArrayType(Expression expression, Type type) {
        this.expression = expression;
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getType() {
        return type;
    }
}
