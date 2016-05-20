package oberon0.parser.ast;

import java.util.List;

public class ElseStatement extends Statement {

    private List<Statement> statementsForElse;
    private IfStatement statementForElseIf;

    public ElseStatement(IfStatement ifStatement) {
        this.statementForElseIf = ifStatement;
        this.statementsForElse = null;
    }

    public ElseStatement(Sequence<Statement> ss) {
        this.statementsForElse = ss.getElements();
        this.statementForElseIf = null;
    }

    public List<Statement> getStatementsForElse() {
        return statementsForElse;
    }

    public IfStatement getStatementForElseIf() {
        return statementForElseIf;
    }
}
