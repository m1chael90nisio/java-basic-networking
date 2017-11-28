import java.util.Scanner;
import java.io.*;
import java.net.*;

 
class PingIP{
		
		static String ipAddress;
	
  public static void sendPingRequest()
		
			{
				try{
				System.out.println("Give an adress to Ping");
				Scanner scan= new Scanner(System.in);
				ipAddress= scan.nextLine();
				InetAddress adr = InetAddress.getByName(ipAddress);
				System.out.println("Sending Ping Request to " + ipAddress);
					if (adr.isReachable(5000))  
					  System.out.println("Host is reachable");
					else
					  System.out.println("Sorry ! We can't reach to this host");
						}
						
								catch (UnknownHostException e) {        
										System.out.println("UnknownHostException");
										
							} 	catch (IOException e) {
										System.out.println("IOException");
										
							}
						
					
				}
  
  
			}