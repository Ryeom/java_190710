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
		System.out.println(list.indexOf("hello"));//인덱스 번호 출력
		System.out.println(list.lastIndexOf("min"));//마지막 인데긋
		System.out.println(list.indexOf("bye"));//없으면 -1
		System.out.println("------------ to array");
		
		
		String[] arr =  list.toArray(new String[list.size()]);
		
		for (String item : arr) {
			System.out.println(item);
		}
		
		
		
		
		
		
		
		
		System.out.println("------------");
		//만약에 삽입이나 삭제 가들어오는 코드가 있다면 다른 것을 가리키고 있을 가능성을 염두해 둘 것.
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
