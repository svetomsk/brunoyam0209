public class Practice2 {
    public static void main(String[] args) {
        // # 1 проверить, что одно число делится на второе без остатка
        int first = 2;
        int second = 2;
        if (first % second == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }

        // # 2 найти максимум из трех чисел
        int third = 1;
        if (first >= second && first >= third) {
            System.out.println("First: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("Second: " + second);
        } else {
            System.out.println("Third: " + third);
        }
    }
}
