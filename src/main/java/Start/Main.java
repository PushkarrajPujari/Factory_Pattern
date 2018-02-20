package Start;

import Factory.StackFactory;
import Stack.IStack;

/**
 * @author Pushkarraj
 * @since 20-02-2018.
 *
 * 1] Separate Server and the client , .i.e  a client should be independent of the service provider
 * we can achieve this using interface , by using interface we have made our client independent of the server
 * but we bind it to a particular service , in our case IStack service
 * 2] we have to change the code if we have to change the service provider if the object creation is not done separately
 * 3] Interface gives independence from Usage perspective and Factory gives independence from creation perspective
 */
public class Main {
    public static void main(String[] args) {
        /**
         *
         * StackFactory factory = new StackFactory();
         * IStack stack = factory.getStack("lstack");
         * We can call this factory but we have lost the essence here , a factory is suppose to make us
         * independent of the creation logic , but here we are not totally independent as we have to pass
         * a String parameter which tells which object we want to create
         * We can bring the true essence of factory if we configure the object creation from some property file
         * or Json or xml
         *
         * */
        StackFactory factory = new StackFactory("C:\\Code\\CodeBase\\Local\\Java\\DesignPatterns\\Factory_Design\\Factory\\src\\main\\java\\Configuration\\config.json");
        IStack stack = factory.getStack();
        endUser(stack);
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
