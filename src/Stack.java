public class Stack<T> {
    private Object[] array;
    private int size;
    private int capacity;
    private Stack(){
        this(10);
    }
    public Stack(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void push(T element) throws StackFullException {
        if (size  == this.array.length) throw new StackFullException("Stack is full.");
        this.array[size++] = element;
    }

    public T pop() throws StackEmptyException {
        if (size == 0){ throw new StackEmptyException("Stack is empty.");}
        T t = (T) this.array[--size];
        return t;
    }
    public T peek() throws StackEmptyException {
        if (size == 0){ throw new StackEmptyException("Stack is empty.");}
        return (T) this.array[size -1];
    }
}
