package lesson13.steamAPI;

import java.util.function.*;

public class LambdasExample {
    public static void main(String[] args) throws InterruptedException {
        Thread sampleThread = new Thread(
                () -> {
                    System.out.println("Thread action");
                    System.out.println("End of thread action");
                }
        );

        sampleThread.start();
        sampleThread.join();
        if (sampleThread.getState() == Thread.State.TERMINATED) {
            System.out.println("Terminated");
        }

        Consumer<Integer> doublePrinter = integer -> {
            integer *= 2;
            System.out.println("Doubled value: " + integer);
        };
        doublePrinter.accept(14);

        BiConsumer<Integer, Integer> pow = (a, b) -> System.out.println("Pow: " + Math.pow(a, b));
        pow.accept(2, 10);

        Supplier<String> namePrinter = () -> "Hello, Svetozar";
        namePrinter.get();

        Function<String, Integer> countUpperCaseLetters = inputString -> {
            int count = 0;
            for (char c : inputString.toCharArray()) {
                if (Character.isUpperCase(c)) count++;
            }
            return count;
        };

        Predicate<String> isPalindrom = inputString -> {
            return true;
        };

        System.out.println("Upper case symbols: " + countUpperCaseLetters.apply("Hello, My Friend"));
    }
}
