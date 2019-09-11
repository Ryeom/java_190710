package d0708;

interface T {

	public void func01() throws Exception;
}

class A {

	public void func002(T t) {
		System.out.println(1);
		try {
			t.func01();
		} catch (Exception e) {

		}
		System.out.println(2);
	}

	public void func001() throws Exception { //
		func02(new T() {
			public void func01() throws Exception {
				Thread.sleep(2000);
				System.out.println("�ɳ�");
			}
		});

		func02(new T() {
			public void func01() throws Exception {
				Thread.sleep(2000);
				System.out.println("�۸�");
			}
		});
		func02(new T() {
			public void func01()   {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {

				}
				System.out.println("�ɳ�");
			}
		});
	}


	//real 
	public void func02(T t) {
		System.out.println(1);
		try {
			t.func01();
		} catch (InterruptedException e) {

		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(2);
	}

	public void func() { // ����Ǯ��(����ó��) :
		func02(() -> {
			Thread.sleep(2000);
			System.out.println("�ɳ�");
		});

		func02(() -> {
			Thread.sleep(2000);
			System.out.println("�۸�");
		});
		func02(() -> {
			Thread.sleep(2000);
			System.out.println("�ɳ�");
		});

	}

}

public class Mains {
	public static void main(String[] args) {

		// ������ å������ ��������

		// AOP �������� ���α׷���
		/*
		 * ������ �κ� ���ΰ� ���� �����ִ� �κи� ����ϴ� �� �߰��� �ڵ带 ���� �� ���� �ִٸ�!
		 * 
		 */
		/*
		 * System.out.println(1); try { Thread.sleep(2000); // Blocking //
		 * exception�߻�try catch System.out.println("�ɳ�"); } catch (InterruptedException
		 * e1) { } System.out.println(2);
		 */
		A a = new A();
		a.func();

	}
}
