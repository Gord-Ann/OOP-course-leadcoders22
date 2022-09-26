package task1;

import java.util.Comparator;


/**
 * Отдельный класс-comparator
 * для нужной нам сортировки
 */
public class TableRowsComparator implements Comparator<String[]> {
    private final int columnIndex;
    private final NullNumericAndStringComparator comparator;

    public TableRowsComparator(final int columnIndex) {
        this.columnIndex = columnIndex;
        comparator = new NullNumericAndStringComparator();
    }

    @Override
    public int compare(String[] o1, String[] o2) {
        String cell1 = o1[columnIndex];
        String cell2 = o2[columnIndex];
        return comparator.compare(cell1, cell2);
    }


}
