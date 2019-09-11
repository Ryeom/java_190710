package LinkedLists;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sort_ {
	public static void main(String[] args) {
		LinkedList<Integer> listInteger = new LinkedList<>();
		System.out.println(1+"������ ��ũ�� ����Ʈ");//��µǴ� ����� �̷��ϴ� ��� �Ͻ������� ������ ���ڸ� ����

		for (int i = 0; i < 50; i++) {
			int input = (int) (Math.random() * 100) % 100;
			//System.out.println(String.format("%d", input));
			listInteger.add(input);
			//System.out.println(listInteger);

		}System.out.println(listInteger);
		listInteger.sort(null);
		
		
		System.out.println(listInteger);
		
		for (Integer item : listInteger) {//Ư����ġ����Ư����ġ���� �̷��Դ� ������� ���Ѵ�.
			System.out.println(item);
		}	System.out.println(); //�̷������� ����ġ�� �ٿ��� ����
		
		System.out.println("-----------------------------");//���۷����ͱ��
		
		//�Ӹ��� �̷��� ���ð��̴��ϸ鼭 ¥�� ���� ��������
		//������ ���� �������� �ȳ������� ����� �� ���� �� ��
		//��ü���� �ð��� ������ �����ð��� ���� �ȴ�.
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addAll(listInteger);
		Stack<Integer> stack = new Stack<>();		
		
		while(list.size()>0) {
			int first = list.removeFirst();
			stack.push(first);
			System.out.println(first+" ");
		}System.out.println();
		
		
		System.out.println(4+"stack pop");
		
		while(stack.size()>0) {
			System.out.println(stack.pop());
			
		}
		
		/*
		 * for (Integer item : stack) { System.out.println(item); }
		 */
		
		System.out.println("queue");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		while(list.size()>0) {
			int last = list.removeLast();
			list.offer(last);
			System.out.println(last+" ");
		}System.out.println();
		
		System.out.println("queue poll");
		
		while (queue.size()>0) {
			System.err.println(queue.poll());
		}System.out.println();
		
		
	}
}
