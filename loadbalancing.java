import java.net.*;
import java.io.*;
public class loadbalancing{
                  public static void main(String[]args)throws IOException{
                  ServerSocket s1=new ServerSocket(1234);
                  while(true){
                             Socket connectionsocket=s1.accept();
                             BufferedReader messagefromclient=new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
                             String clientsentence=messagefromclient.readLine();

                             if(clientsentence.contains("lili")){
                             Socket server=new Socket("192.168.163.130",2347);
                             DataOutputStream outtoserver=new DataOutputStream(server.getOutputStream());
                             outtoserver.writeBytes(clientsentence+"\n");
                             server.close();
                             }

                             else if(clientsentence.contains("rose")){
                             Socket server2=new Socket("192.168.163.129",2348);
                             DataOutputStream outtoserver2=new DataOutputStream(server2.getOutputStream());
                             outtoserver2.writeBytes(clientsentence+"\n");
                             server2.close();
                             }
             
                             else{System.out.println("ERROR");}
                               }
                  }
}
