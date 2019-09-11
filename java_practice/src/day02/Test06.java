package day02;

public class Test06 {
	public static void main(String[] args) {
		Applee a = new Applee();
		a.func01(new Bananana());
		a.func02(new Bananana());//1. 각기 다른 객체가 간다.
		
		//함수1/함수2
		//함수중 파일입출력함수가 제일 비용이 많이 든다. 속도적으로 어쩔수가없다
		//두번째 함수의 인수전달의 갯수가 비용이 많이 든다. 오버헤드
		
	}
	
	//인수전달을 안해도 되는 상황이라면 안해도 되도록 만들어보자
}

class Applee{
	Applee(){}
	void func01(Bananana b) {
		b.func03();
	}
	void func02(Bananana b) {
		b.func03();
	}
}

class Bananana{
	Bananana(){}
	void func03() {
		System.out.println("bananana func 03");
	}
}
//잠재적으로 문제를 일으킬 수도 있다.