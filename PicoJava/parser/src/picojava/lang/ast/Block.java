package picojava.lang.ast;

/**
 * Created by Maurice on 16-5-2016.
 */
public class Block extends LangConst{
    private final BlockStatement[] bs;

    public Block(BlockStatement[] bs) {
        this.bs = bs;
    }
}
