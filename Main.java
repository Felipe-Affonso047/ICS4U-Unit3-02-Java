/*
* This program test the stack class
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-08
*/

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    public static final int TEN = 10;
    /**
    * Constant.
    */
    public static final int TWENTY_SEVEN = 27;

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final MrCoxallStack stack = new MrCoxallStack();

        System.out.println("Inicial Stack:");
        stack.showStack();

        System.out.println("Add 10:");
        stack.push(TEN);

        stack.showStack();

        System.out.println("Add 27:");
        stack.push(TWENTY_SEVEN);
        stack.showStack();

        System.out.println("POP:");
        stack.pop();
        stack.showStack();

        System.out.println("\nDone.");
    }
}
