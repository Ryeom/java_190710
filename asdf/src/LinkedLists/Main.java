package LinkedLists;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static void func01(AbstractList ablist) {
		
		
	}
	public static void main(String[] args) {
		AbstractList<Object> llist1 = new LinkedList<>();
		LinkedList<Object> llist2 = new LinkedList<>();
		ArrayList<Object> llist3 = new ArrayList<Object>();
		
		func01(llist1);
		func01(llist2);
		func01(llist3);
		//함수안에 어떤 collection을 주더라도 처리를 해 먹겠다.
		
		llist1.add("1");
		llist1.add("2");
		llist1.add("3");
		
		System.out.println(llist1);
		
		//ArrayList<Object> arr1 = new ArrayList(llist1);
		ArrayList<Object> arr2 = new ArrayList(llist2);
		
		//Queue<Object> q =Queue(llist1);
	}
}
