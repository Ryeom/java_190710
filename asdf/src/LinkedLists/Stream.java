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
		
		
		//����ó�� ������� ����?
		//�ڿ��� ���� ó���ؼ� ȥ�� ó���ϴ� �ͺ��� ��뷮 �����͸� ������ 
		//map reduce ?
		//��뷮 ������ ó��
		//map + reduce = mapReduce
		//���� ������?
		//������ ��Ʈ��ũ ��żӵ� / �ϵ� ����ӵ�
		//��Ʈ��ũ���� �ϵ�� ����ϴ� �ӵ�
		//buffer�� ��� ���
		//���ö����� 4�� �Ŀ� 4���� �ɰ����� => �ӵ��� 4�� ��������(����ó��)
		//���� 128���� �ϰ������� 128�밡 ���� �����̸鼭
		//��û�� �ӵ��� ���� Ȥ�� ����� �̷�����Եȴ�.
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