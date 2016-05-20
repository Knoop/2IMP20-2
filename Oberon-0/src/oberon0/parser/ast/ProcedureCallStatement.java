package oberon0.parser.ast;

import java.util.List;

public class ProcedureCallStatement extends LangCons {

    private Reference reference;
    private List<Expression> parameters;

    public ProcedureCallStatement(Reference reference, List<Expression> parameters) {
        this.reference = reference;
        this.parameters = parameters;
    }

    public Reference getReference() {
        return reference;
    }

    public List<Expression> getParameters() {
        return parameters;
    }
}
