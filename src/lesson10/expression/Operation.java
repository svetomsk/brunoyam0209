package lesson10.expression;

public class Operation implements Executable {
    private char operation;
    private Executable a;
    private Executable b;

    public Operation(char operation, Executable a, Executable b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    @Override
    public double execute() {
        System.out.println("Enter " + operation);
        double left = a.execute();
        double right = b.execute();
        System.out.println("Exit " + operation);
        if (operation == '+') return left + right;
        if (operation == '-') return left - right;
        if (operation == '*') return left * right;
        if (operation == '/') return left / right;
        if (operation == '%') return left % right;
        if (operation == 'g') return gcd(left, right);
        throw new IllegalArgumentException("Unknown command :(");
    }

    public double gcd(double a, double b) {
        return 1;
    }
}
