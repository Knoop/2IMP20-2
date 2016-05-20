package oberon0.parser.ast;

public class ConstDeclaration extends Declaration {

    private ConstDeclarationAssignment[] constDeclarationAssignments;

    public ConstDeclaration(ConstDeclarationAssignment[] constDeclarationAssignments) {
        this.constDeclarationAssignments = constDeclarationAssignments;
    }

    public ConstDeclarationAssignment[] getConstDeclarationAssignments() {
        return constDeclarationAssignments;
    }
}
