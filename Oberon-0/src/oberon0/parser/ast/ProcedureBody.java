package oberon0.parser.ast;

import java.util.List;

public class ProcedureBody extends LangCons {

    private Declaration[] declarations;
    private List<Statement> statements;
    private String identifier;

    public ProcedureBody(Declaration[] declarations, Sequence<Statement> statements, String identifier) {
        this.declarations = declarations;
        this.statements = statements.getElements();
        this.identifier = identifier;
    }

    public Declaration[] getDeclarations() {
        return declarations;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public String getIdentifier() {
        return identifier;
    }
}
