package day02;

public class Test06 {
	public static void main(String[] args) {
		Applee a = new Applee();
		a.func01(new Bananana());
		a.func02(new Bananana());//1. ���� �ٸ� ��ü�� ����.
		
		//�Լ�1/�Լ�2
		//�Լ��� ����������Լ��� ���� ����� ���� ���. �ӵ������� ��¿��������
		//�ι�° �Լ��� �μ������� ������ ����� ���� ���. �������
		
	}
	
	//�μ������� ���ص� �Ǵ� ��Ȳ�̶�� ���ص� �ǵ��� ������
}

class Applee{
	Applee(){}
	void func01(Bananana b) {
		b.func03();
	}
	void func02(Bananana b) {
		b.func03();
	}
}

class Bananana{
	Bananana(){}
	void func03() {
		System.out.println("bananana func 03");
	}
}
//���������� ������ ����ų ���� �ִ�.