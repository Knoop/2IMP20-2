package oberon0.parser.ast;

public class LiteralType extends Type {

    private String identifier;

    public LiteralType(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
