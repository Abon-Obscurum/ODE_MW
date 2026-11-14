package ode05.networking.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket( 4711);
            System.out.println("Server strated on port 4711 and is waiting for client connection");
            Socket client =  serverSocket.accept();
            System.out.println("connected to cliden" +  client.getInetAddress());

            OutputStream os = client.getOutputStream();
            String message = "Hello Client :(";

            os.write(message.getBytes());
            os.close();

        } catch (IOException e) {
            System.out.println("Server socket not starter on port 4711");
        }
    }
}
