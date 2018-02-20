package Factory;

import Stack.AStack;
import Stack.IStack;
import Stack.LStack;

/**
 * @author  Pushkarraj
 * @since  20-02-2018.
 */
public class StackFactory {
    public IStack getStack(String string){
        switch (string){
            case "astack":
                return new AStack();
            case "lstack":
                return new LStack();
            default:
                return new LStack();
        }
    }
}
