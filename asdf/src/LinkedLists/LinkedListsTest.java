package LinkedLists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListsTest {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<>();

		/*
		 * for (int i = 0; i < 10; ++i) { li.add("data"+i); } System.out.println(li);
		 * System.out.println(li.contains("data")); System.out.println(li.element());
		 */

		// pollLast()
		li.add("one");
		li.add("two");
		li.add("three");
		System.out.println(li.size());

		Iterator it = li.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

		li.pollLast();

		li.iterator();

		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

		li.clear();// ´ÙÁö¿ì±ë

		LinkedList<Object> mylist = new LinkedList<Object>();
		mylist.add("±æ¶Ë");
		mylist.add(199029334);
		mylist.add(2, "2±â");
		mylist.add('a');

		// iterator»ç¿ë

		LinkedList<String> name1 = new LinkedList<String>();
		name1.add("one");
		name1.add("two");
		name1.add("three");
		LinkedList<String> name2 = new LinkedList<String>();
		name2.add("one");
		name2.add("two");
		name2.add("three");
		LinkedList<String> name3 = new LinkedList<String>();
		name3.add("one");
		name3.add("two");
		System.out.println("--------------------");
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1 == name2);

		System.out.println(name1.get(2));

		mylist.set(1, "number"); // ¼öÁ¤

		System.out.println(mylist);
		mylist.remove();
		System.out.println(mylist);// Ã¹¹øÂ°ÀÎµ¦½º°¡ »ç¶óÁü

		mylist.remove(2);// 2¹øÂ° ÀÎµ¦½º°¡ »ç¶óÁü
		System.out.println(mylist);
		System.out.println("-----");

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list2.add(6);
		list2.add(3);
		list2.add(2);
		list2.add(8);

		System.out.println(list2);
		list2.sort(null);

		System.out.println(list2);

		Collections.sort(list2);

		LinkedList<People> plist = new LinkedList<People>();

		plist.add(new People(23, 155));
		plist.add(new People(21, 176));
		plist.add(new People(27, 185));
		plist.add(new People(20, 165));

		plist.sort(null);

		for (People item : plist) {
			System.out.println(item);
		}
	}

}

class People {
	int age;
	int height;

	public People(int age, int height) {
		this.age = age;
		this.height = height;
	}

	public int compareTo(People p,People pp) {
		if(p.age<pp.age) {return -1;}
		else if(p.age==pp.age){return 0;	}
		else {return 1;}
	}
}