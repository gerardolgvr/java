package dev.gerardo.exercises;

import dev.gerardo.topics.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void size() {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(12);

        assertEquals(1, myStack.size());
    }

    @Test
    public void isEmpty() {
        Stack<Integer> myStack = new Stack<>();
        assertTrue(myStack.isEmpty());

        myStack.push(5);
        assertFalse(myStack.isEmpty());

        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void clear() {
        Stack<Integer> myStack = new Stack<>();
        assertTrue(myStack.isEmpty());

        myStack.push(2);
        assertFalse(myStack.isEmpty());

        myStack.clear();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void pushAndPop() {
        Stack<String> myStack = new Stack<>();
        assertEquals(0, myStack.size());

        myStack.push("one");
        assertEquals(1, myStack.size());
        myStack.push("two");
        assertEquals(2, myStack.size());

        assertEquals("two", myStack.pop());
        assertEquals("one", myStack.pop());
        assertEquals(0, myStack.size());
    }

}
