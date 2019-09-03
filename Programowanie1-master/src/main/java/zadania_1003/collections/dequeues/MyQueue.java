package zadania_1003.collections.dequeues;

//Zaimplementuj Kolejkę z metodami push(), pop(), peek(), isEmpty(), size().

public class MyQueue<T> implements MyDeque<T> {

    private int długoscKolejki;
    private Node<T> head;
    private Node<T> last;

    public MyQueue() {
        this.długoscKolejki = 0;
    }

    public MyQueue(T t) {
        this.długoscKolejki = 1;
        this.head = new Node(null, t);
    }

    @Override
    public boolean push(T t) {
        Node temp = last;
        last = new Node<>(null, t);

        if (długoscKolejki == 0) {
            head = last;
        } else if (długoscKolejki == 1) {
            head.setNode(last);
        } else {
            temp.setNode(last);
        }
        długoscKolejki += 1;
        return true;
    }

    @Override
    public T pop() {
        Node<T> temp = head;
        head = head.getNode();
        długoscKolejki -= 1;
        return temp.getT();
    }

    @Override
    public T peek() {
        return head == null ? null : head.getT();
    }

    @Override
    public int size() {
        return długoscKolejki;

    }

    @Override
    public boolean isEmpty() {
        return długoscKolejki == 0;
    }

}
