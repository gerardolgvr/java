package dev.gerardo.topics;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public boolean push(T itemToPush) {
        return items.add(itemToPush);
    }

    public T pop() {
        T last = items.get(items.size() - 1);
        items.remove(last);
        return last;
    }

    public boolean contains(T item) {
        return items.contains(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

}
