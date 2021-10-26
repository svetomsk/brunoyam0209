package lesson12;

public class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Fraction plus(Fraction other) {
        return new Fraction(a * other.b + other.a * b, b * other.b).simplify();
    }

    public Fraction simplify() {
        int currentA = a;
        int currentB = b;
        while (currentA > 0 && currentB > 0) {
            if (currentA > currentB) currentA -= currentB;
            else currentB -= currentA;
        }
        int gcd = Math.max(currentA, currentB);
        return new Fraction(a / gcd, b / gcd);
    }
}
