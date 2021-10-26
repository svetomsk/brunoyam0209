package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamsExample {
    public static void main(String[] args) {
        Random r = new Random();
        long distinctValue = r.ints(100, 0, 100)
                .map(value -> value % 10)
                .filter(value -> value > 5)
                .distinct()
                .count();
        System.out.println("Distinct value: " + distinctValue);

        List<String> names = new ArrayList<>();
        names.add("Svetozar");
        names.add("Ivan");

        long distinctSymbols = "Svetozar"
                .chars()
                .distinct()
                .count();
        System.out.println("Distinct letters count: " + distinctSymbols);

        distinctSymbols = names.stream()
                .map(String::toLowerCase)
                .flatMapToInt(CharSequence::chars)
                .distinct()
                .count();
        System.out.println("Distinct letters in list: " + distinctSymbols);
    }
}
