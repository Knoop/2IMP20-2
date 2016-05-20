package oberon0.parser.ast;

import beaver.Symbol;

public class NegatedFactor extends Factor {

    private Factor factor;

    public NegatedFactor(Factor factor) {
        this.factor = factor;
    }

    public Factor getFactor() {
        return factor;
    }
}
