package one;

import java.util.Arrays;

class Apple {

	static void func01() { // �޸𸮰� �����Ǿ����Ǵ�
		System.out.println(1);
		func02(); // �̰� ����
		// ��� ����ƽ�� �ƴϾ� ���� ����
		// ����ƽ �Լ��ȿ��� �Լ��� �θ�������� �װ͵� ����ƽ
	}

	static void func02() {
		System.out.println(2);
	}

	static void func03(int num) {
		// System.out.println(Integer.toBinaryString(num));
		String intet = Integer.toBinaryString(num);
		// System.out.println("----");
		// System.out.println(intet);

		char[] temp = intet.toCharArray();
		String[] result = new String[(temp.length / 4) + 1];
		Arrays.fill(result, "");
		char zero = 48;

		int cnt = 0;
		// System.out.println("else �κ�");
		// System.out.println(temp.length % 4);// 0���ڸ�
		for (int i = 0; i < result.length; i++) {
			// result[i]="\t";
			for (int j = 0; j < 4; ++j) {
				if ((temp.length % 4 == 0) || i == 0 && j < (temp.length) % 4) {
					// System.out.println("�̰� :" + i + "/" + j);
					result[0] += String.valueOf(zero);
				} else {
					result[i] += temp[cnt];
					// System.out.println(result[i]);
					++cnt;
				}
			}
			result[i] += "\t";
			// System.out.println("��� : " + result[i]);
		}

		// System.out.println("-----");
		System.out.println(Integer.toHexString(num));
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

	static void func04(int num) {
		/*
		 * String : const �ѹ������Ǹ� ���빰 �����Ұ� crud x StringBuffer : ������ ���Ű��� curd o
		 * 
		 */
//		String s = "ȣ����";

//		System.out.println("\n/"+s.hashCode());
//		s = "�ڳ���";
//		System.out.println("/"+s.hashCode());

		System.out.println(Integer.toBinaryString(num));// �������� �������
		String s1 = Integer.toBinaryString(num);
		System.out.println(s1.length());
		char[] ar = new char[32 - s1.length()];
		for (int i = 0; i < ar.length; ++i) {
			ar[i]='0';
		}
		String s2 = new String(ar);
		System.out.println(s2);
		String s3 = s2+s1;
		System.out.println(s3+"/"+s3.length());
		
		StringBuffer s4 = new StringBuffer(s2+s1);	//����� s3�� ����.
		System.out.println(s4+"/"+s4.length());
		
		//��������ž�
		//s4.insert(4,' ');	//�Ǿ��� �ε��� ���� �����ؼ�
		System.out.println((s4.length()/4)+1);
		for(int i = 0; i <7;++i) {
			//s4.insert((4*i)+i, ' ');
			s4.insert((7-i)*4, ' ');
		}
		
		
		
		System.out.println(s4+"/"+s4.length());
		
	}

	static void func05(int num) {
		String temp1 = Integer.toBinaryString(num);
		System.out.println(temp1);
		int rest = 4-(temp1.length()%4);
		//System.out.println(rest);
		char[] forword = new char[rest];
		for (int i = 0; i < forword.length; ++i) {
			forword[i]='0';
		}
		String temp2 = new String(forword);

		StringBuffer result = new StringBuffer(temp2+temp1);
		int rest2 = (temp1.length()/4 ==0)? 0:1;
		for(int i = 0; i <(temp1.length()/4)+rest2;++i) {
			//s4.insert((4*i)+i, ' ');
			result.insert((((temp1.length()/4)+1)-i)*4, ' ');
		}
		System.out.println(result+"/"+result.length());
		
		
	}
}

public class Test01 {

	void func01() {
	} // ���ο��� ��������

	static void func02() {
	} // ���ο��� �����ִ�. �׽�Ʈ�뵵�� �ᵵ ����

	static void func03(int num) {

	}

	public static void main(String[] args) {
		// Apple.func01();
		//Apple.func03(0x3c94ab78);

		//Apple.func04(0x3c94ab73);
		Apple.func05(0x4ab72);
		/*
		 * short a = 3, b = 1; int c = 2;
		 * 
		 * b = (short)(a + c); //b = a + (short)c;//������ ��� : 5Ģ������ �Ͼ�� �׼��� ���������� int��
		 * �޾Ƶ��̱⶧���� �߰��� �ϸ� �ȵȴ�
		 * 
		 * //�������� �����ϰ� ���Կ����ڴ� �޴³��̰� �ִ³��̰� Ÿ���� ���ƾ��Ѵ� //�ڹٴ� 5Ģ���� ������ int�� ����ع��� //�ִ� ����
		 * �޴� �� ��������
		 */

		
		// long a = 10;//4byte�̻� �� ��� ���� ū Ÿ���� �����ִ� long�� �Ǿ������. 
		// int b = 1;
		 //b = (int)a +b; //4byte���ϴ� 
		 

		// System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.toHexString(1234));//10������ 16������ ������ش�.

		//System.out.println(Integer.toHexString(Integer.MAX_VALUE));	//7fffffff//�ֻ�����Ʈ�� 0�̵Ǿ����� 7�̰� �ֻ����� fffffff
		/*
		 * 2147483647 4d2 7fffffff
		 */
		// 0x3c94ab73

		//int a = 0386;//�̰� �־ȵ�? ���ھտ� 0�� ������ 8������ �ؼ����Ѵ�. 8�� 0~7������ ������ 8�̵��� �ȴ�
		//int c = 0376; //�̰� �����Ƴ�
		//int b = 00037;//�̰� �� ������ �ƴ���?

		// �ַ� ���������� 8����, 16����, 10���� 3������ ���� ����.

	}

}
