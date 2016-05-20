package oberon0.parser.ast;

import beaver.Symbol;

public class NegativeTerm extends Term {
    public NegativeTerm(Term t) {
        super(t.getT(), t.getF());
    }
}
