package oberon0.parser.ast;

public class VariableFactor extends Factor {

    private Reference reference;

    public VariableFactor(Reference reference) {
        this.reference = reference;
    }

    public Reference getReference() {
        return reference;
    }
}
