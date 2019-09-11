package day02;

public class Test04 {
	Test04() {

	}
	// 만약에 없으면 자동으로 디폴트 생성자 를 만들어서 컴파일 시켜준다
	// 생성자를 하나라도 만들어줬으면 자동으로 생기지않는다.
	// 꼭 생성자를 만들어줄것

	public static void main(String[] args) {
		Apple01 a1 = new Apple01();
		Apple01 a2 = new Apple01(12);
		Orange a3 = new Orange();

		a3.func01();
		a3.func03();
		a3.func04();
		
		a3.func05();
	}
}

class Apple01 {

	Apple01() {
	}

	Apple01(int num) {

	}

	void func01() {
		System.out.println("func 01 call apple");
	}

	void func02() {
		System.out.println("func 02 call apple");
	}

	void func03() {
		System.out.println("func 02 call apple");
	}
	
	void func05() {
		System.out.println("----------");
		func06();
		func07();		//
	}

	void func06() {	//오버라이딩된 함수는 무조건 자식을 먼저 뒤져보고 있으면 자식꺼 없으면 부모꺼 쓴다. 
		System.out.println("func 06 call apple");
	}
	
	void func07() {
		System.out.println("func 07 call apple");
	}
}

class Orange extends Apple01 { // 상속관계
	Orange() {
	}

	void func02() {
		System.out.println("func 02 call orange");
	}

	void func03() {		//
		System.out.println("func 02 call orange");
	}//무조건 자식을 쓸 수 밖에 없당
	//부모를 쓰고싶다? 하면 자식을 거쳐서 지나쳐야한다
	
	void func04() {//자식함수가 먼저 나와서 부모의 함수가 보이지 않는다 = "가려졌다"라고 표현한다.
		
		System.out.println("-------------");
		func03();//자식을 호출하는것. 
		super.func03();
	}
	
	void func06() {
		System.out.println("func 06 call orange");
	}

}
