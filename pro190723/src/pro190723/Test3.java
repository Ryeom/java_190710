package pro190723;

import java.util.LinkedList;

public class Test3 {
	public static void main(String[] args) {
		LinkedList<A> a1 = new LinkedList<A>();
		LinkedList<A> a2 = new LinkedList<A>();
		LinkedList<A> a3 = new LinkedList<A>();
		a1.add(new A());
		a1.add(new A());
		
		
		
		
		
		//< >컨테이너라고 부른다
		LinkedList<LinkedList<A>> a4 = new LinkedList<LinkedList<A>>();
		a4.add(a1);
		a4.add(a2);
		a4.add(a3);
		
		for (LinkedList<A> item1 : a4) {
			for (A item2 : item1) {
				
			}
		}
		
		
	}
}
class A{
	
}