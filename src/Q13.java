import java.net.*;

class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket s = new DatagramSocket();
        byte[] b = "Hello".getBytes();
        DatagramPacket p = new DatagramPacket(b, b.length,
                InetAddress.getByName("localhost"), 5000);
        s.send(p);
    }
}
