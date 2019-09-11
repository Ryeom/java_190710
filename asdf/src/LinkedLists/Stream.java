package LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Spliterator;

public class Stream {

	public static void main(String[] args) {
		LinkedList<Shape> list = new LinkedList<Shape>();
		for (int i = 0; i < 100000; ++i) {
			list.add(new Shape("circle" + i, i));
		}

//		for (Shape shape : list) {
//			System.out.println(shape);
//		}

		Spliterator<Shape> split = list.spliterator();

		// while(split.tryAdvance((value)->printDetaile(value)));
		// split.trySplit();

		ArrayList<Spliterator<Shape>> arr = new ArrayList<>();
		arr.add(split);

		System.out.println(split.estimateSize());
		int arrcnt = 0;

		while (true) {
			arrcnt++;
			arr.add(arrcnt, arr.get(0).trySplit());
			if (arr.get(0).estimateSize() == 0) {
				break;
			}
		}

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).estimateSize());
		}

		int totalsize = arr.size();
		int halfSize = totalsize / 2;

//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for (int i = 0; i < halfSize; i++) {
//					while (arr.get(i).tryAdvance((value) -> printDetaile(value)));
//				}
//			}
//		}).start();

		new Thread(() -> {
			for (int i = 0; i < halfSize; i++) {
				while (arr.get(i).tryAdvance((value) -> printDetaile(value)))
					;
			}
		}).start();
		
		
		//병렬처리 했을경우 장점?
		//자원을 따로 처리해서 혼자 처리하는 것보다 대용량 데이터를 빠르게 
		//map reduce ?
		//대용량 데이터 처리
		//map + reduce = mapReduce
		//이중 스레드?
		//데이터 네트워크 통신속도 / 하드 저장속도
		//네트워크에서 하드로 기록하는 속도
		//buffer에 계속 기록
		//들어올때부터 4대 컴에 4개로 쪼개버려 => 속도가 4배 빨라져따(병렬처리)
		//컴이 128대라면 일괄적으로 128대가 같이 움직이면서
		//엄청난 속도로 저장 혹은 기록이 이루어지게된다.
	}

	static void printDetaile(Shape s) {

		System.out.println("--------------");
		System.out.println("name : " + s.name);
		System.out.println("size : " + s.size);

	}
}

class Shape {
	String name;
	int size;

	public Shape(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}