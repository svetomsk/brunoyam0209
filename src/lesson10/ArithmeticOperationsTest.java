package lesson10;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ArithmeticOperationsTest {
    private ArithmeticOperations test = new ArithmeticOperations();

    @Test
    public void testDivisionByZero() {
        Executable method = new Executable() {
            @Override
            public void execute() throws Throwable {
                test.divide(1, 0);
            }
        };
        Assertions.assertThrows(ArithmeticException.class, method);
    }

    @Test
    public void testExactDivision() {
        Assertions.assertEquals(3, test.divide(6, 2));
    }
}
