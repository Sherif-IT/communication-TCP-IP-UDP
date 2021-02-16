/**
 * 
 */
package TCPAvancee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author User
 *
 */
public class ServeurTCPAvance {

	public static void main(String[] args) throws IOException {
		
		int i=0;
		while (i<2) {
			try {
				ServerSocket  s= new ServerSocket(8080);
				Socket clientSocket = s.accept();
				//BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				 
				String in;
				while ( (in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()) ).readLine()) != null )  {
					if ("fin".equals(in)) {
						 System.out.println("communication end");
			            break;
			         }
					 System.out.println(in);
					 clientSocket = s.accept();
	            }
			        s.close();
			        
			//}
				//if (clientSocket !=null) {
					
			} catch (IOException e) {
				e.printStackTrace();
			}
			i++;
		}
		
	}
}
