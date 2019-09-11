package day02;

public class Test03 {
	
	public static void main(String[] args) {
	Apple a = new Apple();	
		System.out.println(a.hashCode());
		//이 객체의 민증번호ㅇㅂㅇ
		//객체의 민증번호는 동일하게 갖고 나올 수가 없다.
		
		a.func01();
		a.func02(14, 7);
		
		System.out.println(a.num);
		System.out.println(a.func03());
		System.out.println(a.func04());
		
		System.out.println("----------------------------");
		
		a.func05().func05().func05().func06();
		//체이닝 방식이다 겁나 자주보게 될것임
		a
		.func05()
		.func05()
		.func05()
		.func06();	//체이닝 될 경우 이런방식으로 많이쓰임
		System.out.println("----------------------------");
		
		
		
	}
}


class Apple {	//1 한 파일안에 클래스를 여러개 선언할수 있지만 public이 붙은 것은 단 하나만 가능하다
	
	int num;				//filed
	
	
	Apple(){ //생성자는 클래스이름과 동일
		//생성자의 목적은 필드 변수 초기화이다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//얘도 오버로딩댄당~
		System.out.println("생성자 콜");
		System.out.println(this.hashCode());//메인에서 출력하는 애랑 얘랑 똑같다.
		// 이 프로그램에서 this = a
		//근데 this가 b가 될수도
		num = 1234;
	}//생성될때 단 한번콜됨
	
	Apple(int a, int b){
		
	}
	
	Apple(int num){	//n이렇게 하지마 걍 필드와 들어오는 인수의 이름을 맞추는 것이 좋습니다.
		this.num = num;
	}
	
	
	
	void func01() {	//이렇게 통일쓰
		System.out.println("func 01 콜");
	}
	
	void func02(int a,int b) {
		System.out.println(a + "/" + b);
		
	}
	
	int func03() {
	
		return 100;
	}
	
	int func04() {
		return 9999;
	}
	
	
	
	Apple func05() {
		System.out.println("func 05 call");//디버깅 용도로 많이 사용된당 사건이 일어나는 것을 직접확인
		return this;
	}
	
	void func06() {
		System.out.println("func 06 call");
	}
	//객체이름 a라고 했을때 함수 번호 05를 쓸 수 있다.
	//이때 리턴 this했을때 공중에서 사라져버림
	
	int func06(int a) {//함수 오버로딩
		return a;
	}
	
	char func06(int a,int b) {
		return 'a';
	}
	
	
	
}