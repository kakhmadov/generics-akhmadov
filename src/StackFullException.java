public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message);
    }
    public StackFullException() {super("Stack is full.");}
}
