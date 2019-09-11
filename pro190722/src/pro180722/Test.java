package pro180722;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		LinkedList<A> alist = new LinkedList<A>();
		alist.add(new B());
		alist.add(new C());
		alist.add(new B());
		alist.add(new C());

		D d = new D();
		d.func01(alist);

		A a1 = new B();
		a1.func01();// func02는안된다.//쓸수있는 메모리이지만 억지로 사용해야함 문법적 불가능
		((B) a1).func02();// 이거는 메모리가 존재하기 때문에 억지로 캐스팅해서 사용한다.

	}
}

interface A {
	void func01();

	//B get(int i);
}

class B implements A {
	@Override
	public void func01() {
		System.out.println("b.func01()");
	}

	void func02() {
		System.out.println("b func2");
	}
}

class C implements A {
	@Override
	public void func01() {
		System.out.println("c.func01()");
	}

	void func03() {
		System.out.println("c func3");
	}
}

class D {
	void func01(LinkedList<A> list) {

		for (A item : list) {
			item.func01();
			if (item instanceof B) {
				((B)item).func02();
			} else if (item instanceof C) {
				((C)item).func03();		
			}
		}
		// ((B)list.get(0)).func02();//이렇게 하면 함수2를 쓸수있당.

		// list안에는 B타입도 c타입도 있다.
		
		//함수 콜시킬때 인수로 집어던질때
		
		
	
		
		
		
		
		
		
		
		
	}
}
