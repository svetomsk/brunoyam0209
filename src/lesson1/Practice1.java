import java.util.Scanner;

public class Practice1 {
    // psvm
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println(firstName + " " + lastName);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(first + second);

        System.out.println("!" + scanner.nextLine() + "!");
    }
}
