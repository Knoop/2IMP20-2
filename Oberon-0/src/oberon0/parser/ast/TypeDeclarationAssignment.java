package oberon0.parser.ast;

public class TypeDeclarationAssignment extends LangCons {

    private String identifier;
    private Type type;

    public TypeDeclarationAssignment(String identifier, Type type) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }
}
