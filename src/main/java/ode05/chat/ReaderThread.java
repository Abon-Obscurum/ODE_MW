package ode05.chat;

import javafx.application.Platform;
import javafx.scene.control.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.SocketException;

// Background thread that reads server responses
public class ReaderThread extends Thread {
    // Shared reader from Connection (a second reader would lose buffered data)
    private final BufferedReader reader;
    // Target list in the GUI
    private final ListView<String> messageList;

    public ReaderThread(BufferedReader reader, ListView<String> messageList) {
        this.reader = reader;
        this.messageList = messageList;
        // Don't keep the app alive after the window closes
        setDaemon(true);
    }

    @Override
    public void run() {
        try {
            String line;
            // Read until the server closes the connection
            while ((line = reader.readLine()) != null) {
                // Lambda needs an effectively final variable
                String finalLine = line;
                // GUI updates only on the FX thread
                Platform.runLater(() -> messageList.getItems().add(finalLine));
            }
        } catch (SocketException e) {
            // Socket closed, normal on exit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
