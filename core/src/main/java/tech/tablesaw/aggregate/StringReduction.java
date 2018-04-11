package tech.tablesaw.aggregate;

import tech.tablesaw.api.ColumnType;
import tech.tablesaw.columns.Column;

/**
 * A partial implementation of aggregate functions to summarize over a string column
 */
public abstract class StringReduction extends Reduction{

    public StringReduction(String name) {
        super(name);
    }

    abstract public double summarize(Column column);

    public boolean isCompatibleWith(ColumnType type) {
        return type.equals(ColumnType.STRING);
    }
}
