package oberon0.parser.ast;

public class VarDeclaration extends Declaration {

    private VarDeclarationAssignment[] varDeclarationAssignments;

    public VarDeclaration(VarDeclarationAssignment[] varDeclarationAssignment) {
        this.varDeclarationAssignments = varDeclarationAssignment;
    }

    public VarDeclarationAssignment[] getVarDeclarationAssignments() {
        return varDeclarationAssignments;
    }
}
