import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int a = -239;
        int b = 23;
        System.out.println(a > b);
        if (a >= b) {
            System.out.println("Maximum in a");
        }

        if (a < b) {
            System.out.println("Maximum in b");
        }

        if (a >= b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }


        // создать Scanner
        Scanner sc = new Scanner(System.in);

        // считываем два числа и операцию
        int first = sc.nextInt();
        String operation = sc.next();
        int second = sc.nextInt();

        // operation == "+"
        if (operation.equals("+")) {
            System.out.println("Сумма: " + (first + second));
        } else if (operation.equals("-")) {
            System.out.println("Разность: " + (first - second));
        } else if (operation.equals("*")) {
            System.out.println("Произведение: " + (first * second));
        }
    }
}
