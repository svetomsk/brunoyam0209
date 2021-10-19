package lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExample {

    static class LocationNotFoundException extends RuntimeException {
        private String locationName;

        public LocationNotFoundException(String locationName) {
            super();
            this.locationName = locationName;
        }

        @Override
        public String getMessage() {
            return "Location " + locationName + " is not found in database";
        }
    }

    public static void main(String[] args) {
        calc();
        throw new LocationNotFoundException("Omsk");
    }

    static void calc() {
        try {
            divide();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception object: " + exc);
            System.out.println("Exception message: " + exc.getMessage());
        }


        Scanner sc = null;
        try {
            sc = new Scanner(new File("input.txt"));
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException exc){
            System.out.println(exc.getMessage());
            if (sc != null)
                sc.close();
        }
    }

    static void divide() {
        int [] a = new int[1];
        System.out.println(a[-1]);
    }
}
