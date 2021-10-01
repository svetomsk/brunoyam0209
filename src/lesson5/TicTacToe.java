package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // инициализация
        String [][] field = new String[3][3];
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], "_");
        }
        String currentPlayer = "X";
        Scanner sc = new Scanner(System.in);
        showField(field);

        while(true) {
            // считываем ход
            int row = sc.nextInt();
            int column = sc.nextInt();

            // проверяем, что ячейка свободна
            if (field[row][column].equals("_")) { // да
                field[row][column] = currentPlayer;
            } else {
                System.out.println("Ячейка занята. Попробуйте снова");
                continue;
            }
            String maybeWinner = checkWinner(field);
            if (!maybeWinner.equals("_")) {
                System.out.println("Победили " + maybeWinner);
                showField(field);
                break;
            }

            if (currentPlayer.equals("X")) {
                currentPlayer = "0";
            } else {
                currentPlayer = "X";
            }
            showField(field);
        }
    }

    public static String checkWinner(String [][] field) {
        for (int i = 0; i < field.length; i++) {
            // совпадение элементов в строке
            if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && !field[i][2].equals("_")) {
                return field[i][0];
            }
            // совпадение элементов в столбце
            if (field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && !field[2][i].equals("_")) {
                return field[0][i];
            }
        }
        if (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && !field[2][2].equals("_")) {
            return field[0][0];
        }
        if (field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && !field[2][0].equals("_")) {
            return field[1][1];
        }
        return "_";
    }

    public static void showField(String [][] field) {
        for (int i = 0; i < field.length; i++) { // строки
            for (int j = 0; j < field[i].length; j++) { // столбцы
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
