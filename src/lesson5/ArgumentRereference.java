package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArgumentRereference {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
        updateArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void updateArray(int [] array) {
        array[0] = 12;
    }
}
