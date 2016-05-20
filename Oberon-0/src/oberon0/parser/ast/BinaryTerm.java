package oberon0.parser.ast;

/**
 * Created by Maurice on 20-5-2016.
 */
public abstract class BinaryTerm extends Term {
    Term t;
    Factor f;

    public BinaryTerm(Term t, Factor f) {
        this.t = t;
        this.f = f;
    }

    public Term getT() {
        return t;
    }

    public Factor getF() {
        return f;
    }
}
