public class HW2 {
    public static void main(String[] args) {
        // #1
        int value = 123;
        if (value % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // #2
        int a = 30;
        int b = 5;
        int c = 10;
        // число a является средним, если b < a < c или c < a < b
        if ((b < a && a < c) || (a < b && a > c)) {
            System.out.println(a);
        } else if ((b < c && c < a) || (b > c && c > a)) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }

        // #3
        // аналогично второй задаче

        // #4
        int x = -10;
        int y = 0;
        if (x > 0) {
            if (y > 0) {
                System.out.println("I");
            } else { // y <= 0
                System.out.println("IV");
            }
        } else { // x < 0
            if (y > 0) {
                System.out.println("II");
            } else {
                System.out.println("III");
            }
        }

        // #5
        a = 3;
        b = 4;
        c = 6;
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
