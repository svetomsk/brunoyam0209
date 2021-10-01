package lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
//        firstTask();
//        int [] sorted = secondTask(new int[]{1, 3, 4}, new int[]{2, 3, 5});
//        System.out.println(Arrays.toString(sorted));
//        thirdTask("abaaabbcc");
        fourthTask(new int[]{1, 3, 10, 12});
    }

    public static void fourthTask(int [] mas) {
        Arrays.sort(mas);
        if (mas.length % 2 == 0) {
            System.out.println(mas[mas.length / 2 - 1]);
        } else {
            System.out.println(mas[mas.length / 2]);
        }
    }

    public static void thirdTaskv1(String input) {
        char [] symbols = input.toCharArray();
        Arrays.sort(symbols);
        // count symbols
    }

    public static void thirdTask(String input) {
        int [] counter = new int[70000];
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            counter[currentSymbol]++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.println((char) i + " " + counter[i]);
            }
        }
    }

    public static int [] secondTask(int [] a, int [] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int firstIndex = 0;
        int secondIndex = 0;
        int [] result = new int[a.length + b.length];
        int pos = 0;
        while (firstIndex < a.length && secondIndex < b.length) {
            if (a[firstIndex] < b[secondIndex]) {
                result[pos] = a[firstIndex];
                firstIndex++;
            } else {
                result[pos] = b[secondIndex];
                secondIndex++;
            }
            pos++;
        }
        for (int i = firstIndex; i < a.length; i++) {
            result[pos] = a[firstIndex];
            pos++;
        }
        for (int i = secondIndex; i < b.length; i++) {
            result[pos] = b[secondIndex];
            pos++;
        }
        return result;
    }

    public static void firstTask() {
        int[] mas = {1, 2, 1, 3, 2, 4};
        boolean check = true;
        for (int i = 0; i < mas.length - 1; i++) {
            if (i % 2 == 0) {
                if (mas[i] >= mas[i + 1]) {
                    check = false;
                    break;
                }
            } else {
                if (mas[i] <= mas[i + 1]) {
                    check = false;
                    break;
                }
            }
        }
        System.out.println("Rule check result: " + check);
    }
}
