package day02;

public class Test07 {
	public static void main(String[] args) {
		Appleee a = new Appleee(new Banananaa());
		//�ϳ��� ��ü�� �����ڿ��� �޴´�.
		Appleee a2 = new Appleee(new Orangee());
		
		//a.func01(new Banananaa());
		//a.func02(new Banananaa());//1. ���� �ٸ� ��ü�� ����.
		a.func01();
		a2.func01();//�Ѵ� ���� ��ü!(������)//�Լ� �μ����� ����(��밨��)
		
	}
	
}

class Appleee{
	fruit fr;
	
	Appleee(){}
	Appleee(fruit fr){this.fr = fr;}//�Լ����� �ʱ����� �����ڿ����� �����.
	//���� ������� ���ư��Բ��Ǿ��̵�
	//�����ڿ��� �������� �̿��ؼ� �μ��� �����ϴ� ��� : ����
	//spring : DI �ܺ� ���Ը� �Ű��� �� ��� ��
	
	
	
	void func01() {
		fr.func03();
		
	}
	void func02() {
		fr.func03();
	
	}
	
}
class fruit {
	fruit(){}
	void func03() {}
}

class Banananaa extends fruit{
	Banananaa(){}
	void func03() {
		System.out.println("bananana func 03 call");
	}
}

class Orangee extends fruit{
	Orangee(){}
	void func03() {
		System.out.println("Orange func 03 call");
	}
}
