import java.util.Arrays;

public class GenericStack <T>{
    private T[] items;
    private int top;
    private int size;

    public GenericStack()   {
        this(10);
    }

    public GenericStack(int size)   {
        items = (T[]) new Object[0];
        this.size=size;
        this.top=-1;
    }

    public void push(T item) throws StackFullException {
        if(!(items.length+1>size)) {
            T[] temp = Arrays.copyOf(items, items.length + 1);
            temp[temp.length - 1] = item;
            top = temp.length - 1;
            items = temp;
        }else throw new StackFullException();
    }

    /**
     *
     * @return Returns the last item that was added to the stack
     */
    public T pop()   {
        if(items.length!=0) {
            T lastItem = items[items.length - 1];
            T[] temp = Arrays.copyOf(items, items.length - 1);
            top = temp.length - 1;
            items = temp;
            return lastItem;
        }else throw new StackEmptyException();
    }

    public T peek() {
        if(items.length!=0) return items[items.length-1];
        throw new StackEmptyException();
    }

    public String list()    {
        StringBuilder list= new StringBuilder();
        for(T i: items) {
            list.append(i);
        }return list.toString();
    }
}
