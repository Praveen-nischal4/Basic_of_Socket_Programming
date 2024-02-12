package Basic;
import java.net.*;
import java.io.*;


public class SendData {

	public static void main(String[] args) throws IOException {
	
		ServerSocket ss = new ServerSocket(8090);
		Socket s = ss.accept();
		
		System.out.println("Connection Established");
		
		OutputStream obj = s.getOutputStream();
		PrintStream p = new PrintStream(obj);
		String str ="Hello ! How are you ?";
		p.println(str);
		p.println("Bye");
		p.close();
		s.close();
		ss.close();

	}

}
