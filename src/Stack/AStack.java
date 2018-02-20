package Stack;

/**
 * @author Pushkarraj
 * @since  20-02-2018.
 */
public class AStack implements IStack{
    private int [] stack;
    private int stackPointer;

    public AStack(int size){
        stack = new int[size];
        stackPointer = stack.length;
    }

    @Override
    public void push(int v) {
        if(stackPointer <= 0){
            System.out.println("Stack is full");
        }else {
            stack[--stackPointer] = v;
        }
    }

    @Override
    public int pop() {
        if(stackPointer >= stack.length){
            System.out.println("Stack is empty");
        }else {
            return stack[stackPointer++];
        }
        return -1;
    }

    @Override
    public void print() {
        System.out.println("StackPointer = "+stackPointer);
        for(int i = stackPointer ; i < stack.length; i++){
            System.out.println("Stack Value = "+stack[i]);
        }
    }

    @Override
    public int peek() {
        return stack[stackPointer];
    }
}
