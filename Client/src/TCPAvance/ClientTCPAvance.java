/**
 * 
 */
package TCPAvance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
* @author User
*
*/
public class ClientTCPAvance {

	public static void main(String[] args) throws IOException {
		String rep ="c";
		Socket c;
		do {
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			System.out.println("veuillez entrer le message a envoyer");
			
			try {
				rep= br.readLine();
			} catch (IOException e) {
				// On fait rien c'est pas grave.
			}
			c= new Socket();

		    SocketAddress remote = new InetSocketAddress("localhost", 8080);
			c.connect( remote,8080 );
			PrintWriter out = new PrintWriter(c.getOutputStream(),true );
			out.println(rep);
		}while (rep!="fin");
		
		c.close();
			
		}
		//BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
		//System.out.println(in.readLine());
		
		
	
}


