package test;

/*public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple();
		Apple.Fruit b = a.new Fruit();
		a.func01();
		b.func02();
				
	}
}*/

////exam1
//class Apple{
//int num;
//public Apple() {
//  // TODO Auto-generated constructor stub
//}
//
//public void func() {
//  System.out.println("gg");
//}
//
//}

////exam2�� 3 �������
//class Apple{
//int num;
//public Apple() {}
//public void func1() {System.out.println("���");}
//}
//class Fruit extends Apple{
//int num2;
//public Fruit() {
//  // TODO Auto-generated constructor stub
//}
//public void func2() {
//  System.out.println("�ٳ��ٳ�");
//}
//}
//class Orange extends Fruit{
//int num3;
//public Orange() {}
//public void func3() {
//  System.out.println("���� ���  �θ� ���� -> �ٳ��� // �ٳ��� -> ������");
//}
//}

////exam4 �߻��Լ�
//abstract class Apple {
//int num;
//public Apple() {   }
//public void func1() {
//  System.out.println("fun1");
//}
//public abstract void func2();
//}
//class Fruit extends Apple{
//int num2;
//public Fruit() {}
//
//@Override
//public void func2() {
//  // TODO Auto-generated method stub
//  System.out.println("123123");
//}
//}

//exam 5 �������̽�  -- �������̽��� ��쿡�� abstract�� �Ⱦ��°� �Ϲ����̴�.

//1.���� ��ü�����ȵ�
//2.�̱����Լ��� ��� �����������
//3.�����Լ��� �տ� �ݵ�� �ۺ����δ�
/*interface Apple {
	public void fun1();

	public void fun2();
}

class Fruit implements Apple {

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("�������̽� 1��");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("�������̽� 2��");
	}

}*/
//exam6 ���� �������̽�
// 5,6,7�� ������ �޾Ƽ� ���� ��찡 �ִ�.
/*
interface Apple { public void fun1(); } interface Fruit{ public void
func02(); } class Orange implements Apple, Fruit{

@Override public void func02() { }

@Override public void fun1() { } }
*/

// �ڹٴ� ���߻���� �ȵȴپƾƾƾƾ�
/*
class Apple {
	
}
class Fruit {
	
}
class Orange {

}
*/
//exam7
/*
 * class Apple{
 * 
 * } interface Fruit{ public void func01(); } interface Orange{ public void
 * func02(); } class Kiwi extends Apple implements Fruit, Orange{
 * 
 * @Override public void func02() {
 * 
 * }
 * 
 * @Override public void func01() {
 * 
 * }
 * 
 * }
 */

//exam8
/*
 * interface Apple{ public void func01(); } interface Fruit extends Apple{
 * //������ �Ұ��ϴϱ� ������� �ϼ� public void func02(); }
 */

//exam9
/*
 * interface Apple{ public void func01(); interface Fruit{ //�������̽��ȿ� �������̽���
 * ������ִ�. public void func02();
 * 
 * } interface melon{ public void func03(); } } class Orange implements Apple{
 * //���� �������̽�(Fruit)�� ���ٰ� ����ϸ� �ȴ�
 * 
 * @Override public void func01() { } class Kiwi implements Apple.Fruit{ //�ΰ���
 * interface�� ��ȣ ������ ���谡 ������
 * 
 * @Override public void func02() { } //���� �������̽� �����
 * 
 * }
 * 
 * //���� interface - �ѽ� interface �� �̷�����? //�̷��� interface�� 1���̻��� ���� ��� ����Ѵ�. }
 */

//exam10
/*
 * interface Apple{ public void func01(); class Fruit{ //interface�ȿ� class
 * public void func02() { System.out.println("��?"); } }//�ȿ� �ִ� Ŭ�������ٰ� �����ϰ� }
 * class Orange implements Apple{
 * 
 * @Override public void func01() {
 * 
 * } } class Kiwi extends Apple.Fruit{ //���� ������ ����
 * 
 * }
 * 
 */

//exam11
/*
 class Apple{ public void func01() {
  
 } class Fruit{ public void func02() {
  
  } } } public class Test { public static void main(String[] args) { // TODO
  Auto-generated method stub Apple a = new Apple(); Apple.Fruit b = a.new
  Fruit(); a.func01(); b.func02(); } }
  
 */

//exam 12
/*interface Apple {
	public void func01();
}

class Fruit implements Apple {
	@Override
	public void func01() {

	}
}
*/
/*
 * public class Test { public static void main(String[] args) { // Fruit ba =
 * new Fruit(); Apple a = new Apple() { //������ �ڿ� �Լ��� ���� �������ָ� ��ü�� ���⼭ �ٷ� ��밡�� :
 * ��� �͸� class public void func01() {
 * 
 * } };
 * 
 * new Apple () {
 * 
 * };
 * 
 * } }
 */
/*
 * public class Test { public static void main(String[] args) { // Fruit ba =
 * new Fruit(); new Apple () { //��ü�� ��� �޸𸮰� ��������ٰ� �ٷ� �������. public void
 * func01() {
 * 
 * } }.func01();//�̷����ϸ� �Լ��� ���Ҽ��̵�. : �͸�ü (�������� �����ߴٰ� �ʿ�������� �ٷι������� } }
 */
