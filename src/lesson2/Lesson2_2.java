import java.util.Random;

public class Lesson2_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = 10000;
        long sum = 0;
        // fori + Tab
        for (int i = 0; i < n; i++) {
            sum = sum + rnd.nextInt();
        }
//        System.out.println(sum);
        long average = sum / n;
        System.out.println(average);
        // 35232020
        // -38970927
        // 12065727
    }
}
