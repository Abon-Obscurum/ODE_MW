package ode05.networking.udp;

import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(4711);
            while (true){
                byte[] buf = new byte[20];
                //DatagramSocket packet = new DatagramPacket();
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }

    }
}

