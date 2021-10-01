package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        sayHello("Svetozar");
        int sum = sum(10, 15);
        System.out.println("Sum = " + sum);

        String [] parking = new String[10];
        Arrays.fill(parking, "X");
        System.out.println(Arrays.toString(parking));
        Scanner sc = new Scanner(System.in);
        while(true) {
            String command = sc.next();
            if (command.equalsIgnoreCase("show")) {
                System.out.println(Arrays.toString(parking));
            } else if (command.equalsIgnoreCase("park")) {
                String carNumber = sc.next();
                park(parking, carNumber);
            } else if (command.equalsIgnoreCase("leave")) {
                String carNumber = sc.next();
                leave(parking, carNumber);
            } else if (command.equalsIgnoreCase("free")) {
                System.out.println("Free: " + freePlaces(parking));
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Unknown command. Try again");
            }
        }
    }

    public static int freePlaces(String[] parking) {
        int cnt = 0;
        for(String element : parking) {
            if (element.equals("X")) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void leave(String[] parking, String carNumber) {
        for (int i = 0; i < parking.length; i++) {
            if (parking[i].equals(carNumber)) {
                parking[i] = "X";
                break;
            }
        }
        System.out.println(Arrays.toString(parking));
    }

    public static void park(String[] parking, String carNumber) {
        if (freePlaces(parking) == 0) {
            System.out.println("No empty places :(");
            return;
        }
        for (int i = 0; i < parking.length; i++) {
            if (parking[i].equals("X")) {
                parking[i] = carNumber;
                break;
            }
        }
        System.out.println(Arrays.toString(parking));
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static int sum(int a, int b) {
        return a + b;
    }


}
