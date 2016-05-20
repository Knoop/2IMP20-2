package oberon0.parser.ast;

import java.util.List;

public class WhileStatement extends Statement {

    private Expression expression;
    private List<Statement> statements;

    public WhileStatement(Expression expression, List<Statement> statements) {
        this.expression = expression;
        this.statements = statements;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
