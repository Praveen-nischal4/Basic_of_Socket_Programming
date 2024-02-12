package Basic;
import java.io.*;
import java.net.*;

public class Address {

	public static void main(String[] args) throws IOException {
   
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter website name");
		String site = br.readLine();
		
		try
		{
			InetAddress ip = InetAddress.getByName(site);
			System.out.println("Site ="+site);
			System.out.println("IP Address of Site"+ip);
		}catch(UnknownHostException e)
		{
			e.printStackTrace();
		}

	}

}
