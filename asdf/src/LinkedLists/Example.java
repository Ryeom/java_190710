package LinkedLists;

import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		//LinkedList<int> li = new LinkedList()<>();
		//리스트의 제네릭에는 객체만 들어갈수 있다.
		
		LinkedList<String> li = new LinkedList<>();
		
		li.add("신기한");
		System.out.println(li);
		
		li.add("하정훈");
		li.add("최은우");
		li.add("하정훈");
		System.out.println(li);
		
		li.removeFirstOccurrence("하정훈");//제일 처음 만난 인덱스의 일치값을 지운다
		System.out.println(li);
		
		
		li.clear();
		System.out.println(li);
		//System.out.println(li.pop());//pop할게없어서 에러
		System.out.println(li.poll());
		
		if(li.size()!=0) {
			li.pop();
		}
		String str = li.poll();
		if(str !=null) {}
		System.out.println();
		
		LinkedList<String> li2 = new LinkedList<>();
		li.add("신기한");
		li.add("하정훈");
		li.add("최은우");
		li.add("하정훈");
		LinkedList<String> li3 = new LinkedList<>();
		li.add("신기한");
		li.add("하정훈");
		System.out.println(li2.containsAll(li3));//모든 부분집합이 속해있을시
		
		
		//exam 7
		//출력 3가지
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
		
		//iterator를 사용하여 검색해서 출력하는 것이 좋다.
		
		
		//exam8
		
		
		
		
		
		
	}
}
