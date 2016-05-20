package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class ClassDecl extends BlockStatement{

    private final Name e;
    private final LitName identifier;
    private final Block b;
    public ClassDecl(LitName identifier, Name e, Block b) {
        this.identifier = identifier;
        this.e = e;
        this.b = b;
    }
}
