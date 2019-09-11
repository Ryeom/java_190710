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

////exam2와 3 계층상속
//class Apple{
//int num;
//public Apple() {}
//public void func1() {System.out.println("삭삭");}
//}
//class Fruit extends Apple{
//int num2;
//public Fruit() {
//  // TODO Auto-generated constructor stub
//}
//public void func2() {
//  System.out.println("바나바나");
//}
//}
//class Orange extends Fruit{
//int num3;
//public Orange() {}
//public void func3() {
//  System.out.println("계층 상속  부모 애플 -> 바나나 // 바나나 -> 오렌지");
//}
//}

////exam4 추상함수
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

//exam 5 인터페이스  -- 인터페이스의 경우에는 abstract를 안쓰는게 일반적이다.

//1.직접 객체생성안됨
//2.미구현함수는 모두 구현해줘야함
//3.구현함수는 앞에 반드시 퍼블릭붙인다
/*interface Apple {
	public void fun1();

	public void fun2();
}

class Fruit implements Apple {

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 1번");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 2번");
	}

}*/
//exam6 다중 인터페이스
// 5,6,7개 까지도 받아서 쓰는 경우가 있다.
/*
interface Apple { public void fun1(); } interface Fruit{ public void
func02(); } class Orange implements Apple, Fruit{

@Override public void func02() { }

@Override public void fun1() { } }
*/

// 자바는 다중상속이 안된다아아아아아
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
 * //구현은 불가하니까 상속으로 하셈 public void func02(); }
 */

//exam9
/*
 * interface Apple{ public void func01(); interface Fruit{ //인터페이스안에 인터페이스를
 * 만들수있다. public void func02();
 * 
 * } interface melon{ public void func03(); } } class Orange implements Apple{
 * //내부 인터페이스(Fruit)는 없다고 사용하면 된다
 * 
 * @Override public void func01() { } class Kiwi implements Apple.Fruit{ //두개의
 * interface가 상호 밀접한 관계가 있을때
 * 
 * @Override public void func02() { } //내부 인터페이스 사용방법
 * 
 * }
 * 
 * //음식 interface - 한식 interface 뭐 이런관계? //이럴땐 interface가 1개이상이 들어가는 경우 사용한다. }
 */

//exam10
/*
 * interface Apple{ public void func01(); class Fruit{ //interface안에 class
 * public void func02() { System.out.println("롸?"); } }//안에 있는 클래스없다고 생각하고 }
 * class Orange implements Apple{
 * 
 * @Override public void func01() {
 * 
 * } } class Kiwi extends Apple.Fruit{ //둘이 밀접한 관계
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
 * new Fruit(); Apple a = new Apple() { //생성자 뒤에 함수를 직접 구현해주면 객체를 여기서 바로 사용가능 :
 * 얘는 익명 class public void func01() {
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
 * new Fruit(); new Apple () { //객체가 없어서 메모리가 만들어졌다가 바로 사라진다. public void
 * func01() {
 * 
 * } }.func01();//이렇게하면 함수를 콜할수이따. : 익명객체 (동적으로 생성했다가 필요없어지면 바로버려버림 } }
 */
/*
 * public class Test { public static void main(String[] args) {
 * 
 * 
 * Apple a = new Apple() { //익명 class //잘 안써
 * 
 * @Override public void func01() { } };
 * 
 * new Apple() { //익명 객체 //많이써 : public void func01() {
 * 
 * } };
 * 
 * new Apple() { //익명 //한번쓰고 버릴꺼양 public void func01() {
 * 
 * } }.func01();
 * 
 * 
 * 
 * 
 * } }
 */

//exam 13						중요하다
/*
 * interface Apple{ public void func01(); } class Fruit{ public void
 * Func02(Apple apple) { System.out.println(1); apple.func01(); //받은 apple을 사용한다
 * !!!!!!!!!!!!!!! } } public class Test{ public static void main(String[] args)
 * { Fruit b =new Fruit(); b.Func02(new Apple() { //함수의 인수로 '코드'를 전달해주었다. 중요중요
 * public void func01() { System.out.println(2); } });
 * 
 * Fruit bb = new Fruit(); bb.Func02(new Apple() { public void func01() {
 * System.out.println("와웅");
 * 
 * } });
 * 
 * } }
 */

//exam14
/*
 * class Apple { //class안에 interface ///public void Func01(); //이렇게 잘 안쓴다.
 * interface Banana { public void func02(); } } class Orange implements
 * Apple.Banana {
 * 
 * @Override public void func02() { } } public class Test{ public static void
 * main(String[] args) { Orange o = new Orange(); o.func02();//요렇게는 잘안쓰고
 * 
 * Apple.Banana ab = new Apple.Banana() {//interface안에 interface를 이런식으로 구현할수있다.
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
 * Apple apple = new Apple() { //바로 위의 객체생성과별개로 따로 생성해서 사용할수도있다. public void
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
 * } }; //이렇게하면 기존코드를 무시하고 자기 코드로 바꿔버림
 * 
 * 
 * 
 * } }
 */

//exam16
/*
 * interface Apple { public void func01(); }
 * 
 * abstract class Banana implements Apple { // 이거는 interface안에 interface있는거랑 똑같당
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

//실전//////////////////////////////////////////////////////////////////////////////////////
/*
 * class A { interface B { public void func01(); } }
 * 
 * class C { void func02(A.B ab) { //대입연산 new로 넘기네? ab.func01(); //여기 꼭
 * 써주기@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ }
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

//이게 안드로이드에서 셋온클릭리스너를 사용하는 문법이다
//이런식으로 버튼을 클릭했을때 이벤트를 걸어서 처리하는 것에 사용한다.
//클릭이벤트
//제일중요한거 익명객체 만드는거
//익명 클래스 익명 객체 만드는 것이 제일 중요하다아아아아







