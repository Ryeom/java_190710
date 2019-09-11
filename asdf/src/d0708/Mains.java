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
				System.out.println("냥냥");
			}
		});

		func02(new T() {
			public void func01() throws Exception {
				Thread.sleep(2000);
				System.out.println("멍멍");
			}
		});
		func02(new T() {
			public void func01()   {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {

				}
				System.out.println("냥냥");
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

	public void func() { // 스택풀기(예외처리) :
		func02(() -> {
			Thread.sleep(2000);
			System.out.println("냥냥");
		});

		func02(() -> {
			Thread.sleep(2000);
			System.out.println("멍멍");
		});
		func02(() -> {
			Thread.sleep(2000);
			System.out.println("냥냥");
		});

	}

}

public class Mains {
	public static void main(String[] args) {

		// 메인이 책임지게 하지말것

		// AOP 관점지향 프로그래밍
		/*
		 * 나머지 부분 놔두고 내가 관심있는 부분만 어떻게하는 것 중간에 코드를 삽입 할 수만 있다면!
		 * 
		 */
		/*
		 * System.out.println(1); try { Thread.sleep(2000); // Blocking //
		 * exception발생try catch System.out.println("냥냥"); } catch (InterruptedException
		 * e1) { } System.out.println(2);
		 */
		A a = new A();
		a.func();

	}
}
