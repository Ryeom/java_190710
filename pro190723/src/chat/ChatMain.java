package chat;

import java.io.UnsupportedEncodingException;





import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Base64.Encoder;
import java.util.Scanner;

import org.omg.IOP.Encoding;


class SocketRead3 extends Thread{
   DataInputStream in;
   InputStream is;
   
   SocketRead3(Socket socket){
      try {
         is = socket.getInputStream();
         in = new DataInputStream(is);
      }catch(IOException e) {
         e.printStackTrace();
      }
      
   }   
   public void run() {
      try {
         System.out.println("���������");
         System.out.println(System.getProperty("file.encoding"));
         byte[] by;
         
         String str="";
         int count;
         while(in!=null) {
            count = in.available();
            if(count>0) {
               by = new byte[count];
               for(int i=0; i<count; i++) {
                  by[i] = in.readByte();
               }
               str = new String(by,"UTF-8");
               System.out.println(str);
            }            
         }         
         //System.out.println("������ ��");
      }catch(IOException e) {
         e.printStackTrace();
      }      
   }
   
}

public class ChatMain {

   public static void main(String[] args) {
      
      String ip = "127.0.0.1";
      int port =2222;
      Scanner sc;
      Socket socket;
      DataOutputStream out;
      byte[] name="test".getBytes();
      
      
      String str;
      try {
         socket = new Socket(ip, port);
         out = new DataOutputStream(socket.getOutputStream());
         SocketRead3 sr = new SocketRead3(socket);
         sr.start();
         out.write(("�ѱ�"+(int)(Math.random()*10)).getBytes("UTF-8")); //�����ڴг���
         out.flush();
         
         while(out!=null) {
            sc = new Scanner(System.in);
            str = sc.nextLine();
            
            byte[] b = str.getBytes("UTF-8");
            out.write(b);            
            out.flush();
            
         }
      }catch(IOException e) {
         e.printStackTrace();
      }finally {

      }
      
      
   }

}