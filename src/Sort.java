import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        Integer array[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));

    }
}
