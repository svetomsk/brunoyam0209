package lesson8.tictactoe;

import java.awt.*;
import java.util.Scanner;

public class Player {
    private Cell team;

    public Player(Cell team) {
        this.team = team;
    }

    public Point turn() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        return new Point(row, column);
    }

    public Cell getTeam() {
        return team;
    }
}
