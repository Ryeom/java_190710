package real_lamda;

public class Main_s {
	public static void main(String[] args) {

		B b1 = new B() {
			public A func02() {
				return new A() {
					public void func01() {
						System.out.println(" �������� ������!!!!!! ");
					}
				};
			}
		};

		B b2 = new B() {
			public A func02() {					//2���� ����
				return () -> {
					System.out.println("new B -> func02 -> return -> ���");
				};
			}
		};
		
		B b3 = () -> {
				return () -> {
					System.out.println(" return ->���");
				};
		};
		
		B b4 = () ->  () -> System.out.println("->���");
			
		
		b1.func02().func01();
		b2.func02().func01();
		b3.func02().func01();
		b4.func02().func01();
	}

}

interface A {
	public void func01();
}

interface B {
	public A func02(); // interface�� ���ϵȴ�
}