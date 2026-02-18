/**
 * @author Khasu Akhmadov
 * @version 2026-02-10
 */
public class GenericUtils {

    /**
     * Generic method to reverse an array
     * @param <T> generic type param
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Generic method to sum numeric arrays
     * @param array The array to calculate
     * @return returns the sum
     * @param <T> generic type param
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (T number : array) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] l1 = {1,2,3,4};
        reverse(l1);
        for(Integer i: l1)  {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(sum(l1));
    }
}