/**
 * The class Stack.
 * @author Nicoleta Malic
 * @version 2024-02-19
 */
public class Stack<T> {
    private Object[] array;
    private int size;
    private int capacity;

    /**
     * Constructor for the stack class
     */
    public Stack(){
        this(10);
    }

    /**
     * Constructor for the stack class
     * @param capacity set the size of the stack
     */
    public Stack(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    /**
     * The method push add an element to the top of the stack
     * @param element the element that is being added
     * @throws StackFullException
     */
    public void push(T element) throws StackFullException {
        if (size  == this.array.length) throw new StackFullException("Stack is full.");
        this.array[size++] = element;
    }

    /**
     * Pop delets the element on the top
     * @return the elemant that is being removed
     * @throws StackEmptyException
     */
    public T pop() throws StackEmptyException {
        if (size == 0){ throw new StackEmptyException("Stack is empty.");}
        T t = (T) this.array[--size];
        return t;
    }

    public T peek() throws StackEmptyException {
        if (size == 0){ throw new StackEmptyException("Stack is empty.");}
        return (T) this.array[size -1];
    }

    /**
     * Creates a list of the stack
     * @return a string
     */
    public String list() {
        String out = "";
        for (int i = size - 1; i >= 0; i--) {
            out += this.array[i] + "; ";
        }
        return out;
    }
}
