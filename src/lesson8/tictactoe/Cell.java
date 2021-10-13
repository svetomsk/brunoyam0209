package lesson8.tictactoe;

public enum Cell {
    EMPTY('_', "Пустота"),
    CROSS('X', "Крестик"),
    ZERO('0', "Нолик");

    private char sign;
    private String name;

    Cell(char sign, String name) {
        this.sign = sign;
        this.name = name;
    }

    public char getSign() {
        return sign;
    }

    public String getName() {
        return name;
    }
}
