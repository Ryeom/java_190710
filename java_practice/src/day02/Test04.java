package day02;

public class Test04 {
	Test04() {

	}
	// ���࿡ ������ �ڵ����� ����Ʈ ������ �� ���� ������ �����ش�
	// �����ڸ� �ϳ��� ����������� �ڵ����� �������ʴ´�.
	// �� �����ڸ� ������ٰ�

	public static void main(String[] args) {
		Apple01 a1 = new Apple01();
		Apple01 a2 = new Apple01(12);
		Orange a3 = new Orange();

		a3.func01();
		a3.func03();
		a3.func04();
		
		a3.func05();
	}
}

class Apple01 {

	Apple01() {
	}

	Apple01(int num) {

	}

	void func01() {
		System.out.println("func 01 call apple");
	}

	void func02() {
		System.out.println("func 02 call apple");
	}

	void func03() {
		System.out.println("func 02 call apple");
	}
	
	void func05() {
		System.out.println("----------");
		func06();
		func07();		//
	}

	void func06() {	//�������̵��� �Լ��� ������ �ڽ��� ���� �������� ������ �ڽĲ� ������ �θ� ����. 
		System.out.println("func 06 call apple");
	}
	
	void func07() {
		System.out.println("func 07 call apple");
	}
}

class Orange extends Apple01 { // ��Ӱ���
	Orange() {
	}

	void func02() {
		System.out.println("func 02 call orange");
	}

	void func03() {		//
		System.out.println("func 02 call orange");
	}//������ �ڽ��� �� �� �ۿ� ����
	//�θ� ����ʹ�? �ϸ� �ڽ��� ���ļ� �����ľ��Ѵ�
	
	void func04() {//�ڽ��Լ��� ���� ���ͼ� �θ��� �Լ��� ������ �ʴ´� = "��������"��� ǥ���Ѵ�.
		
		System.out.println("-------------");
		func03();//�ڽ��� ȣ���ϴ°�. 
		super.func03();
	}
	
	void func06() {
		System.out.println("func 06 call orange");
	}

}
