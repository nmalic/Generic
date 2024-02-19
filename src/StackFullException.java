/**
 * The Exception StackFullException.
 * @author Nicoleta Malic
 * @version 2024-02-19
 */
public class StackFullException extends Exception{
    /**
     * Constructor for the StackFullException
     * @param message the text is shown during the error
     */
    public StackFullException(String message) {
        super(message);
    }
}
