package LinkedLists;

import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		//LinkedList<int> li = new LinkedList()<>();
		//����Ʈ�� ���׸����� ��ü�� ���� �ִ�.
		
		LinkedList<String> li = new LinkedList<>();
		
		li.add("�ű���");
		System.out.println(li);
		
		li.add("������");
		li.add("������");
		li.add("������");
		System.out.println(li);
		
		li.removeFirstOccurrence("������");//���� ó�� ���� �ε����� ��ġ���� �����
		System.out.println(li);
		
		
		li.clear();
		System.out.println(li);
		//System.out.println(li.pop());//pop�ҰԾ�� ����
		System.out.println(li.poll());
		
		if(li.size()!=0) {
			li.pop();
		}
		String str = li.poll();
		if(str !=null) {}
		System.out.println();
		
		LinkedList<String> li2 = new LinkedList<>();
		li.add("�ű���");
		li.add("������");
		li.add("������");
		li.add("������");
		LinkedList<String> li3 = new LinkedList<>();
		li.add("�ű���");
		li.add("������");
		System.out.println(li2.containsAll(li3));//��� �κ������� ����������
		
		
		//exam 7
		//��� 3����
		LinkedList<Integer> liIn1 = new LinkedList<>();
		liIn1.add(1);
		liIn1.add(2);
		liIn1.add(3);
		LinkedList<String> liIn2 = new LinkedList<>();
		liIn2.add("data");
		liIn2.add("data");
		liIn2.add("data");
		
		for(int i = 0 ; i<liIn1.size();i++) {
			System.out.println(liIn1.get(i)+" ");
			
		}
		
		for(int i = 0 ; i<liIn2.size();i++) {
			System.out.println(liIn2.get(i)+" ");
		}
		
		//iterator�� ����Ͽ� �˻��ؼ� ����ϴ� ���� ����.
		
		
		//exam8
		
		
		
		
		
		
	}
}
