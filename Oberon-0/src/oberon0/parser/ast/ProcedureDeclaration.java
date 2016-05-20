package oberon0.parser.ast;

public class ProcedureDeclaration extends LangCons {

    private ProcedureHeading procedureHeading;
    private ProcedureBody procedureBody;

    public ProcedureDeclaration(ProcedureHeading procedureHeading, ProcedureBody procedureBody) {
        this.procedureHeading = procedureHeading;
        this.procedureBody = procedureBody;
    }

    public ProcedureHeading getProcedureHeading() {
        return procedureHeading;
    }

    public ProcedureBody getProcedureBody() {
        return procedureBody;
    }
}
