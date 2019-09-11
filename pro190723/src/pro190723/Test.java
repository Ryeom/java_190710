package pro190723;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) { // list sort 한번만 잘 익혀두면 좋앙
//		LinkedList<Card> list = new LinkedList<Card>(); // 숫자를 기준으로 정렬할거당
//
//		for (int i = 0; i < 5; i++) {
//			int temp = (int) (Math.random() * 100) + 1;
//			list.add(new Card(temp, i + "data"));
//		}
//
//		for (Card item : list) {
//			item.outPut();
//		}
//		// sort
//		// 원시코드 -> 최적화
//
//		// Example 1
//		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		Collections.sort(list,new Comparator<Card>() {	//정렬하고자하는 객체의 타입을 <>제네릭ㄱ//퀵정렬(제일빠름) 최적화된 인덱스를
//			@Override
//			public int compare(Card c1, Card c2) {	//정렬프로그램이 아니다 약간의 규칙만 정해줘라 
//				if(c1.n>c2.n) {		//역순하고싶으면 부등호방향을바꿔랑
//					 return +1;//양수의 대명사를 +1이라고 본다
//				}else {
//					return -1;//음수
//				}//-> 순차정렬
//				
//			}
//			
//		});
//		System.out.println("---------------");
//		for (Card item : list) {
//			item.outPut();
//		}
//
//		// Example 2
//		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		Collections.sort(list, new Comparator<Card>() { // 정렬하고자하는 객체의 타입을 <>제네릭ㄱ//퀵정렬(제일빠름) 최적화된 인덱스를
//			@Override
//			public int compare(Card c1, Card c2) {
//				return (c1.n > c2.n) ? +1 : -1;
//			}
//		});
//		System.out.println("---------------");
//		for (Card item : list) {
//			item.outPut();
//		}
//
//		// Example 3
//		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		Collections.sort(list, new Comparator<Card>() { // 정렬하고자하는 객체의 타입을 <>제네릭ㄱ//퀵정렬(제일빠름) 최적화된 인덱스를
//			@Override
//			public int compare(Card c1, Card c2) {
//				return c1.n - c2.n;// 순차 정렬//음수냐 양수냐를 뱉는 문제이기때문에 if else를 쓸 필요가 엄떵
//				// return c2.n - c1.n; //역순 정렬
//			}
//		});
//		System.out.println("---------------");
//		for (Card item : list) {
//			item.outPut();
//		}
//
//		// Example 4
//		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		Collections.sort(list, (c1, c2) -> {
//			return c2.n - c1.n;
//		});// 람다식 1차버전
//
//		System.out.println("---------------");
//		for (Card item : list) {
//			item.outPut();
//		}
//
//		// Example 5
//		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		Collections.sort(list, (c1, c2) -> c1.n - c2.n );// 람다식 2차버전
//
//		System.out.println("---------------");
//		for (Card item : list) {
//			item.outPut();
//		}
		//무조건 5번재 코드로 사용해야하느냐?
		//작동을 하지 않는 코드가 있다. -> int가 되어 있을때만 성립한다
		//float을 사용할 경우에는 1번 예제와 2번예제만 사용할수있다
		
		
		
		
		
		
		
		
		//정렬치고 까다로워
		//정렬의 기준을 살릴수있다? 
		//다르지만 논리는 같다
		//그래프 x축 y축에 점찍고 1을 기준으로 2~5점 에서 가장 짧은 가까운
		//n1과 n2를 곱햇을 때의 결과ㅑ에 대해 정렬하고싶다?
		
		LinkedList<Card> listxy = new LinkedList<Card>();
		
		listxy.add(new Card(5,6, "x"));
		listxy.add(new Card(7,1, "x"));
		listxy.add(new Card(9,20, "x"));
		listxy.add(new Card(2,16, "x"));
		listxy.add(new Card(2,8, "x"));
		Collections.sort(listxy,new Comparator<Card>() {
			@Override
			public int compare(Card c1, Card c2) {
				int r1 = c1.n1 * c1.n2;	//각기 곱함
				int r2 = c2.n1 * c2.n2;
				if(r1 > r2) {		//정렬의 기준이 달라져따
					 return +1;
				}else {
					return -1;
				}
			}
		});
		
		for (Card item : listxy) {
			item.outPut();
		}
		
//		클래스는 최소단위의 동작만 하도록 만드는 것이 좋다
//		가급적 상속을 사용하는데
//		기능이 필요하다고해서 메소드를 추가하거나 변형을 하게되면 좋지않다
		
		
		
		
		
	}

}

class Card {
	int n1,n2;
	String s;
	
	public Card(int n1,int n2, String s) {
		this.n1 = n1;
		this.n2 = n2;
		this.s = s;
	}
	public int getN() {
		return n1;
	}
	public void setN(int n1) {
		this.n1 = n1;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public void outPut() {
		System.out.println("> (" + this.n1 +" . "+ this.n2 + ")  : " +this.n1*this.n2 +" "+ this.s);
	}
}