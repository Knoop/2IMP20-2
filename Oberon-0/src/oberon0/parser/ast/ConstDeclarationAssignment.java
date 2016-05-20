package oberon0.parser.ast;

public class ConstDeclarationAssignment extends LangCons {

    private String identifier;
    private Expression expression;

    public ConstDeclarationAssignment(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getExpression() {
        return expression;
    }
}
