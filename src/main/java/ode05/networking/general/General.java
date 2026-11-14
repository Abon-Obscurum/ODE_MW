package ode05.networking.fx.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class General {

    public static void main(String[] args) {
        String name = "https://www.technikum-wien.at";
        try {
            URL url = URI.create(name).toURL();
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            URLConnection urlConnection = url.openConnection();
            if (urlConnection instanceof HttpURLConnection) {
                HttpURLConnection con = (HttpURLConnection) urlConnection;
                con.setDoInput(true);
                con.setRequestMethod("GET");
                con.connect();

                InputStreamReader in = new InputStreamReader(url.openStream());
                BufferedReader reader = new BufferedReader(in);
                System.out.println("Daten von: " + name);

                String value = null;
                while ((value = reader.readLine()) != null) {
                    System.out.println(value);
                }
                reader.close(); // also closes in
            }
        } catch (MalformedURLException | IllegalArgumentException e) {
            System.out.println("Invalid URL: " + name);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void nameToIp() {
        String name = "www.technikum-wien.at"; // hostname only, no protocol
        System.out.println("Host: " + name);

        try {
            InetAddress address = InetAddress.getByName(name);
            System.out.println("IP Address: " + address.getHostAddress());

            byte[] ip = address.getAddress();
            InetAddress inet2 = InetAddress.getByAddress(ip);
            System.out.println("Name: " + inet2.getHostName()); // reverse lookup
        } catch (UnknownHostException e) {
            System.out.println("Host with name " + name + " not found");
        }
    }
}