import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try {
           InetAddress address= InetAddress.getLocalHost();
           DatagramSocket ds=new DatagramSocket();
           Scanner scanner=new Scanner(System.in);
           String s;
           do{
               s=scanner.nextLine();
               byte[] buffer=s.getBytes();
               DatagramPacket dp=new DatagramPacket(buffer,buffer.length,address,5000);
               ds.send(dp);
           }while (!s.equals("Exit"));
       }catch (Exception e){
           System.out.println(e);
       }
    }
}