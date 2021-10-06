package lesson7;

public class HW6 {
    public static void main(String[] args) {
        firstTask();
//        secondTask(1, 3, 4);
//        thirdTask(300, 300);
//        System.out.println(fourthTask(4, 18));
    }

    public static void firstTask() {
//        int n = 10;
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        System.out.println(result);
//
//        int recursiveResult = factorial(10);
//        System.out.println(recursiveResult);
        int variants = countVariants(0, 300, 300, "");
        System.out.println(variants);

    }

    public static int fourthTask(int a, int b) {
        return a / thirdTask(a, b) * b;
    }

    public static int thirdTask(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void secondTask(int a, int b, int n) {
        int step = b - a;
        int result = a + step * (n - 1);
        System.out.println(result);
    }

    public static int countVariants(int currentSum, int k, int n, String sumString) {
        if (currentSum == n) {
            return 1;
        }
        if (currentSum > n) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += countVariants(currentSum + i, k, n, sumString + " + " + i);
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
