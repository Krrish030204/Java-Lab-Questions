import java.net.*;

class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket s = new DatagramSocket(5000);
        byte[] b = new byte[100];
        DatagramPacket p = new DatagramPacket(b, b.length);
        s.receive(p);
        System.out.println(new String(b).trim());
    }
}
