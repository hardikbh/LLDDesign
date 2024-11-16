package cache.algorithm;

public class Doublylinkedlist<T> {
      Node left;
      Node right;

    public Doublylinkedlist() {
        this.left = new Node(null);

        this.right = new Node(null);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

  public   void detachNode(Node<T> node)
    {
        Node<T> nxt = node.next;
        Node<T> prv = node.prev;
        prv.next = nxt;
        nxt.prev = prv;
    }

    public void addNodeAtLast(Node node)
    {
        Node prv = this.right.prev;
        prv.next = node;
        node.next=this.right;
        this.right.prev = node;
        node.prev=prv;
    }
    public Node<T> addElementatLast(T val)
    {
        Node<T> node = new Node<>(val);
        addNodeAtLast(node);
        return node;
    }
    public Node<T> getFirstNode()
    {
        return this.left.next;
    }
    public Node<T> getLastNode()
    {
        return this.right.next;
    }

}
