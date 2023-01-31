import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UDPServer {

	public static void main(String[] args) {
		DatagramSocket skt = null;
		Scanner sc = new Scanner(System.in);
		try
		{
			skt = new DatagramSocket(7889);
			byte[] buffer = new byte[1000];
			
			while(true)
			{
				DatagramPacket request = new DatagramPacket(buffer,buffer.length);
				skt.receive(request);
				
				String[] msg = (new String(request.getData())).split("");
				System.out.println("Enter message: ");
				String msg1 = sc.nextLine();
				byte[] sendMsg = (msg1 + " server processed").getBytes();
				DatagramPacket reply = new DatagramPacket(sendMsg, sendMsg.length, request.getAddress(), request.getPort());
				skt.send(reply);
			}
		}
		catch(Exception ex) { }
	}
}
