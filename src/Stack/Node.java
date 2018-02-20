package Stack;

/**
 * @author Pushkarraj
 * @since 20-02-2018.
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
