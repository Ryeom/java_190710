package pro180722;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Exam01_while {
	public static void main(String[] args) {
		// while Ż������
		// �����ϰ� ���ڰ� �����
		// 0 1 2 3 4 5 6 7 8 9 //�ĺ�
		// 0 0 0 0 0 0 0 0 0 0 //ī����
		// ��� ����
		// 0 2 5 6 10 11 12 13 14 15
		// 1 1 1 1 0 0 0 0 0 0
		//
		// 2 5 6 11 12 16 17 18 19 20
		// 2 2 2 1 1 1
		Scanner sc = new Scanner(System.in);
		int num = 0;// ��Ƽ�� ���α׷� : ����&���Ű� �Ǵ� ���α׷�
		LinkedList<Integer> list = new LinkedList<Integer>();	//�ʱ� �������̴ܹ�.
		LinkedList<Integer> random = new LinkedList<Integer>();	
		for (int i = 0; i < 10; i++) {
			list.add(i);
			num++;
		}
		
		//System.out.println(list);
		//System.out.println(list.size());
		System.out.println("-------------------------------");
		
		///*
		while (num != 99) {
			
			int gg = sc.nextInt();
			System.out.println();
		
			for (int i = 0; i < 10; i++) {// ���� : ���̰� �츮��
				System.out.printf(" %02d |",list.get(i));
				//Collections.shuffle(list);
				list.retainAll(random);
				
				
			}System.out.println();
			int max = num+10;
			int min = num-10;
			
			for (int i = 0; i < 10; i++) {// ������ new ��Ӿ� ������ ���ŵ� ��ŭ ����������
				int randomValue_int = (int)(Math.random()*max)+min;
				random.add(randomValue_int);
				if(list.get(i)==null) {
					list.set(i,num);
					num++;
				}else if(list.get(i)!=null) {
					//list.get(i).setCount(0);
					System.out.println("�ξƴ�");
				}
				

			}
			System.out.println("-------------------------------");
		}
		
		
		// */

		/*
		System.out.printf("ȣ����"); // printf ���
		System.out.printf("�ڳ���");
		System.out.printf("\n");
		System.out.printf("��\n�Ѹ�");
		System.out.printf("��%d��%d��\n", 33, 99);

		System.out.printf("��%03d��%04d��", 23, 49);

		System.out.printf("��%3d��%4d��", 15, 79);
		 */
	}

}

class Card{
	int number;
	int count;
	
	
	public Card(int number,int count) {
		this.number=number;
		this.count=count;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
