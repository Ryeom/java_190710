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
		a1.func01();// func02�¾ȵȴ�.//�����ִ� �޸������� ������ ����ؾ��� ������ �Ұ���
		((B) a1).func02();// �̰Ŵ� �޸𸮰� �����ϱ� ������ ������ ĳ�����ؼ� ����Ѵ�.

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
		// ((B)list.get(0)).func02();//�̷��� �ϸ� �Լ�2�� �����ִ�.

		// list�ȿ��� BŸ�Ե� cŸ�Ե� �ִ�.
		
		//�Լ� �ݽ�ų�� �μ��� ���������
		
		
	
		
		
		
		
		
		
		
		
	}
}
