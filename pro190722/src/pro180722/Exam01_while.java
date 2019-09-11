package pro180722;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Exam01_while {
	public static void main(String[] args) {
		// while 탈출조건
		// 랜덤하게 숫자가 사라짐
		// 0 1 2 3 4 5 6 7 8 9 //후보
		// 0 0 0 0 0 0 0 0 0 0 //카운팅
		// 산놈만 보면
		// 0 2 5 6 10 11 12 13 14 15
		// 1 1 1 1 0 0 0 0 0 0
		//
		// 2 5 6 11 12 16 17 18 19 20
		// 2 2 2 1 1 1
		Scanner sc = new Scanner(System.in);
		int num = 0;// 파티컬 프로그램 : 생성&제거가 되는 프로그램
		LinkedList<Integer> list = new LinkedList<Integer>();	//초기 셋팅해줌미다.
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
		
			for (int i = 0; i < 10; i++) {// 갱신 : 죽이고 살리고
				System.out.printf(" %02d |",list.get(i));
				//Collections.shuffle(list);
				list.retainAll(random);
				
				
			}System.out.println();
			int max = num+10;
			int min = num-10;
			
			for (int i = 0; i < 10; i++) {// 생성문 new 계속쓰 위에서 제거된 만큼 재생성해줘라
				int randomValue_int = (int)(Math.random()*max)+min;
				random.add(randomValue_int);
				if(list.get(i)==null) {
					list.set(i,num);
					num++;
				}else if(list.get(i)!=null) {
					//list.get(i).setCount(0);
					System.out.println("널아님");
				}
				

			}
			System.out.println("-------------------------------");
		}
		
		
		// */

		/*
		System.out.printf("호랑잉"); // printf 써라
		System.out.printf("코낄쓰");
		System.out.printf("\n");
		System.out.printf("돆\n뚜리");
		System.out.printf("고%d양%d쓰\n", 33, 99);

		System.out.printf("고%03d양%04d쓰", 23, 49);

		System.out.printf("고%3d양%4d쓰", 15, 79);
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
