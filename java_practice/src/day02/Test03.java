package day02;

public class Test03 {
	
	public static void main(String[] args) {
	Apple a = new Apple();	
		System.out.println(a.hashCode());
		//�� ��ü�� ������ȣ������
		//��ü�� ������ȣ�� �����ϰ� ���� ���� ���� ����.
		
		a.func01();
		a.func02(14, 7);
		
		System.out.println(a.num);
		System.out.println(a.func03());
		System.out.println(a.func04());
		
		System.out.println("----------------------------");
		
		a.func05().func05().func05().func06();
		//ü�̴� ����̴� �̳� ���ֺ��� �ɰ���
		a
		.func05()
		.func05()
		.func05()
		.func06();	//ü�̴� �� ��� �̷�������� ���̾���
		System.out.println("----------------------------");
		
		
		
	}
}


class Apple {	//1 �� ���Ͼȿ� Ŭ������ ������ �����Ҽ� ������ public�� ���� ���� �� �ϳ��� �����ϴ�
	
	int num;				//filed
	
	
	Apple(){ //�����ڴ� Ŭ�����̸��� ����
		//�������� ������ �ʵ� ���� �ʱ�ȭ�̴�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//�굵 �����ε����~
		System.out.println("������ ��");
		System.out.println(this.hashCode());//���ο��� ����ϴ� �ֶ� ��� �Ȱ���.
		// �� ���α׷����� this = a
		//�ٵ� this�� b�� �ɼ���
		num = 1234;
	}//�����ɶ� �� �ѹ��ݵ�
	
	Apple(int a, int b){
		
	}
	
	Apple(int num){	//n�̷��� ������ �� �ʵ�� ������ �μ��� �̸��� ���ߴ� ���� �����ϴ�.
		this.num = num;
	}
	
	
	
	void func01() {	//�̷��� ���Ͼ�
		System.out.println("func 01 ��");
	}
	
	void func02(int a,int b) {
		System.out.println(a + "/" + b);
		
	}
	
	int func03() {
	
		return 100;
	}
	
	int func04() {
		return 9999;
	}
	
	
	
	Apple func05() {
		System.out.println("func 05 call");//����� �뵵�� ���� ���ȴ� ����� �Ͼ�� ���� ����Ȯ��
		return this;
	}
	
	void func06() {
		System.out.println("func 06 call");
	}
	//��ü�̸� a��� ������ �Լ� ��ȣ 05�� �� �� �ִ�.
	//�̶� ���� this������ ���߿��� ���������
	
	int func06(int a) {//�Լ� �����ε�
		return a;
	}
	
	char func06(int a,int b) {
		return 'a';
	}
	
	
	
}