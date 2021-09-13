import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int [] array = new int[5];
        System.out.println(array[0]);

        array[1] = 2;
        array[2] = 3;
        System.out.println(Arrays.toString(array));

        array[3] = array[1] + array[2];
        System.out.println(Arrays.toString(array));

        System.out.println("Length: " + array.length);

        for (int i = 0; i < array.length; i++) {
            int currentItem = array[i];
            System.out.println(currentItem);
        }
    }
}
