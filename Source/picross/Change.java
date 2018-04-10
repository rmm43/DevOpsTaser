package net.archiloque.picross;

/**
 * Represents a change to be applied on a Record.
 * © Julien Kirch 2013 - Licensed under MIT license
 */
public class Change {

    public final int index;

    public final char value;

    public Change(int index, char value) {
        this.index = index;
        this.value = value;
    }

    public String toString(){
        return index + " -> " + value;
    }
}
