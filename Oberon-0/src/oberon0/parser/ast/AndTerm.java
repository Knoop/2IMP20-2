package oberon0.parser.ast;

import beaver.Symbol;

/**
 * Created by Guus on 20-05-16.
 */
public class AndTerm extends Term {

    public AndTerm(Term t, Factor f) {
        super(t, f);
    }
}
