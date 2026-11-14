package ode05.networking.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 4711);
            InputStream in = clientSocket.getInputStream();
            byte[] buffer = new byte[15];

            int bytesRead = in.read(buffer);
            System.out.println(bytesRead);
            String message = new String(buffer);

            System.out.println(message);

        }catch (IOException e){
            System.out.println("Server at localhost 4722 not estaablishehs");
        }

    }
}
