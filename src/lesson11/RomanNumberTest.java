package lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RomanNumberTest {
    @Test
    @DisplayName("Beautiful test name")
    public void testOne() {
        List<RomanNumber> number = Collections.singletonList(RomanNumber.ONE);
        int actual = RomanNumber.convertToArabic(number);
        Assertions.assertEquals(RomanNumber.ONE.getValue(), actual);
    }

    @Test
    public void testFive() {
        List<RomanNumber> number = Collections.singletonList(RomanNumber.FIVE);
        int actual = RomanNumber.convertToArabic(number);
        Assertions.assertEquals(RomanNumber.FIVE.getValue(), actual);
    }

    @Test
    public void testTen() {
        List<RomanNumber> number = Collections.singletonList(RomanNumber.TEN);
        int actual = RomanNumber.convertToArabic(number);
        Assertions.assertEquals(RomanNumber.TEN.getValue(), actual);
    }

    @Test
    public void testIncreasingRomanNumber() {
        List<RomanNumber> number = new ArrayList<>();
        number.add(RomanNumber.TEN);
        number.add(RomanNumber.TEN);
        number.add(RomanNumber.FIVE);
        number.add(RomanNumber.ONE);
        number.add(RomanNumber.ONE);

        int actual = RomanNumber.convertToArabic(number);
        Assertions.assertEquals(27, actual);
    }

    @Test
    public void testDecreasingRomanNumber() {
        List<RomanNumber> number = new ArrayList<>();
        number.add(RomanNumber.ONE);
        number.add(RomanNumber.TEN);
        int actual = RomanNumber.convertToArabic(number);
        Assertions.assertEquals(9, actual);
    }
}
