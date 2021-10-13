package lesson8.tictactoe;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

abstract class Player {
    private Cell team;

    public Player(Cell team) {
        this.team = team;
    }

    public Cell getTeam() {
        return team;
    }

    public abstract Point turn(Field field);
}

public class HumanPlayer extends Player {

    public HumanPlayer(Cell team) {
        super(team);
    }

    @Override
    public Point turn(Field field) {
        field.showField();
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        return new Point(row, column);
    }
}

class ComputerPlayer extends Player {

    public ComputerPlayer(Cell team) {
        super(team);
    }

    @Override
    public Point turn(Field field) {
        field.showField();
        Random rnd = new Random();
        int result = rnd.nextInt(9);
        int row = result / 3;
        int column = result % 3;
        return new Point(row, column);
    }
}
