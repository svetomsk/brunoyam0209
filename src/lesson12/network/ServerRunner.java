package lesson12.network;

import java.io.IOException;

public class ServerRunner {
    public static void main(String[] args) throws IOException {
        ServerApp server = new ServerApp();
        server.startServer(8883);
        server.stopServer();
    }
}
