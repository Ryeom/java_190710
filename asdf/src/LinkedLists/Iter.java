package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iter {

	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("hello");
		list.add("19022");
		list.add("min");
		list.add("gysre");
		list.add("hhihi");
		
		
		System.out.println("before :");
		System.out.println(list);
		System.out.println("---------");
		System.out.println(list.indexOf("hello"));//�ε��� ��ȣ ���
		System.out.println(list.lastIndexOf("min"));//������ �ε���
		System.out.println(list.indexOf("bye"));//������ -1
		System.out.println("------------ to array");
		
		
		String[] arr =  list.toArray(new String[list.size()]);
		
		for (String item : arr) {
			System.out.println(item);
		}
		
		
		
		
		
		
		
		
		System.out.println("------------");
		//���࿡ �����̳� ���� �������� �ڵ尡 �ִٸ� �ٸ� ���� ����Ű�� ���� ���ɼ��� ������ �� ��.
		ListIterator<String> list_it = list.listIterator(2);
		while(list_it.hasNext()) {		
			System.out.println(list_it.next()+" ");
		}System.out.println();
		
		while(list_it.hasPrevious()) {
			System.out.println(list_it.previous());
		}System.out.println();
		
		Iterator x = list.descendingIterator();
		while(x.hasNext()) {
			System.out.println(x.next()+" ");
		}System.out.println();
	}
}
