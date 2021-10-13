package lesson9;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class InterfaceExample {
    public static void main(String[] args) {
        Element a = new Element();
        Element b = new Element();
        if (a.equals(b)) {
            System.out.println("Равны");
        } else {
            System.out.println("Неравны");
        }

        if (a.compareTo(b) > 0) {
            System.out.println("a больше, чем b");
        }

        List<Moveable> objects = new LinkedList<>();
        objects.add(new Ball());
        objects.add(new Square());

        for (Moveable obj : objects) {
            obj.rotate();
        }
    }
}

interface Moveable {
    void move();
    void rotate();
    void spin();
}

class Ball implements Moveable {

    @Override
    public void move() {
        System.out.println("Ball moved");
    }

    @Override
    public void rotate() {
        System.out.println("Ball rotated");
    }

    @Override
    public void spin() {
        System.out.println("Ball spinned");
    }
}

class Square implements Moveable {

    @Override
    public void move() {
        System.out.println("Square moved");
    }

    @Override
    public void rotate() {
        System.out.println("Square rotated");
    }

    @Override
    public void spin() {
        System.out.println("Square spinned");
    }
}

class Element implements Comparable<Element>, Serializable {
    int value;
    @Override
    public int compareTo(Element o) {
         if (value > o.value) return 1;
         else return -1;
    }
}
