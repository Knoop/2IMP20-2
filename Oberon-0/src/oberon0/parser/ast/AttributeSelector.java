package oberon0.parser.ast;


public class AttributeSelector extends LangCons {

    private String identifier;

    public AttributeSelector(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
