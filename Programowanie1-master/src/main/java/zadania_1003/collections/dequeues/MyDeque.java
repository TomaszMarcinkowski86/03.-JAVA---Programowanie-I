package zadania_1003.collections.dequeues;


// interfejs który implementować będa klasy MyQueue i MyStack
public interface MyDeque<T> {

    boolean push(T t);

    T pop();

    T peek();

    boolean isEmpty();

    int size();
}
