package LinkedLists;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {
   public static void main(String[] args) throws InterruptedException {
      LinkedList<Integer> link1 = new LinkedList<Integer>();
      LinkedList<Integer> link2 = new LinkedList<Integer>();
      LinkedList<Integer> link3 = new LinkedList<Integer>();
      LinkedList<Integer> link4 = new LinkedList<Integer>();
      LinkedList<Integer> link5 = new LinkedList<Integer>();
      
      for(int i = 0 ; i < 10 ; i++) {
         link1.add(i*10);
      }
      
      // LinkedList�� ����ϸ� List�� ����Ǿ� �ִ� ��� ����Ÿ�� ��µ�
 //     System.out.println("link1 print : " + link1);
      // size() �Լ��� List�� ������ �ִ� ���� ��, ũ�⸦ ��ȯ����
//      System.out.println("link1 size : " + link1.size());
      // link1 List�� link List ��Ҹ� ��� �����ؼ� ����
      link2.addAll(link1);
//      System.out.println("link2 print : " + link1);
      
      for(int i = 0 ; i < 5 ; i++)
         link3.add(i);
      
      // link3.addAll()�� ���ϴ� ��ġ ���� link2�� �����ؼ� �߰��Ѵ�.
      link3.addAll(3, link2);
      // link3 ���� ó���� �߰�
      link3.addFirst(100);
      // link3 ���� �������� �߰�
      link3.addLast(1000);
//      System.out.println("link3 print : " + link3);
      
      link4.addAll(link1);
//      System.out.println("link4 print : " + link4);
      // link4 list�� �ִ� ��� �����͸� ����
      link4.clear();
  //    System.out.println("link4 print : " + link4);
    //  System.out.println("--------------------");
      link4.addAll(link1);
      //System.out.println("link4 print : " + link4);
      
      link4.clone();   // �̰� ����?
      link4.contains(link2); //�̰��� ����?
      
      // link4.element()�� ���� ó�� ��ȯ -> ��Ȯ�ϰ� ���� ������ �ϴ��� �˾ƺ���
      //System.out.println("link4 print : " + link4.element());
      // link4.equals(link3) -> link3�� link4�� �����Ͱ� ���ٸ� true �ٸ��� false
      //System.out.println("link4 print : " + link4.equals(link5));
      // link4�� 5��° �ִ� ��Ҹ� ��ȯ
      //System.out.println("link4 print : " + link4.get(5));
      // link4�� ������� true, ������� ������ false
      //System.out.println("link4 print : " + link4.isEmpty());
      //link4�� 5��° ��Ҹ� ������
      
      //System.out.println("--------------------");
      link4.remove(5);
      //System.out.println("link4 print : " + link4);
      // �׳� remove()�� ����ϸ� �� ó���� �ִ� �����͸� ������
      link4.remove();
    //  System.out.println("link4 print : " + link4);
      // link4�� �ִ� ��� ������ ����
      link4.removeAll(link4);
    // System.out.println("link4 print : " + link4);

      //System.out.println("--------------------");
      link4.addAll(link1);
      // link4�� ù��° ��� ����
      link4.removeFirst();
      //System.out.println("link4 print : " + link4);
      
      link4.removeFirstOccurrence(link1); //����?
      // link4�� ������ ��� ����      
      link4.removeLast();
      //System.out.println("link4 print : " + link4);
      // link4�� 2��° ��Ҹ� 50���� �����Ѵ�.
      link4.set(2, 50);
      //System.out.println("link4 print : " + link4);
      // link3�� ������������ �����Ѵ�.
     // System.out.println("--------------------");
      
      link3.sort(null);
      System.out.println("link3 print : " + link3);
      // link4�� �ִ� ��ҿ� link3�� �ߺ��Ǵ� ��ҵ鸸 ����Ѵ�. �ߺ�����
      link3.retainAll(link4);
      System.out.println("link4 print : " + link4);
      System.out.println("link3 print : " + link3);
      // �Ǿ� ��ҿ� 20 ����, push
      link4.push(20);
      System.out.println("link4 print : " + link4);
      
      
      System.out.println("--------------------");
      
      // �� �� ��� ����, pop
      link4.pop();
      System.out.println("link4 print : " + link4);
      // link3 �� ��ҵ� ���
      System.out.println(link3.toString());
      System.out.println("link3 print : " + link3);
      // link3�� ��� �� 2���� 4���� �����ؼ� ���(��, 0����5���� ���);
      System.out.println(link3.subList(0, 6));
      System.out.println("link3 print : " + link3);
      // link3�� ù ��� ������
      System.out.println(link3.peek());
      System.out.println("link3 print : " + link3);
      
      System.out.println("--------------------");
      // link3�� ù ��� ������, ����Ʈ�� ��������� null ��ȯ
      System.out.println(link3.peekFirst());
      System.out.println("link3 print : " + link3);
      // link3�� ù ��Ҹ� ���� �� �� ������
      System.out.println(link3.poll());
      System.out.println("link3 print : " + link3);
      // link3�� ù ��Ҹ� ���� �� �� ������, ����Ʈ ��������� null ��ȯ
      System.out.println(link3.pollFirst());
      System.out.println("link3 print : " + link3);
      
      System.out.println("--------------------");
      // link3�� ������ ��Ҹ� ���� �� �� ������, ����Ʈ ��������� null ��ȯ
      System.out.println(link3.pollLast());
      System.out.println("link3 print : " + link3);
      // link3 �� �������� ��� �߰�
      link3.offer(100);
      System.out.println("link3 print : " + link3);
      // link3 �� �������� ��� �߰�
      link3.offerLast(500);
      System.out.println("link3 print : " + link3);
      // link3 �� �տ� ��� �߰�
      link3.offerFirst(200);
      System.out.println("link3 print : " + link3);
   }
}