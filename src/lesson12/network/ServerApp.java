package lesson12.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
    private ServerSocket server;
    private int port;

    public void startServer(int port) throws IOException {
        this.port = port;
        server = new ServerSocket(port);
        server.setReuseAddress(true);
    }

    public void echo() throws IOException {
        Socket clientConnection = server.accept();

        Scanner input = new Scanner(clientConnection.getInputStream());
        String message = input.nextLine();
        System.out.println("Message from client: " + message);
        input.close();

        DataOutputStream out = new DataOutputStream(clientConnection.getOutputStream());
        out.writeBytes(message + "\n");
        out.close();

        clientConnection.close();
    }

    public void stopServer() throws IOException {
        server.close();
    }
}
