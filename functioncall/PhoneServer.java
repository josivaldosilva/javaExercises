package functioncall;

import java.net.Socket;
import java.io.IOException;

public class PhoneServer {
  public static void main(String[] args) throws IOEXception {
    ServerSocket serverSocket = new ServerSocket(4000);
    Socket socket = serverSocket.accept();
    SSystem.out.println("Cliente conectou");

    inputStreamReader inputReader = new inputStreamReader(socket.getInputStream());
    BufferedReader reader = new BufferedReader(inputReader);
    String sms;
    while((sms = reader.readLine()) != null){
      SSystem.out.println("Server message: " + sms);
    }
  }
}
