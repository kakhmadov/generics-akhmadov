public class Test {
    public static void main(String[] args) {
        GenericStack<Integer> stack1= new GenericStack<>();
        stack1.push(5);
        stack1.push(2);
        stack1.push(1);
        stack1.push(2);
        stack1.push(6);
        stack1.push(7);
        stack1.push(4);
        stack1.push(3);
        stack1.push(6);
        stack1.push(3);
        //stack1.push(5);     //Causes StackFullException
        System.out.println("push, push, push...");
        System.out.println(stack1.peek());
        System.out.println(stack1.list());

        System.out.println("pop, pop");
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.list());
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.list());
        System.out.println("Stack is empty now.");
        //stack1.pop();     //Causes StackEmptyException
    }
}
