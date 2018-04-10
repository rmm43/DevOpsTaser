package net.archiloque.picross;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the grid.
 * © Julien Kirch 2013 - Licensed under MIT license
 */
public class Grid {

    private final Record[] lines;

    private final Record[] columns;

    /**
     * Create a grid
     * @param linesBlocks the blocks for the lines.
     * @param columnsBlocks the blocks for the columns.
     */
    public Grid(int[][] linesBlocks, int[][] columnsBlocks) {
        lines = new Record[linesBlocks.length];
        for (int i = 0; i < linesBlocks.length; i++) {
            lines[i] = new Record(columnsBlocks.length, linesBlocks[i]);
        }
        columns = new Record[columnsBlocks.length];
        for (int i = 0; i < columnsBlocks.length; i++) {
            columns[i] = new Record(linesBlocks.length, columnsBlocks[i]);
        }
    }

    /**
     * Check if an array of change list is empty.
     */
    private boolean hasAnyChange(List<Change>[] changes) {
        for (List<Change> change : changes) {
            if (!change.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Process until we find a solution or until the process is stuck.
     */
    @SuppressWarnings({"unchecked"})
    public void process() {
        List<Change>[] changes = new List[columns.length];
        for (int i = 0; i < changes.length; i++) {
            changes[i] = new ArrayList<Change>(0);
        }
        while (true) {
            changes = applyChanges(changes, columns, lines.length);
            if (!hasAnyChange(changes)) {
                return;
            }
            changes = applyChanges(changes, lines, columns.length);
            if (!hasAnyChange(changes)) {
                return;
            }

        }
    }


    /**
     * Apply some changes to a list of record and return the resulting changes ready to be applied.
     */
    @SuppressWarnings({"unchecked"})
    private List<Change>[] applyChanges(List<Change>[] changesToApply, Record[] records, int otherDimensionSize) {
        List<Change>[] result = new List[otherDimensionSize];
        for (int i = 0; i < otherDimensionSize; i++) {
            result[i] = new ArrayList<Change>();
        }
        for (int i = 0; i < records.length; i++) {
            Record record = records[i];
            List<Change> changes = record.applyChanged(changesToApply[i]);
            for (Change change : changes) {
                result[change.index].add(new Change(i, change.value));
            }
        }
        return result;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Record line : lines) {
            result.append(line.currentValues).append("\n");
        }
        return result.toString();
    }
}
