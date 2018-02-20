package Factory;

import Stack.AStack;
import Stack.IStack;
import Stack.LStack;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author  Pushkarraj
 * @since  20-02-2018.
 */
public class StackFactory {
    private String stack;
    public StackFactory(String path){
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader(path));
            stack = (String) jsonObject.get("stack");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public IStack getStack(){
        if (stack.equals("astack")) {
            return new AStack();
        } else if (stack.equals("lstack")) {
            return new LStack();
        } else {
            return new LStack();
        }
    }
}
