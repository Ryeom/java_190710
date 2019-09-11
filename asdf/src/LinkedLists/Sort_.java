package LinkedLists;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sort_ {
	public static void main(String[] args) {
		LinkedList<Integer> listInteger = new LinkedList<>();
		System.out.println(1+"미정렬 링크드 리스트");//출력되는 결과가 이러하다 라고 암시적으로 보여줌 숫자를 통해

		for (int i = 0; i < 50; i++) {
			int input = (int) (Math.random() * 100) % 100;
			//System.out.println(String.format("%d", input));
			listInteger.add(input);
			//System.out.println(listInteger);

		}System.out.println(listInteger);
		listInteger.sort(null);
		
		
		System.out.println(listInteger);
		
		for (Integer item : listInteger) {//특정위치부터특정위치까지 이렇게는 사용하지 못한다.
			System.out.println(item);
		}	System.out.println(); //이런식으로 포이치에 붙여서 쓴당
		
		System.out.println("-----------------------------");//세퍼레이터기법
		
		//머리로 이렇게 나올것이다하면서 짜는 것을 하지말라
		//무조건 값이 나오는지 안나오는지 출력을 해 보고 할 것
		//전체적인 시간을 봤을때 업무시간이 단축 된다.
		
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
