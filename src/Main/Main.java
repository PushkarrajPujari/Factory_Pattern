package Main;

import Stack.AStack;
import Stack.IStack;
import Stack.LStack;

/**
 * @author Pushkarraj
 * @since 20-02-2018.
 *
 * 1] Separate Server and the client , .i.e  a client should be independent of the service provider
 * we can achieve this using interface , by using interface we have made our client independent of the server
 * but we bind it to a particular service , in our case IStack service
 * 2] we have to change the code if we have to change the service provider 
 */
public class Main {
    public static void main(String[] args) {
        AStack aStack = new AStack(10);
        endUser(aStack);
        LStack lStack = new LStack();
        endUser(lStack);
    }

    public static void endUser(IStack stack){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Popped Value = "+stack.pop());

        stack.print();
    }
}
