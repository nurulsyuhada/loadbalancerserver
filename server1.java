import java.io.*;
import java.net.*;

class server
{
public static void main(String argv[]) throws Exception
  {
   String clientSentence;
   String capitalizedSentence;
   ServerSocket welcomeSocket = new ServerSocket (6789);
   while(true)
   {
    Socket connectionSocket = welcomeSocket.accept();
    BufferedReader inFromClient = new BufferedReader(newInputStreamReader(connection.Socket.getInputStream()));
    DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
    clientSentence = inFromClient.readLine();
    System.out.println("Client's Text:" + clientSentence);
    capitalizedSentence = clientSentence.toUpperCase()+ '\n';
    outToClient.writeBytes(capitalizedSentence);
    }
    }
}