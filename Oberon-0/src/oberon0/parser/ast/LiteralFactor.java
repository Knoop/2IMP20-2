package oberon0.parser.ast;

public class LiteralFactor extends Factor {

    private String literal;

    public LiteralFactor(String literal) {
        this.literal = literal;
    }

    public String getLiteral() {
        return literal;
    }
}
