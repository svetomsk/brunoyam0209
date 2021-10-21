package lesson12.network;

import java.io.IOException;

public class ClientRunner {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClientApp clientApp = new ClientApp();
        clientApp.communicate(8883);
    }
}
