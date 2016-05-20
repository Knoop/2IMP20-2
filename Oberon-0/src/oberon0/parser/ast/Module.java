package oberon0.parser.ast;

import java.util.List;

public class Module extends LangCons {

    private String identifier1;
    private String identifier2;
    private Declaration[] declarations;
    private List<Statement> statements;

    public Module(String identifier1, String identifier2, Declaration[] declarations, List<Statement> statements) {
        this.identifier1 = identifier1;
        this.identifier2 = identifier2;
        this.declarations = declarations;
        this.statements = statements;
    }

    public String getIdentifier1() {
        return identifier1;
    }

    public String getIdentifier2() {
        return identifier2;
    }

    public Declaration[] getDeclarations() {
        return declarations;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
