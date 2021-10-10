package lesson8.tictactoe;

import java.util.Arrays;

import static lesson8.tictactoe.Cell.*;

public class Field {
    private int size;
    private Cell [][] field;

    public Field() {
        size = 3;
        field = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            Arrays.fill(field[i], EMPTY);
        }
    }

    public boolean isEmpty(int row, int column) {
        return field[row][column] == EMPTY;
    }

    public void showField() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (field[i][j]) {
                    case EMPTY:
                        System.out.print("_ ");
                        break;
                    case CROSS:
                        System.out.print("X ");
                        break;
                    case ZERO:
                        System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public Cell checkWinner() {
        for (int i = 0; i < field.length; i++) {
            // совпадение элементов в строке
            if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && !field[i][2].equals(EMPTY)) {
                return field[i][0];
            }
            // совпадение элементов в столбце
            if (field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && !field[2][i].equals(EMPTY)) {
                return field[0][i];
            }
        }
        if (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && !field[2][2].equals(EMPTY)) {
            return field[0][0];
        }
        if (field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && !field[2][0].equals(EMPTY)) {
            return field[1][1];
        }
        return EMPTY;
    }

    public boolean setValue(int row, int column, Cell playerSign) {
        if (isEmpty(row, column)) {
            field[row][column] = playerSign;
            return true;
        }
        return false;
    }
}
