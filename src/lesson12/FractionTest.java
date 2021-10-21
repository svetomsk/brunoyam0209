package lesson12;

import org.junit.jupiter.api.*;

public class FractionTest {
    @Test
    @Order(2)
    public void simplifyTest() {
        Fraction value = new Fraction(45, 10);
        Fraction actual = value.simplify();
        Fraction expected = new Fraction(9, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Order(1)
    public void plusOperationTest() {
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(3, 5);
        Fraction actual = first.plus(second);
        Fraction expected = new Fraction(11, 10);
        Assertions.assertEquals(expected, actual);
    }
}
