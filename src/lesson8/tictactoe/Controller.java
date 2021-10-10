package lesson8.tictactoe;

import java.awt.*;

public class Controller {
    public void startGame() {
        Player cross = new Player(Cell.CROSS);
        Player zero = new Player(Cell.ZERO);
        Field field = new Field();

        Player currentPlayer = cross;

        while(true) {
            field.showField();
            Point coords = currentPlayer.turn();
            if (!field.setValue(coords.x, coords.y, currentPlayer.getTeam())) {
                System.out.println("Try again");
                continue;
            }
            Cell maybeWinner = field.checkWinner();
            if (maybeWinner != Cell.EMPTY) {
                System.out.println(maybeWinner.name() + " wins");
                field.showField();
                break;
            }
            if (currentPlayer == cross) {
                currentPlayer = zero;
            } else {
                currentPlayer = cross;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Controller ctrl = new Controller();
        ctrl.startGame();
    }
}
