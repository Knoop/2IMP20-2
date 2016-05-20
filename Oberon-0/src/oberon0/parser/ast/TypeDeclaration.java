package oberon0.parser.ast;

public class TypeDeclaration extends Declaration {

    private TypeDeclarationAssignment[] typeDeclarationAssignments;

    public TypeDeclaration(TypeDeclarationAssignment[] typeDeclarationAssignments) {
        this.typeDeclarationAssignments = typeDeclarationAssignments;
    }

    public TypeDeclarationAssignment[] getTypeDeclarationAssignments() {
        return typeDeclarationAssignments;
    }
}
