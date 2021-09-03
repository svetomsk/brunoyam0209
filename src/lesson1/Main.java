public class Main {
    // psvm
    // главный метод
    public static void main(String[] args) {
        // sout
        System.out.println("Hello, my beautiful world!");
        System.out.println("It's me");

        // создание и инициализация переменной
        int a = 5;
        int b = 7;
        int c;

        int sum = a + b + 123;
        int diff = b - a;
        int mult = b * a;
        int div = b / a;
        int mod = b % a;

        int r = a * (a + b) * b;
        System.out.println(sum);
        System.out.println("Деление: " + div + ", остаток: " + mod);

        // пример работы с дробными числами
        double price = 999.99;
        double discount = 0.9;
        double finalPrice = price * discount;
        System.out.println("Итоговая цена со скидкой = " + finalPrice);

        String name = "Svetozar";
        String textToPrint = "My name is " + name;
        System.out.println(textToPrint);
        int numberOfCharacters = textToPrint.length();
        System.out.println("Length of string = " + numberOfCharacters);
        char firstSymbol = name.charAt(0);
        System.out.println("First symbol: " + firstSymbol);
        char lastSymbol = name.charAt(name.length() - 1);
        System.out.println("Last symbol: " + lastSymbol);

        String substring = textToPrint.substring(4);
        System.out.println("From 5 symbol: " + substring);
        String substringV2 = textToPrint.substring(4, 8);
        System.out.println("From 4 to 8 symbol: " + substringV2);
    }
}

