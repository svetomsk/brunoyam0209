package lesson12.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    private ServerSocket server;
    private int port;

    public void startServer(int port) throws IOException {
        this.port = port;
        server = new ServerSocket(port);
        server.setReuseAddress(true);
    }

    public void communicate() throws IOException, InterruptedException {
        Socket clientConnection = server.accept();
        InputThread input = new InputThread(clientConnection.getInputStream());
        OutputThread out = new OutputThread(clientConnection.getOutputStream());
        input.start();
        out.start();

        input.join();

        clientConnection.close();
    }

//    public void echo() throws IOException {
//        Socket clientConnection = server.accept();
//
//        Scanner input = new Scanner(clientConnection.getInputStream());
//        String message = input.nextLine();
//        System.out.println("Message from client: " + message);
//
//        DataOutputStream out = new DataOutputStream(clientConnection.getOutputStream());
//        out.write(message.getBytes(Charset.forName("UTF-8")));
//
//        input.close();
//        out.close();
//        clientConnection.close();
//    }

    public void stopServer() throws IOException {
        server.close();
    }
}
