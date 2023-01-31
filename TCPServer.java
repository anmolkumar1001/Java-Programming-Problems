import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPServer {
	public final static int SOCKET_PORT = 13267;
	public final static String FILE_TO_SEND = "E:\\abc.txt";

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		OutputStream os = null;
		ServerSocket servsock = null;
		Socket sock = null;
		try
		{
			servsock = new ServerSocket(SOCKET_PORT);
			while(true)
			{
				System.out.println("Waiting...");
				try
				{
					sock = servsock.accept();
					System.out.println("Accepted Connection: " + sock);
					File myfile = new File(FILE_TO_SEND);
					byte[] mybytearray = new byte[(int) myfile.length()];
					fis = new FileInputStream(myfile);
					bis = new BufferedInputStream(fis);
					bis.read(mybytearray, 0, mybytearray.length);
					os = sock.getOutputStream();
					System.out.println("Sending " + FILE_TO_SEND + "(" + mybytearray.length + "bytes)");
					os.write(mybytearray, 0, mybytearray.length);
					os.flush();
					System.out.println("Done.");
				}
				finally
				{
					if(bis != null) bis.close();
					if(os != null) os.close();
					if(fis != null) fis.close();
				}
			}
		}
		finally
		{
			if(servsock != null) servsock.close();
		}

	}

}
