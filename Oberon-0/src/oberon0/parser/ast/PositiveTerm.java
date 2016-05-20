package oberon0.parser.ast;

public class PositiveTerm extends Term {
    public PositiveTerm(Term t) {
        super(t.getT(), t.getF());
    }
}
