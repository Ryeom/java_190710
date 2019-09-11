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
         System.out.println("[나 :"+ socket.getLocalSocketAddress() + "] : "+msg+"로부터");
         }
         
         // ============================= 메세지 받음.
      }
   }
   }

class SocketRead2 extends Thread {

   DataOutputStream out;
   Socket socket;
   Scanner sc; // 자주써서 일단 전경ㄱ으로 해버림

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

         out.write(("name" + (int) (Math.random() * 5)).getBytes()); // 접속자 이름
         out.flush();
         // ============================= 첫 접속 처리.

         // sleep시켜주는 이유는 데이터 보내고 서버가 처리할 시간도 없이 진행해버려서 그렇다
         // 서버가 처리해서 답장을 주기도 전에 밑의 것을 실행해 버려서 그렇다

         while (out != null) {
            Thread.sleep(100);
            // =============================
            //System.out.print("[Send msg] : ");

            str = sc.nextLine();
            //str += socket.getLocalSocketAddress();//소켓 아피와 포트 전송
            b = str.getBytes("UTF-8");
            out.write(b);
            out.flush();
            // ============================= 메세지 전송.
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

