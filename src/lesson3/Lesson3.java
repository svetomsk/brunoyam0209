public class Lesson3 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int mul = 1;
        n = 10;
        for (int i = 1; i < n; i++) {
            mul *= i; // mul = mul * i
        }
        System.out.println(mul);

        n = 2;
        int k = 10;
        int pow = 1;
        for (int i = 0; i < k; i++) {
            pow = pow * n;
        }
        System.out.println(pow);

        String input = "abcbab";
        boolean isPalindrom = true;
        for (int i = 0; i < input.length() / 2; i++) {
            int symIndex = input.length() - 1 - i;
            if (input.charAt(i) != input.charAt(symIndex)) {
                isPalindrom = false;
                break;
            }
        }

        System.out.println(isPalindrom);
    }
}
