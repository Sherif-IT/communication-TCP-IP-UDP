import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
/**
 * @author Sherif Assan Ndiaye
 * le serveur ecoute un message de facon permanente
 */
public class Serveur {
	
	
	private static String data;
	
	
	
public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(1234);
        byte[] buffer = new byte[64];
        DatagramPacket packet = new DatagramPacket(buffer, 64);
        int i=3;
       do {
        	 socket.receive(packet);
             data=new String(packet.getData());
            System.out.println(data+" "+packet.getAddress());
            //
            socket.send(packet); 
        } while (i!=5);
       
 
        	
                  
        
    }

}
