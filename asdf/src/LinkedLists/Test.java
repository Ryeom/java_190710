package LinkedLists;

import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {// 수업
	public static void main(String[] args) {
		LinkedList<Apple> list = new LinkedList<Apple>();
		System.out.println(list.size());
		
		list.add(new Apple(1,"one"));
		Apple apple = new Apple(2, "two");
		
		list.add(apple);
		for (Apple item : list) {
			//System.out.println(item);
			//System.out.println(item.getN()+"/"+item.getS());
			item.ouput();
		}
		System.out.println("--------------");
		for (int i = 0; i < 5; i++) {
			list.add(new Apple(i*10+20,"hihi"+i));
		}
		
		for (Apple item : list) {
			//System.out.println(item);
			//System.out.println(item.getN()+"/"+item.getS());
			item.ouput();
		}
		System.out.println("--------------");
		list.get(2).ouput();	//3번째 인덱스를 출력하쎄오
		list.get(3).ouput();
		System.out.println("--------------");
		
		list.get(2).setN(2);
		list.get(2).setS("hello");
		list.get(2).ouput();
		list.set(3, new Apple(5, "tttt"));
		list.get(3).ouput();
		System.out.println("--------------");

		for (Apple item : list) {
			item.ouput();
		}
		System.out.println("--------------");

		list.remove();//첫번재 인덱스 삭제됨
		list.remove(4);//4번째 인덱스 삭제됨
		for (Apple item : list) {
			item.ouput();
		}
		System.out.println("--------------");
		
		//랜덤한숫자를 넣어서 해라
		for (int i = 0; i < 10; i++) {
			list.add(new Apple((int)((Math.random()*100)%100),"hihi"+i));
		}
		System.out.println();
		for (Apple item : list) {
			item.ouput();
		}
		System.out.println("--------------");
		
		Iterator<Apple> iter = list.iterator();
		
		while(iter.hasNext()) {
			Apple temp = (Apple)iter.next();
			if(temp.getN()%2==0) {
				//list.remove(iter.next());
				iter.remove();//그 인덱스에 해당하는거 지워버렷!
				
			}
			
		}
		System.out.println("--------------");
		
		for (Apple item : list) {
			item.ouput();
		}
		/*
		 * Collections.sort(list,new Comparator<Apple>() {
		 * 
		 * @Override public int compare(Apple o1, Apple o2) {
		 * 
		 * for(int i=0;i<list.size();++i) {
		 * 
		 * } return Collator.getInstance().compare(temp1.getN(),temp2.getN()); }
		 * 
		 * });
		 */
		//정렬하기
		/*
		 * while(iter.hasNext()) { Apple temp1 = (Apple)iter.next(); Apple temp2 =
		 * (Apple)iter.next();
		 * 
		 * 
		 * }
		 */
		
		//list.sort(null);
		
		for (int i = 0; i < list.size(); i++) {
			//list.get(i).getN()
			
		}
		
		
		
		
		
		System.out.println("--------------");
		
		for (Apple item : list) {
			item.ouput();
		}
		
		System.out.println("--------------");
		
		
		
	}
}

class Apple implements Comparator<Apple>{
	int n;
	String s;

	public Apple(int n,String s) {
		this.n=n;
		this.s=s;
	}

	void sort() {
		
		
	}
	
	void ouput() {	//crud -> read
		System.out.println(n + "/" + s);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	@Override
	public int compare(Apple first,Apple second) {
		int firstValue = first.getN();
		int secondValue = second.getN();
		
		if(firstValue>secondValue) {
			return -1;
		}else if(firstValue<secondValue) {
			return 1;
		}else {
			return 0;
		}
			
		
		
	}

}