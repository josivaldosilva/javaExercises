package functioncall;

import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

public class PhoneClient {
  public static void main(String[] args) throws IOException{
    Socket socket = new Socket("Localhost", 4000);
    Scanner scanner = new Scanner(System.in);

    PrintStream pSOut = new PrintStream(socket.getOutputStream());
    String message = scanner.nextLine();
    pSOut.println(message);
  }
}
