package real_lamda;

public class Main_s {
	public static void main(String[] args) {

		B b1 = new B() {
			public A func02() {
				return new A() {
					public void func01() {
						System.out.println(" ²®µû±¸¸¦ ¶¼¹ö·È!!!!!! ");
					}
				};
			}
		};

		B b2 = new B() {
			public A func02() {					//2²®µü ¶¼±â
				return () -> {
					System.out.println("new B -> func02 -> return -> Ãâ·Â");
				};
			}
		};
		
		B b3 = () -> {
				return () -> {
					System.out.println(" return ->Ãâ·Â");
				};
		};
		
		B b4 = () ->  () -> System.out.println("->Ãâ·Â");
			
		
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
	public A func02(); // interface°¡ ¸®ÅÏµÈ´Ù
}