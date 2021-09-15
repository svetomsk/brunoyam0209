import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        // #1
        int value = 1234;
        int sumOfDigits = 0;
        while (value > 0) {
            sumOfDigits += value % 10;
            value /= 10;
        }
        System.out.println(sumOfDigits);

        value = 1234;
        sumOfDigits = 0;
        for (; value > 0; value /= 10) {
            sumOfDigits += value % 10; // sumOfDigits = sumOfDigits + value % 10;
        }
        System.out.println(sumOfDigits);

        // #2
        Scanner sc = new Scanner(System.in);
        int current = 0;

        for(;;) {
            String numberString = sc.next();
            if (isExit(numberString)) {
//            if (numberString.equalsIgnoreCase("exit")) {
                break;
            }
            int number = Integer.valueOf(numberString);

            String operation = sc.next();
            if (isExit(operation)) {
//            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            switch (operation) {
                case "plus":
                case "+":
                    current += number;
                    break;
                case "minus":
                case "-":
                    current -= number;
                    break;
            }
            System.out.println("Current: " + current);
        }
    }

    public static boolean isExit(String input) {
        boolean result = input.equalsIgnoreCase("exit");

        return result;
    }
}
