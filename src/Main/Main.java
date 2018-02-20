package Main;

import Stack.AStack;

import java.util.Scanner;

/**
 * @author Pushkarraj
 * @since 20-02-2018.
 */
public class Main {
    public static void main(String[] args) {
        AStack aStack = new AStack(10);
        endUser(aStack);
    }

    public static void endUser(AStack stack){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();

        stack.print();
    }
}
