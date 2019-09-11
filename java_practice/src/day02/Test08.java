package day02;

public class Test08 {
	public static void main(String[] args) {
		Janggi janggi = new Janggi(new Alpago());

		janggi.start();
		janggi.play();
		janggi.end();
		System.out.println("----");

		Janggi janggib = new Janggi(new Betago());

		janggib.start();
		janggib.play();
		janggib.end();

	}
}

interface Game {

	void start();

	void play();

	void end();

}

class Badook implements Game {
	Aiplayer aiplayer;

	Badook() {
	}

	Badook(Aiplayer aiplayer) {
		this.aiplayer = aiplayer;
	}
	public void start() {
		System.out.println("�ٵϾ� �����Ծ�");
	}

	public void play() {
		System.out.println("�ٵϾ� �����߾�");
	}

	public void end() {
		System.out.println("�ٵ� ������");
	}

	void pan() { 
		this.start();
		this.play();
		this.end();
	}

}

class Janggi implements Game {
	Aiplayer aiplayer;

	Janggi() {
	}

	Janggi(Aiplayer aiplayer) {
		this.aiplayer = aiplayer;
	}

	public void start() {
		// aiplayer.func01();
		// System.out.print(aiplayer.name);
		System.out.println("�뱹 �����Ծ�");
	}

	public void play() {
		// System.out.print(aiplayer.name);
		System.out.println("�뱹 �����߾�");
	}

	public void end() {
		// System.out.print(aiplayer.name);
		System.out.println("�뱹 ������");
	}

	void pan() { // ���丮 �Լ� : ���ϴ� ��� �Լ��� ���δ� �����Բ� �������ִ� �Լ�
		this.start();
		this.play();
		this.end();
	}
}

interface Aiplayer {

	public void func01();
}

class Alpago implements Aiplayer {
	String name;

	Alpago() {
		this.name = "alpa";
	}

	public void func01() {
		System.out.println("�� �̷��� ���İ�");
	}
}

class Betago implements Aiplayer {
	String name;

	Betago() {
		this.name = "beta";
	}

	public void func01() {
		System.out.println("�� �̷��� ��Ÿ��");
	}

}
/*
 * abstract class Animal{ Animal(){}
 * 
 * abstract void func01(); void func02() { System.out.println("�� �Լ� ����� ����"); }
 * } class Dogg { Dogg(){} void func01() { System.out.println("���"); } void
 * func02() {
 * 
 * }
 * 
 * void func03() { System.out.println("��� ����"); } }
 */

interface Animal { // �������̽��� �ȿ��ִ°� ������ �߻��Լ�
	void func01();

	void func02();

}

class Dogg implements Animal {
	Dogg() {
	}

	public void func01() {
		System.out.println("���");
	}

	public void func02() {

	}

}