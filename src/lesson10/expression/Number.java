package lesson10.expression;

public class Number implements Executable {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double execute() {
        System.out.println("Enter " + value);
        double result = value;
        System.out.println("Exit " + value);
        return result;
    }
}
