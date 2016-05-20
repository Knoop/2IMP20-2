package oberon0.parser.ast;

public abstract class Term extends LangCons {
    Term t;
    Factor f;

    public Term(Term t, Factor f) {
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
