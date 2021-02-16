import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 
 */

/**
 * @author Sherif Assan Ndiaye
 * le client envoie un paquet et attend une reponse du serveur ,qu'il affiche
 */
public class Client {

	/**
	 * @throws IOException 
	 */
	



	public static void main(String[] args) throws IOException {
	        DatagramSocket socket =
	                new DatagramSocket();
	       
	       
	        String message = "Bonjour invité !";
	        DatagramPacket packetSent =  new DatagramPacket(
	                        message.getBytes(),
	                        message.length(),
	                        InetAddress.getLocalHost(), 
	                        1234);
	        socket.send(packetSent);    
	        
	       
	        byte[] buffer = new byte[64];
	        DatagramPacket packetR = new DatagramPacket(buffer, 64);
	        socket.receive(packetR);
	        
	       
	        System.out.println("message: "+new String(packetR.getData())+" "+packetR.getAddress());
	       
	    }



}