/*
 * public class Test { public static void main(String[] args) {
 * 
 * 
 * Apple a = new Apple() { //�͸� class //�� �Ƚ�
 * 
 * @Override public void func01() { } };
 * 
 * new Apple() { //�͸� ��ü //���̽� : public void func01() {
 * 
 * } };
 * 
 * new Apple() { //�͸� //�ѹ����� �������� public void func01() {
 * 
 * } }.func01();
 * 
 * 
 * 
 * 
 * } }
 */

//exam 13						�߿��ϴ�
/*
 * interface Apple{ public void func01(); } class Fruit{ public void
 * Func02(Apple apple) { System.out.println(1); apple.func01(); //���� apple�� ����Ѵ�
 * !!!!!!!!!!!!!!! } } public class Test{ public static void main(String[] args)
 * { Fruit b =new Fruit(); b.Func02(new Apple() { //�Լ��� �μ��� '�ڵ�'�� �������־���. �߿��߿�
 * public void func01() { System.out.println(2); } });
 * 
 * Fruit bb = new Fruit(); bb.Func02(new Apple() { public void func01() {
 * System.out.println("�Ϳ�");
 * 
 * } });
 * 
 * } }
 */

//exam14
/*
 * class Apple { //class�ȿ� interface ///public void Func01(); //�̷��� �� �Ⱦ���.
 * interface Banana { public void func02(); } } class Orange implements
 * Apple.Banana {
 * 
 * @Override public void func02() { } } public class Test{ public static void
 * main(String[] args) { Orange o = new Orange(); o.func02();//�䷸�Դ� �߾Ⱦ���
 * 
 * Apple.Banana ab = new Apple.Banana() {//interface�ȿ� interface�� �̷������� �����Ҽ��ִ�.
 * 
 * @Override public void func02() { System.out.println(1); } };
 * 
 * new Apple.Banana() {
 * 
 * @Override public void func02() { System.out.println(2); } };
 * 
 * new Apple.Banana() {
 * 
 * @Override public void func02() { System.out.println(3); } }.func02();
 * 
 * 
 * } }
 */

//exam15

/*
 * interface Apple{ public void func01(); } class Banana implements Apple{
 * public void func01() { System.out.println("func1"); } } public class Test{
 * public static void main(String[] args) { Banana b = new Banana();
 * 
 * b.func01();
 * 
 * Apple apple = new Apple() { //�ٷ� ���� ��ü������������ ���� �����ؼ� ����Ҽ����ִ�. public void
 * func01() {
 * 
 * } }; new Apple() { public void func01() {
 * 
 * } };
 * 
 * //--------
 * 
 * Banana bb = new Banana() { public void func01() {
 * 
 * } }; //�̷����ϸ� �����ڵ带 �����ϰ� �ڱ� �ڵ�� �ٲ����
 * 
 * 
 * 
 * } }
 */

//exam16
/*
 * interface Apple { public void func01(); }
 * 
 * abstract class Banana implements Apple { // �̰Ŵ� interface�ȿ� interface�ִ°Ŷ� �Ȱ���
 * // public void func01() {} abstract void func02(); }
 * 
 * public class Test { public static void main(String[] args) { Banana b = new
 * Banana() { public void func01() { } void func02() {
 * 
 * } }; new Banana() { public void func01() {
 * 
 * }
 * 
 * void func02() {
 * 
 * } };
 * 
 * } }
 */
//exam 17
/*class A{
	interface B{
		public void funcB();
		
		
		A a = new A();
		
		}
		A.C ac = new C() {
			void funcC() {
				
		};
		}
}
	interface C{
		public void funcC();
		
		
		A a = new A() {
			
		};
		A.B ab = new B() {
			void funcB();
		};	
	
	
}*/

//����//////////////////////////////////////////////////////////////////////////////////////
/*
 * class A { interface B { public void func01(); } }
 * 
 * class C { void func02(A.B ab) { //���Կ��� new�� �ѱ��? ab.func01(); //���� ��
 * ���ֱ�@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ }
 * 
 * }
 * 
 * public class Test{ public static void main(String[] args) { C c = new C ();
 * c.func02(new A.B () { public void func01(){ System.out.println(1); } }); } }
 */

class View {
	interface OnClickListner {
		public void OnClick();
	}
	interface OnBoubleClickListner{
		
	}
}

class Button {
	void SetOnClickLinstner(View.OnClickListner ab) {
			ab.OnClick();
	}

}

public class Test{
	public static void main(String[] args) {
		Button c = new Button ();
		c.SetOnClickLinstner(new View.OnClickListner () {
			public void OnClick(){
				System.out.println(1);
			}
		});
	}
}

//�̰� �ȵ���̵忡�� �¿�Ŭ�������ʸ� ����ϴ� �����̴�
//�̷������� ��ư�� Ŭ�������� �̺�Ʈ�� �ɾ ó���ϴ� �Ϳ� ����Ѵ�.
//Ŭ���̺�Ʈ
//�����߿��Ѱ� �͸�ü ����°�
//�͸� Ŭ���� �͸� ��ü ����� ���� ���� �߿��ϴپƾƾƾ�







