import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Main {
    public static void main(String[] args) {
     try {
         DatagramSocket ds=new DatagramSocket(5000);
         while (true){
             byte[] buffer=new byte[50];
             DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
             ds.receive(dp);
             System.out.println(new String(buffer,0,dp.getLength()));


          }
        } catch (Exception e){
         System.out.println(e);
     }
    }
}