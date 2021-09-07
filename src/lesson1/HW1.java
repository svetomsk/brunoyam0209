
public class HW1 {
    public static void main(String[] args) {
        // #1
        int a = 10;
        int b = 223;
        int c = 8423;

        int average = (a + b + c) / 3;
        System.out.println("Average: " + average);

        // #2
        double averageTemp = 29.8;
        double ratio = 0.96;
        double todayTemp = averageTemp * ratio;
        System.out.println("Today temperature: " + todayTemp);

        // #3
        String input = "1234567890";
        char firstSymbol = input.charAt(0);
        char lastSymbol = input.charAt(input.length() - 1);
        String middle = input.substring(1, input.length() - 1);
        String flippedInput = lastSymbol + middle + firstSymbol;
        System.out.println("Symbols flip result: " + flippedInput);

        // #4
        input = "Mistaake";
        int pos = input.length() - 1;
        String start = input.substring(0, pos);
        String end = input.substring(pos + 1);
        System.out.println("Modified string: " + start + end);
    }
}
