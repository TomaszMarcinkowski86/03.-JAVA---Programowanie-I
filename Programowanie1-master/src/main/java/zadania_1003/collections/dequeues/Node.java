package zadania_1003.collections.dequeues;

// klasa pomocnicza dla MyStack i MyQueue
// klasa jest package private, żeby powyższe mogły z niej korzystać
// i żeby była niewidoczna dla pozostałych klas
class Node<T> {
    private Node node;
    private T t;

    public Node(Node node, T t) {
        this.node = node;
        this.t = t;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public T getT() {
        return t;
    }

}
