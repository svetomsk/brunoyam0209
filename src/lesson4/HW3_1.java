import java.util.Arrays;
import java.util.Random;

public class HW3_1 {
    public static void main(String[] args) {
        int [] array = {10, 9, 8, 7, 5, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (current > 0) {
                System.out.print(current + " ");
            }
        }
        System.out.println();

        int positiveNumbers = 0;
        for (int value : array) {
            if (value > 0) {
                positiveNumbers++;
            }
        }
        System.out.println("Positive numbers: " + positiveNumbers);

        boolean res = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "Yes" : "No");

        int length = 1000000;
        array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt();
        }
        int n = array.length;


        long start = System.currentTimeMillis();
        Arrays.sort(array);
        long finish = System.currentTimeMillis();
        System.out.println("Quick sort time: " + (finish - start));


        start = System.currentTimeMillis();
//        int [] array = {2, 3, 2, 1};
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        finish = System.currentTimeMillis();
        System.out.println("Time: " + (finish - start));
    }
}
