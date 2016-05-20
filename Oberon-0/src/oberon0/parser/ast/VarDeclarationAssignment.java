package oberon0.parser.ast;

import java.util.List;

public class VarDeclarationAssignment extends LangCons{

    private List<String> identifiers;
    private Type type;

    public VarDeclarationAssignment(List<String> identifiers, Type type) {
        this.identifiers = identifiers;
        this.type = type;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public Type getType() {
        return type;
    }
}
