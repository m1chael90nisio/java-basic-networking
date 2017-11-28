import java.util.Scanner; 
import java.io.*;
import java.net.*;



class Menu{
	static String it;	
	public static void main(String[] args) {
		int choice;
		Help help=new Help();
		help.helper();
		
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
	
		switch (choice) {
			case 1:
			System.out.println("Ping an adress");
			PingIP pingip=new PingIP();			
			pingip.sendPingRequest();
				// Perform "ping an adress" case.
				
				break;
			case 2:
			System.out.println("what's my IP??");
			GetIP getIp=new GetIP();
			getIp.myIp();
				// Perform "get my ip" case.
				break;
			case 3:
			System.out.println("what's my public IP");
			SystemIPAddress sysIP=new SystemIPAddress();
			sysIP.systemipaddress();
				// Perform "systemip adress(public ip)" case.
				break;
			case 4:
			System.out.println("Connect to a pc using telnet!");
				// Perform "telnet" case.
				break;
			default:
			
				// The user input an unexpected choice.
				break;
		}
		
	}

				}
				
				
	
