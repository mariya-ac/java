import java.io.*;
import java.net.*;
import java.util.*;
public class UDPClient
{
  DatagramSocket ds;
  DatagramPacket dp,dp1;
  byte[] sendPacket;
  byte[] receivePacket;
  BufferedReader in;
  InetAddress ip;
  int Port;
  String str;
  UDPClient()
  {
   try
   {
     in=new BufferedReader(new InputStreamReader(System.in));
     ip=InetAddress.getByName("localhost");
     ds=new DatagramSocket();
     while(true)
     {
      sendPacket=new byte[100];
      receivePacket=new byte[100];
      dp=new DatagramPacket(receivePacket,receivePacket.length);
      System.out.print("Client:");
      str=in.readLine();
      sendPacket=str.getBytes();
      dp1=new DatagramPacket(sendPacket,sendPacket.length,ip,1456);
      ds.send(dp1);
      if(str.equals("exit"))
           System.exit(0);
      ds.receive(dp);
      String data=new String(dp.getData());
      System.out.println("Server:"+data);
      }
    }catch(Exception e){}
  }
public static void main(String args[])
{
   UDPClient s=new UDPClient();
}
}