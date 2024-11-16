package cache.algorithm;

public class Node<E> {
      Node next;
      Node prev;
      E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node(E value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }
}
