package oberon0.parser.ast;


public class AttributeSelector extends Selector {

    private String identifier;

    public AttributeSelector(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
