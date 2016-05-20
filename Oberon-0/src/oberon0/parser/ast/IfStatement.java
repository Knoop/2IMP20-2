package oberon0.parser.ast;

import beaver.Symbol;

import java.util.List;

/**
 * Created by Guus on 20-05-16.
 */
public class IfStatement extends Statement {

    private Expression expression;
    List<Statement> statements;
    ElseStatement elseStatement;

    public IfStatement(Expression expression, List<Statement> statements, ElseStatement elseStatement) {
        this.expression = expression;
        this.statements = statements;
        this.elseStatement = elseStatement;
    }

    public Expression getExpression() {
        return expression;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }
}
