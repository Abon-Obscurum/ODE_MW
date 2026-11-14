package ode05.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// One shared connection for all views of the client
public class Connection {
    private static Socket socket;
    private static PrintWriter out;
    private static BufferedReader in;

    public static void connect() throws IOException {
        // Connect only once
        if (socket != null) {
            return;
        }
        socket = new Socket("localhost", 4711);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    // Send a line and wait for the server's answer
    public static String request(String line) throws IOException {
        out.println(line);
        return in.readLine();
    }

    // Send without waiting (chat, answer comes via ReaderThread)
    public static void send(String line) {
        out.println(line);
    }

    public static BufferedReader getIn() {
        return in;
    }
}
