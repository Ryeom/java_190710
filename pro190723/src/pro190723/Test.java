package pro190723;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) { // list sort �ѹ��� �� �����θ� ����
//		LinkedList<Card> list = new LinkedList<Card>(); // ���ڸ� �������� �����ҰŴ�
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
//		// �����ڵ� -> ����ȭ
//
//		// Example 1
//		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		Collections.sort(list,new Comparator<Card>() {	//�����ϰ����ϴ� ��ü�� Ÿ���� <>���׸���//������(���Ϻ���) ����ȭ�� �ε�����
//			@Override
//			public int compare(Card c1, Card c2) {	//�������α׷��� �ƴϴ� �ణ�� ��Ģ�� ������� 
//				if(c1.n>c2.n) {		//�����ϰ������ �ε�ȣ�������ٲ��
//					 return +1;//����� ���縦 +1�̶�� ����
//				}else {
//					return -1;//����
//				}//-> ��������
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
//		Collections.sort(list, new Comparator<Card>() { // �����ϰ����ϴ� ��ü�� Ÿ���� <>���׸���//������(���Ϻ���) ����ȭ�� �ε�����
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
//		Collections.sort(list, new Comparator<Card>() { // �����ϰ����ϴ� ��ü�� Ÿ���� <>���׸���//������(���Ϻ���) ����ȭ�� �ε�����
//			@Override
//			public int compare(Card c1, Card c2) {
//				return c1.n - c2.n;// ���� ����//������ ����ĸ� ��� �����̱⶧���� if else�� �� �ʿ䰡 ����
//				// return c2.n - c1.n; //���� ����
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
//		});// ���ٽ� 1������
//
//		System.out.println("---------------");
//		for (Card item : list) {
//			item.outPut();
//		}
//
//		// Example 5
//		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		Collections.sort(list, (c1, c2) -> c1.n - c2.n );// ���ٽ� 2������
//
//		System.out.println("---------------");
//		for (Card item : list) {
//			item.outPut();
//		}
		//������ 5���� �ڵ�� ����ؾ��ϴ���?
		//�۵��� ���� �ʴ� �ڵ尡 �ִ�. -> int�� �Ǿ� �������� �����Ѵ�
		//float�� ����� ��쿡�� 1�� ������ 2�������� ����Ҽ��ִ�
		
		
		
		
		
		
		
		
		//����ġ�� ��ٷο�
		//������ ������ �츱���ִ�? 
		//�ٸ����� ���� ����
		//�׷��� x�� y�࿡ ����� 1�� �������� 2~5�� ���� ���� ª�� �����
		//n1�� n2�� ������ ���� ������� ���� �����ϰ�ʹ�?
		
		LinkedList<Card> listxy = new LinkedList<Card>();
		
		listxy.add(new Card(5,6, "x"));
		listxy.add(new Card(7,1, "x"));
		listxy.add(new Card(9,20, "x"));
		listxy.add(new Card(2,16, "x"));
		listxy.add(new Card(2,8, "x"));
		Collections.sort(listxy,new Comparator<Card>() {
			@Override
			public int compare(Card c1, Card c2) {
				int r1 = c1.n1 * c1.n2;	//���� ����
				int r2 = c2.n1 * c2.n2;
				if(r1 > r2) {		//������ ������ �޶�����
					 return +1;
				}else {
					return -1;
				}
			}
		});
		
		for (Card item : listxy) {
			item.outPut();
		}
		
//		Ŭ������ �ּҴ����� ���۸� �ϵ��� ����� ���� ����
//		������ ����� ����ϴµ�
//		����� �ʿ��ϴٰ��ؼ� �޼ҵ带 �߰��ϰų� ������ �ϰԵǸ� �����ʴ�
		
		
		
		
		
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