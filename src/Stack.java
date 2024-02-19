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
}
