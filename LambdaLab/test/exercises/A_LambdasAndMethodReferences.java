package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This set of exercises is about lambdas and method references.
 * You will write a lambda or method reference corresponding to
 * each of several different functional interfaces. Each exercise
 * is named after the functional interface intended to be used
 * as the solution.
 */
public class A_LambdasAndMethodReferences {
    @Test @Ignore
    public void a01predicate() {
        // TODO: write a lambda expression that is a predicate
        // that tests whether a string is longer than four characters.
        Predicate<String> pred = null;

        assertTrue(pred.test("abcde"));
        assertFalse(pred.test("abcd"));
    }

    @Test @Ignore
    public void a02predicate() {
        // TODO: write a lambda expression that is a predicate
        // that tests whether a string is empty
        Predicate<String> pred = null;

        assertTrue(pred.test(""));
        assertFalse(pred.test("a"));
    }

    @Test @Ignore
    public void a03predicate() {
        // TODO: write a method reference that is a predicate
        // that tests whether a string is empty
        Predicate<String> pred = null;

        assertTrue(pred.test(""));
        assertFalse(pred.test("a"));
    }

    @Test @Ignore
    public void a04function() {
        // TODO: write a lambda expression that wraps the given
        // string in parentheses.
        Function<String, String> func = null;
        
        assertEquals("(abc)", func.apply("abc"));
    }

    @Test @Ignore
    public void a05function() {
        // TODO: write a lambda expression that converts the
        // given string to upper case.
        Function<String, String> func = null;

        assertEquals("ABC", func.apply("abc"));
    }

    @Test @Ignore
    public void a06function() {
        // TODO: write a method reference that converts the
        // given string to upper case.
        Function<String, String> func = null;

        assertEquals("ABC", func.apply("abc"));
    }

    @Test @Ignore
    public void a07consumer() {
        // TODO: write a lambda expression that appends the
        // string "abc" to the given StringBuilder.
        Consumer<StringBuilder> cons = null;

        StringBuilder sb = new StringBuilder("xyz");
        cons.accept(sb);
        assertEquals("xyzabc", sb.toString());
    }

    @Test @Ignore
    public void a08consumer() {
        // TODO: write a lambda expression that clears the given list.
        Consumer<List<String>> cons = null;

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        cons.accept(list);
        assertTrue(list.isEmpty());
    }

    @Test @Ignore
    public void a09consumer() {
        // TODO: write a method reference that clears the given list.
        Consumer<List<String>> cons = null;

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        cons.accept(list);
        assertTrue(list.isEmpty());
    }

    @Test @Ignore
    public void a10supplier() {
        // TODO: write a lambda expression that returns a new StringBuilder
        // containing the string "abc".
        Supplier<StringBuilder> sup = () -> new StringBuilder("abc");

        assertEquals("abc", sup.get().toString());
    }

    @Test @Ignore
    public void a11supplier() {
        // TODO: write a lambda expression that returns a new, empty StringBuilder
        Supplier<StringBuilder> sup = null;

        assertEquals("", sup.get().toString());
    }

    @Test @Ignore
    public void a12supplier() {
        // TODO: write a method reference that returns a new, empty StringBuilder
        Supplier<StringBuilder> sup = null;

        assertEquals("", sup.get().toString());
    }

    @Test @Ignore
    public void a13runnable() {
        StringBuilder sb = new StringBuilder("abc");
        String suffix = "xyz";

        // TODO: write a lambda expression that appends the 'suffix'
        // variable (a String) to the sb variable (a StringBuilder).
        Runnable r = () -> sb.append(suffix);

        r.run();
        r.run();
        r.run();
        assertEquals("abcxyzxyzxyz", sb.toString());
    }
}
