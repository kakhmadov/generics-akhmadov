
public class Main {
    public static void main(String[] args) {
        Integer[] l1 = {1,2,3,4};
        GenericUtils.reverse(l1);
        for(Integer i: l1)  {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(GenericUtils.sum(l1));
    }
}
