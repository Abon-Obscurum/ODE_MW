package ode08;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import ode05.chat.Server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.security.Provider;

public class DownloadService extends Service<String> {
    private final StringProperty url = new SimpleStringProperty();

    public final String getUrl() {
        return url.get();
    }

    public final void setUrl(String value) {
        url.set(value);
    }

    @Override
    protected Task<String> createTask() {
        final String _url = getUrl();

        return new Task<>() {
            @Override
            protected String call() throws Exception {
                System.out.println("call(), Thread: " + Thread.currentThread().getName());
                Thread.sleep(3000);
                InputStream stream = URI.create(_url).toURL().openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null){
                    sb.append(line).append("\n");
                }
                return sb.toString();
            }
        };
    }
}
