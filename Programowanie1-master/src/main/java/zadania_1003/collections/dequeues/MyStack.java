package zadania_1003.collections.dequeues;

import zadania_1003.collections.dequeues.MyDeque;

public class MyStack<T> implements MyDeque<T> {

    private int dlugoscStosu;
    private Node<T> head;

    public MyStack(T t) {
        this.dlugoscStosu = 1;
        this.head = new Node(null, t);
    }

    public MyStack() {
        this.dlugoscStosu = 0;
    }

    @Override
    public boolean push(T t) {
        head = new Node(head, t);
        dlugoscStosu += 1;
        return true;
    }

    @Override
    public T pop() {
        Node<T> temp = head;
        head = head.getNode();
        return temp.getT();
    }

    @Override
    public T peek() {
        return head == null ? null : head.getT();
    }

    @Override
    public boolean isEmpty() {
        return dlugoscStosu == 0;
    }

    @Override
    public int size() {
        return dlugoscStosu;
    }
}
