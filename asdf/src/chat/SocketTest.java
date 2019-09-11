package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class SocketRead33 extends Thread {
   DataInputStream in;
   InputStream is;
   Socket socket;
   int count;
   byte[] buffer;
   String msg;

   SocketRead33(Socket socket) {
      this.socket = socket;
      try {
         is = socket.getInputStream();
         in = new DataInputStream(is);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public void run() {
      
         // =============================
      while(in != null) {
         try {
            count = is.available();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         buffer = new byte[count];
         if(count > 0) {
         for (int i = 0; i < count; i++) {
            // in.read(buffer);
            try {
               buffer[i] = in.readByte();
               
               msg = new String(buffer, "UTF-8");
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
         System.out.println("[�� :"+ socket.getLocalSocketAddress() + "] : "+msg+"�κ���");
         }
         
         // ============================= �޼��� ����.
      }
   }
   }

class SocketRead2 extends Thread {

   DataOutputStream out;
   Socket socket;
   Scanner sc; // ���ֽἭ �ϴ� ���椡���� �ع���

   SocketRead2(Socket socket) {
      sc = new Scanner(System.in);
      this.socket = socket;

   }

   public void run() {
      try {
         String msg = "";

         byte[] b;
         int count;
         String str;

         // =============================

         out = new DataOutputStream(socket.getOutputStream());

         // SocketRead2 sr = new SocketRead2();

         out.write(("name" + (int) (Math.random() * 5)).getBytes()); // ������ �̸�
         out.flush();
         // ============================= ù ���� ó��.

         // sleep�����ִ� ������ ������ ������ ������ ó���� �ð��� ���� �����ع����� �׷���
         // ������ ó���ؼ� ������ �ֱ⵵ ���� ���� ���� ������ ������ �׷���

         while (out != null) {
            Thread.sleep(100);
            // =============================
            //System.out.print("[Send msg] : ");

            str = sc.nextLine();
            //str += socket.getLocalSocketAddress();//���� ���ǿ� ��Ʈ ����
            b = str.getBytes("UTF-8");
            out.write(b);
            out.flush();
            // ============================= �޼��� ����.
            Thread.sleep(100);
            

         }

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

public class SocketTest {
   
   public static void main(String[] args) throws UnknownHostException, IOException {
      SocketRead2 sr2 = new SocketRead2(MakeSocket());
      SocketRead33 sr3 = new SocketRead33(MakeSocket());
      sr3.start();
      sr2.start();

   }
   
   private final static Socket MakeSocket() throws UnknownHostException, IOException {
      
      String ip = "127.0.0.1";
      Socket socket;
      int port = 2222;
      socket = new Socket(ip, port);
      return socket;
      
   }
}

