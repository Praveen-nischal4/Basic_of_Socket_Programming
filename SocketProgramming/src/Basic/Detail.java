package Basic;
import java.io.*;
import java.net.*;
import java.util.*;

public class Detail {

	public static void main(String[] args) throws IOException {

 URL obj = new URL("https://in.search.yahoo.com/?fr2=inr");
  URLConnection conn = obj.openConnection();
  System.out.println("Date : "+new Date(conn.getDate()));
  System.out.println("Content-type : "+conn.getContentType());
  System.out.println("Expiration : "+conn.getExpiration());
  System.out.println("LAst Modified : "+ new Date(conn.getLastModified()));
int l =conn.getContentLength();
    System.out.println("LEngth of Content "+l);
    
    if(l==0)
    {
    	System.out.println("No content Length");
    	return;
    }else
    {
    	int ch;
    	InputStream in = conn.getInputStream();
    	while((ch=in.read())!=-1)
    	{
    		System.out.println((char)ch);
    	}
    }
	}

}
