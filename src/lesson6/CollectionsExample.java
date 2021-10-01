package lesson6;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println("Elements count: " + list.size());
        System.out.println("Second element: " + list.get(1));
        System.out.println("Element 1 is present: " + list.contains(1));
        System.out.println("Element 5 is present: " + list.contains(5));
        list.remove(2);
        System.out.println(list);
        list.set(0, 5); // list[0] = 5;
        System.out.println(list);

        LinkedList<Integer> linkedList = new LinkedList<>();

        int n = 100000;
        list.clear();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Array init time: " + (finish - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("List init time: " + (finish - start));

        int k = 10000;
        for (int i = 0; i < k; i++) {
            list.set(n / 2, i * i);
        }
        System.out.println("Array time: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            linkedList.set(n / 2, i * i);
        }
        finish = System.currentTimeMillis();
        System.out.println("List time: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            list.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Array remove first element time: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            linkedList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("List remove first element time: " + (finish - start));
    }
}
