public class Main {
    public static void main(String[] args) {
        try{
            Stack<Integer> numberStack = new Stack<>(5);
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Number Stack: " + numberStack.list());
            System.out.println("Popped number: " + numberStack.pop());
            System.out.println("Number Stack: " + numberStack.list());

            Stack<String> textStack = new Stack<>();
            textStack.push("Apple");
            textStack.push("Orange");
            textStack.push("Kiwi");
            System.out.println("String Stack: " + textStack.list());
            System.out.println("Popped string: " + textStack.peek());
            System.out.println("String Stack: " + textStack.list());



        }catch (StackEmptyException | StackFullException e){
            e.printStackTrace();
        }

    }
}