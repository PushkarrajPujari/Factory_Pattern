package Stack;

/**
 * @author Pushkarraj
 * @since 20-02-2018.
 */
public class LStack implements IStack {
    private Node head;

    @Override
    public void push(int value) {
        head = new Node(value,head);
    }

    @Override
    public int pop() {
        if(head == null){
            System.out.println("Stack is empty");
        }else {
            Node temp = head;
            head = head.getNext();
            return temp.getValue();
        }
        return -1;
    }

    @Override
    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    @Override
    public int peek() {
        return head.getValue();
    }
}
