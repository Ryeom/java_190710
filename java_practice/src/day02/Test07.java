package day02;

public class Test07 {
	public static void main(String[] args) {
		Appleee a = new Appleee(new Banananaa());
		//하나의 객체만 생성자에서 받는다.
		Appleee a2 = new Appleee(new Orangee());
		
		//a.func01(new Banananaa());
		//a.func02(new Banananaa());//1. 각기 다른 객체가 간다.
		a.func01();
		a2.func01();//둘다 같은 객체!(안정적)//함수 인수전달 ㄴㄴ(비용감소)
		
	}
	
}

class Appleee{
	fruit fr;
	
	Appleee(){}
	Appleee(fruit fr){this.fr = fr;}//함수전달 초기비용이 생성자에서만 생긴다.
	//뭐가 날라오든 돌아가게끔되어이따
	//생성자에서 다형성을 이용해서 인수를 전달하는 경우 : 주입
	//spring : DI 외부 주입만 신경을 잘 써라 마
	
	
	
	void func01() {
		fr.func03();
		
	}
	void func02() {
		fr.func03();
	
	}
	
}
class fruit {
	fruit(){}
	void func03() {}
}

class Banananaa extends fruit{
	Banananaa(){}
	void func03() {
		System.out.println("bananana func 03 call");
	}
}

class Orangee extends fruit{
	Orangee(){}
	void func03() {
		System.out.println("Orange func 03 call");
	}
}
