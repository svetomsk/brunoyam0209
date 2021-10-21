package lesson12;

public class HW8 {
    public static void main(String[] args) {
        Fraction oneHalf = new Fraction(1, 2);
        Fraction quater = new Fraction(1, 4);
        Fraction one = new Fraction(1, 1);

//        Fraction staticResult = Fraction.sum(Fraction.sum(oneHalf, quater), one);
        Fraction memberResult = oneHalf.plus(quater).minus(one);
        System.out.println(memberResult.getA() + "/" + memberResult.getB());
    }
}

class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Fraction plus(Fraction argument) {
        int a = this.a * argument.b + argument.a * this.b;
        int b = this.b * argument.b;
        return new Fraction(a, b).simplify();
    }

    public Fraction minus(Fraction argument) {
        int a = this.a * argument.b - argument.a * this.b;
        int b = this.b * argument.b;
        return new Fraction(a, b).simplify();
    }

    public Fraction simplify() {
        int curA = Math.abs(a);
        int curB = Math.abs(b);
        while (curA > 0 && curB > 0) {
            if (curA > curB) curA -= curB;
            else curB -= curA;
        }
        int gcd = Math.max(curA, curB);
        return new Fraction(a / gcd, b / gcd);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction second = (Fraction) obj;
            return a == second.a && b == second.b;
        }
        return false;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}


