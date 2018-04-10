package net.archiloque.picross;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a record: a line or a column containing blocks.
 * © Julien Kirch 2013 - Licensed under MIT license
 */
public final class Record implements SlotValue {

    final char[] currentValues;

    private int[] blocks;

    List<char[]> possibilities = new ArrayList<char[]>();

    /**
     * Create a new Record.
     * @param length the length.
     * @param blocks the blocks it should contain.
     */
    public Record(int length, int[] blocks) {
        this.blocks = blocks;
        currentValues = new char[length];

        Arrays.fill(currentValues, UNKNOWN);
        if (blocks.length == 0) {
            // no block
            char[] possibility = new char[length];
            Arrays.fill(possibility, EMPTY);
            possibilities.add(possibility);
        } else {
            // some blocks => we calculate all the "available" block that can be dispacthed as we want
            int availableBlocks = length - (blocks.length - 1);
            for (int block : blocks) {
                availableBlocks -= block;
            }
            fillPossibilities(new char[0], availableBlocks, 0, length);
        }
    }

    /**
     * Apply some Changes to this record and return the resulting Changes.
     * @param changes the Changes to apply.
     * @return a non-null List of resulting changes.
     */
    public List<Change> applyChanged(List<Change> changes) {
        // filter the possibilities with changes
        if (! changes.isEmpty()) {
            List<char[]> newPossibilities = new ArrayList<char[]>(possibilities.size());
            for (char[] possibility : possibilities) {
                if (isCompatible(possibility, changes)) {
                    newPossibilities.add(possibility);
                }
            }
            possibilities = newPossibilities;

            // apply the change since we know their value
            for (Change change : changes) {
                currentValues[change.index] = change.value;
            }
        }

        // check it it enable to calculate new things
        List<Change> result = new ArrayList<Change>();
        for (int i = 0; i < currentValues.length; i++) {
            if (currentValues[i] == UNKNOWN) {
                char value = getValueFromPossibilities(i);
                if (value != UNKNOWN) {
                    result.add(new Change(i, value));
                    currentValues[i] = value;
                }
            }
        }
        return result;
    }

    /**
     * Check if a possibility is compatible with a list of change.
     * @param possibility the possibility to test.
     * @param changes the list of changes to apply
     * @return true if the possibility is compatible.
     */
    private boolean isCompatible(char[] possibility, List<Change> changes) {
        for (Change change : changes) {
            if (possibility[change.index] != change.value) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check in possibilities if we can deduce a value = if all the possibilities have the same value at this position.
     * @param index the position to check
     * @return the calculated value
     */
    private char getValueFromPossibilities(int index) {
        char candidate = possibilities.get(0)[index];
        for (char[] possibility : possibilities) {
            if (possibility[index] != candidate) {
                return UNKNOWN;
            }
        }
        return candidate;
    }

    /**
     * Recursive function to create all the possibilities: we create a possibility by adding blocks.
     * @param currentState the current state of building a possibility.
     * @param availableBlocks the blocks available to be placed.
     * @param nextBlockIndex the index of the next block to be added.
     * @param totalLength the total length of the record.
     */
    private void fillPossibilities(char[] currentState, int availableBlocks, int nextBlockIndex, int totalLength) {
        int nextBlockLength = blocks[nextBlockIndex];
        for (int i = 0; i <= availableBlocks; i++) {
            int toBeAddedLength = (nextBlockIndex == 0) ? i : (i + 1);

            char[] newState = Arrays.copyOf(currentState, currentState.length + toBeAddedLength + nextBlockLength);
            Arrays.fill(newState, currentState.length, currentState.length + toBeAddedLength, EMPTY);
            Arrays.fill(newState, currentState.length + toBeAddedLength, newState.length, FILLED);
            if (nextBlockIndex == (blocks.length - 1)) {
                char[] lastState = Arrays.copyOf(newState, totalLength);
                Arrays.fill(lastState, newState.length, lastState.length, EMPTY);
                possibilities.add(lastState);
            } else {
                fillPossibilities(newState, availableBlocks - i, nextBlockIndex + 1, totalLength);
            }
        }
    }

}
