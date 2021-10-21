package lesson12.network;

import java.io.IOException;
import java.net.Socket;

public class ClientApp {
    public void communicate(int port) throws IOException, InterruptedException {
        Socket connection = new Socket("localhost", port);
        InputThread input = new InputThread(connection.getInputStream());
        OutputThread out = new OutputThread(connection.getOutputStream());
        input.start();
        out.start();

        input.join();
//        String message = "Hello, I'm client app";
//        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
//        out.writeBytes(message + "\n");
//
//        Scanner input = new Scanner(connection.getInputStream());
//        String serverMessage = input.nextLine();
//
//        System.out.println("Message from server: " + serverMessage);
//
//        out.close();
//        input.close();
        connection.close();
    }
}
