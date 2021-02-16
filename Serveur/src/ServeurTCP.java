import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 
 */

/**
 * @author User
 *
 */
public class ServeurTCP {
	
	public static void main(String[] args) throws IOException {
		try {
			ServerSocket  s= new ServerSocket(8080);
			Socket clientSocket = s.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println(in.readLine());
			 clientSocket.close();
		        s.close();
		//}
			//if (clientSocket !=null) {
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

	/**
	 * 
	 */
	
		
     
	
	


