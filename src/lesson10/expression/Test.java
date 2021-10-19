package lesson10.expression;

public class Test {
    public static void main(String[] args) {
        Executable number2 = new Number(2);
        Executable number5 = new Number(5);
        Executable number4 = new Number(4);
        Executable plus = new Operation('$', number2, number5);
        Executable minus = new Operation('-', plus, number4);

        System.out.println(minus.execute());
    }
}
