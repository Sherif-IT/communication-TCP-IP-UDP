import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress; 
 
/**
 * @author User
 *
 */
public class ClientTCP {

	public static void main(String[] args) throws IOException {
		
		Socket c= new Socket();

	    SocketAddress remote = new InetSocketAddress("localhost", 8080);
		c.connect( remote,8080 );

		BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
		System.out.println(in.readLine());
		
		c.close();
	}
 

}
