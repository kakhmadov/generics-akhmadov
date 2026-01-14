public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String message)  {super(message);}
    public StackEmptyException()    {super("The stack is empty.");}
}
