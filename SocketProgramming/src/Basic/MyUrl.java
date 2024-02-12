package Basic;
import java.net.*;

public class MyUrl {

	public static void main(String[] args) throws MalformedURLException {
       
		URL obj = new URL("https://dreamtechpress.com/index.html");
		System.out.println(obj.getProtocol());
		System.out.println(obj.getFile());
		System.out.println(obj.getDefaultPort());
		System.out.println(obj.getPath());
		System.out.println(obj.getPort());

	}

}
