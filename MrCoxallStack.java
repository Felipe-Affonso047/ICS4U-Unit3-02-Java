/*
* This program is a stack class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-07
*/

import java.util.ArrayList;

/**
 * MrCoxallStack.
 */
public class MrCoxallStack {
    /**
    * Stack variable.
    */
    private ArrayList<Integer> stack = new ArrayList<Integer>();

    /**
    * Function adds value to stack.
    *
    * @param pushValue discription.
    */
    public void push(final int pushValue) {
        stack.add(0, pushValue);
    }

    /**
    * Prints stack.
    */
    public void showStack() {
        for (int counter = 0; counter < stack.size(); counter++) {
            System.out.println(stack.get(counter));
        }
    }

    /**
    * Pop stack.
    *
    * @return returnValue good.
    */
    public int pop() {
        final int returnValue = stack.get(0);
        stack.remove(0);
        return returnValue;
    }
}
