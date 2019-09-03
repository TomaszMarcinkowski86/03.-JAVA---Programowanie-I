package zadania_1003.collections.dequeues;

/**
 2. Zaimplemetuj stos korzystajc z tablicy.
 */

import zadania_1003.collections.dequeues.MyDeque;

import java.util.ArrayList;

public class ArrayStack<T> implements MyDeque<T> {

    ArrayList<T> stack;
    int head;


    public ArrayStack(int dlTab) {
        stack = new ArrayList<>();
    }

    @Override
    public boolean push(T t) {
        head += 1;
        stack.add(t);
        return true;
    }

    @Override
    public T pop() {
        if (head == -1) {
            return null;
        }
        T temp = stack.get(head);
        stack.remove(head);
        head -= 1;
        return temp;
    }

    @Override
    public T peek() {
        return head == -1 ? null : stack.get(head);
    }

    @Override
    public boolean isEmpty() {
        return head == (-1);
    }

    @Override
    public int size() {
        return head + 1;
    }
}
