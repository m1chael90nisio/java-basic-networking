import java.net.InetAddress;

import java.util.GregorianCalendar;

import java.net.URI;
import java.net.URISyntaxException;
 
public class PingRRT {
 
  public static void main(String[] args) {
 
    try {
		 URI uri = new URI("www.google.com");
		int x=uri.getPort();
		System.out.print("give an adress to Ping");
		System.in();
      String ipAddress ="www.google.com";
      InetAddress inet = InetAddress.getByName(ipAddress);
	  //GetPort port = GetPort(x);
 
      System.out.println("Sending Ping Request to " + 	ipAddress);
 
      long finish = 0;
      long start = new GregorianCalendar().getTimeInMillis();
 
      if (inet.isReachable(5000)){
        finish = new GregorianCalendar().getTimeInMillis();
        System.out.println("Ping RTT: " + (finish - start + "ms") +"EEEEp" + x	);
      } else {
        System.out.println(ipAddress + " NOT reachable.");
      }
    } catch ( Exception e ) {
      System.out.println("Exception:" + e.getMessage());
    }
  }
}