package day01;

public class Test01 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		// ���׿�����(a,b,c�߰���ã��)
		//���̶� ��� ũ��? ���̰�Ŀ �������? ��Ŀ
		//int temp = ((a>b)?     ((b>c)? b:((a>c)? a:c) ):());
		// �ݶ��� ����
		int n = 11;
		while (!(n == 1)) {
			n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
		}
		System.out.println(n);
		// for��
		for (int i = 0; i < 10; ++i) {
		}
		for (int i = 1; i <= 10; i++) {
		}
		for (int i = -5; i < 5; ++i) {
		} // �̰� ����ȭ �� ���� ����
		// ����ġ�� �迭��

		//���������
		int num = (int)(Math.random()*100)+1;
		//int num = (int)(Math.random()*�ִ밪)+�ּҰ�;

	}
}
