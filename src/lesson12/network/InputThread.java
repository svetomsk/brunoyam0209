package lesson12.network;

import java.io.InputStream;
import java.util.Scanner;

public class InputThread extends Thread {
    private Scanner input;

    public InputThread(InputStream inputStream) {
        input = new Scanner(inputStream);
    }

    @Override
    public void run() {
        while (true) {
            String message = input.nextLine();
            System.out.println(message);
        }
    }
}
