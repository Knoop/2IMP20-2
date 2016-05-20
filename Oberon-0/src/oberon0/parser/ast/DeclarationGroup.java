package oberon0.parser.ast;

import beaver.Symbol;

/**
 * Created by Maurice on 20-5-2016.
 */
public class DeclarationGroup extends Symbol {

    private final ConstDeclaration cd;
    private final TypeDeclaration td;
    private final VarDeclaration vd;
    private final ProcedureDeclaration pd;

    public DeclarationGroup(ConstDeclaration cd, TypeDeclaration td, VarDeclaration vd, ProcedureDeclaration pd) {
        this.cd = cd;
        this.td = td;
        this.vd = vd;
        this.pd = pd;
    }
}
