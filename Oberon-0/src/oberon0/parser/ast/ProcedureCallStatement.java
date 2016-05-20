package oberon0.parser.ast;

import java.util.List;

public class ProcedureCallStatement extends Statement {

    private Reference reference;
    private List<Expression> parameters;

    public ProcedureCallStatement(Reference reference, Sequence<Expression> parameters) {
        this.reference = reference;
        this.parameters = parameters.getElements();
    }

    public Reference getReference() {
        return reference;
    }

    public List<Expression> getParameters() {
        return parameters;
    }
}
