package oberon0.parser.ast;

import java.util.List;

public class ProcedureBody extends LangCons {


    private DeclarationGroup declarationGroup;
    private List<Statement> statements;
    private String identifier;

    public ProcedureBody(DeclarationGroup gd, Sequence<Statement> statements, String identifier) {
        this.declarationGroup = gd;
        this.statements = statements.getElements();
        this.identifier = identifier;
    }


    public List<Statement> getStatements() {
        return statements;
    }

    public String getIdentifier() {
        return identifier;
    }
}
