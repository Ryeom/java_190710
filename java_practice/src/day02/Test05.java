package day02;


class Apple02 {

	Apple02(){}

	void func01() {

	}

	void func03() {

	}

}

class Orange01 extends Apple02 {
	Orange01(){}
	void func02() {

	}

	void func03() {

	}

}
class Banana extends Apple02{
	Banana(){}
	void func03() {
		System.out.println("banana func 3");
	}
}
class Kiwi extends Apple02 {
	Kiwi(){}
	void func03() {
		System.out.println("kiwi func 3");
	}
}

class Dog {
	Dog(){}
	void func01(Apple02 a) {
		System.out.println("¿À·»Áö ¿Ð¿Ð!!");
		a.func03();
	}
	/*
	 * void func02(Banana b) { System.out.println("ºü³ª³ª ¿Ð¿Ð!!"); b.func03(); }
	 * 
	 * void func03(Kiwi k) { System.out.println("Å°À§ ¿Ð¿Ð!!"); k.func03(); }
	 */
}



public class Test05 {
	/*
	public static void main(String[] args) {
		Apple02 a1 = new Orange01();	//upcasting
		a1.func01();
		//a1.func02();
		//¸Þ¸ð¸®´Â Á¸ÀçÇÏ´Âµ¥ ¹®¹ýÀº ±¸»çÇÒ¼ö¾ø´Ù.
		a1.func03();
	}
	*/
	
	public static void main(String[] args) {
		Apple02 a1 = new Banana();
		Apple02 a2 = new Kiwi();
		Apple02 a3 = new Orange01();
		/*
		 * Apple02[] a4= new Apple02[3];//°´Ã¼ ¾È»ý±è a4[0] = new Orange01(); a4[1] = new
		 * Banana(); a4[3] = new Kiwi();
		 */
		int num = (int)(Math.random()*3)+1;
		
		
		/*
		 * switch (num) { case 0: a1.func03();break; case 1: a1.func03();break; case 2:
		 * a1.func03();break; default: break; }
		 * 
		 * a4[num].func03();//½ºÀ§Ä¡¶û ¶È°°Àº ÀÏÀ» ÇÕ´Ï´Ù¿ä
		 */
		Dog dog = new Dog();
		/*
		 * dog.func01(new Orange01()); dog.func02(new Banana()); dog.func03(new Kiwi());
		 */
		dog.func01(new Orange01());
		dog.func01(new Banana());
		dog.func01(new Kiwi());
	}
}