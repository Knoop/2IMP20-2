package oberon0.parser.ast;

import beaver.Symbol;

import java.util.List;

/**
 * Created by Guus on 20-05-16.
 */
public class RecordType extends Type {

    private List<Field> fields;

    public RecordType(List<Field> fields) {
        this.fields = fields;
    }

    public List<Field> getFields() {
        return fields;
    }
}
