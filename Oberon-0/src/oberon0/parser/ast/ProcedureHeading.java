package oberon0.parser.ast;

import java.util.List;

public class ProcedureHeading extends LangCons {

    private String identifier;
    private List<FormalParam> parameters;

    public ProcedureHeading(String identifier, Sequence<FormalParam> parameters) {
        this.identifier = identifier;
        this.parameters = parameters.getElements();
    }



    public String getIdentifier() {
        return identifier;
    }

    public List<FormalParam> getParameters() {
        return parameters;
    }
}
