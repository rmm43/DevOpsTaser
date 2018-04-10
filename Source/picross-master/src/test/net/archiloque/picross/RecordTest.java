package net.archiloque.picross;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

/**
 * © Julien Kirch 2013 - Licensed under MIT license
 */
public class RecordTest implements SlotValue{

    static public void assertEquals(final char[] expected, final char[] actual) {
        if(expected == actual) {
            return;
        }
        if(null == expected) {
            fail("expected a null array, but not null found. ");
        }
        if(null == actual) {
            fail("expected not null array, but null found. ");
        }

        AssertJUnit.assertEquals("arrays don't have the same size. ", expected.length, actual.length);

        for(int i= 0; i < expected.length; i++) {
            if(expected[i] != actual[i]) {
                fail("arrays differ firstly at element [" + i + "]; "
                        + format("", expected[i], actual[i]));
            }
        }
    }

    static String format(String message, Object expected, Object actual) {
        String formatted = "";
        if(message != null) {
            formatted = message + " ";
        }

        return formatted + "expected:<" + expected + "> but was:<" + actual + ">";
    }

    @Test
    public void emptyRecord(){
        Record record = new Record(10, new int[0]);
        AssertJUnit.assertEquals(record.possibilities.size(), 1);
        char[] possibility = "          ".toCharArray();
        assertEquals(record.possibilities.get(0), possibility);
        List<Change> changes = record.applyChanged(new ArrayList<Change>(0));
        AssertJUnit.assertEquals(changes.size(), 10);
        for(int i = 0; i < 10; i++) {
            AssertJUnit.assertEquals(changes.get(i).value, EMPTY);
            AssertJUnit.assertEquals(changes.get(i).index, i);
        }
    }

    @Test
    public void filledRecord(){
        Record record = new Record(10, new int[]{10});
        AssertJUnit.assertEquals(record.possibilities.size(), 1);
        char[] possibility = new char[10];
        Arrays.fill(possibility, FILLED);
        assertEquals(record.possibilities.get(0), possibility);
        List<Change> changes = record.applyChanged(new ArrayList<Change>(0));
        AssertJUnit.assertEquals(changes.size(), 10);
        for(int i = 0; i < 10; i++) {
            AssertJUnit.assertEquals(changes.get(i).value, FILLED);
            AssertJUnit.assertEquals(changes.get(i).index, i);
        }
    }

    @Test
    public void twoRecordFill(){
        Record record = new Record(9, new int[]{4, 4});
        AssertJUnit.assertEquals(record.possibilities.size(), 1);
        char[] possibility = "XXXX XXXX".toCharArray();
        assertEquals(record.possibilities.get(0), possibility);
        List<Change> changes = record.applyChanged(new ArrayList<Change>(0));
        AssertJUnit.assertEquals(changes.size(), 9);
        for(int i = 0; i < 9; i++) {
            AssertJUnit.assertEquals(changes.get(i).value, (i == 4) ? EMPTY : FILLED);
            AssertJUnit.assertEquals(changes.get(i).index, i);
        }
    }

    @Test
    public void oneRecordWithSomeSpace(){
        Record record = new Record(10, new int[]{9});
        AssertJUnit.assertEquals(record.possibilities.size(), 2);
        System.err.println(record.possibilities.get(0));
        System.err.println(record.possibilities.get(1));
        assertEquals(record.possibilities.get(0), "XXXXXXXXX ".toCharArray());
        assertEquals(record.possibilities.get(1), " XXXXXXXXX".toCharArray());

        List<Change> changes = record.applyChanged(new ArrayList<Change>(0));
        AssertJUnit.assertEquals(changes.size(), 8);
        for(int i = 0; i < 8; i++) {
            AssertJUnit.assertEquals(changes.get(i).value, FILLED);
            AssertJUnit.assertEquals(changes.get(i).index, i + 1);
        }
        changes = record.applyChanged(Arrays.asList(new Change(0, FILLED)));
        AssertJUnit.assertEquals(changes.size(), 1);
        AssertJUnit.assertEquals(changes.get(0).value, EMPTY);
        AssertJUnit.assertEquals(changes.get(0).index, 9);

    }

}
