/**
 * The Exception StackEmptyException.
 * @author Nicoleta Malic
 * @version 2024-02-19
 */
public class StackEmptyException extends Exception{
    /**
     * Constructor for the StackEmptyException
     * @param message the text is shown during the error
     */
    public StackEmptyException(String message) {
        super(message);
    }
}
