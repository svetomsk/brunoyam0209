package lesson11;

import java.util.List;

public enum RomanNumber {
    ONE(1),
    FIVE(5),
    TEN(10);

    private int value;

    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int convertToArabic(List<RomanNumber> romans) {
        int sum = 0;
        for (int i = 0; i < romans.size() - 1; i++) {
            int currentNumber = romans.get(i).getValue();
            if (currentNumber < romans.get(i + 1).getValue()) {
                sum -= currentNumber;
            } else {
                sum += currentNumber;
            }
        }
        sum += romans.get(romans.size() - 1).getValue();
        return sum;
    }
}
