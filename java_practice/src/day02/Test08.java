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
		System.out.println("바둑쓰 시작함쓰");
	}

	public void play() {
		System.out.println("바둑쓰 진행중쓰");
	}

	public void end() {
		System.out.println("바둑 ㅃㅃㅆ");
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
		System.out.println("대국 시작함쓰");
	}

	public void play() {
		// System.out.print(aiplayer.name);
		System.out.println("대국 진행중쓰");
	}

	public void end() {
		// System.out.print(aiplayer.name);
		System.out.println("대국 ㅃㅃㅆ");
	}

	void pan() { // 팩토리 함수 : 원하는 모든 함수가 전부다 나오게끔 세팅해주는 함수
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
		System.out.println("눼 이룸은 알파고");
	}
}

class Betago implements Aiplayer {
	String name;

	Betago() {
		this.name = "beta";
	}

	public void func01() {
		System.out.println("눼 이룸은 붸타고");
	}

}
/*
 * abstract class Animal{ Animal(){}
 * 
 * abstract void func01(); void func02() { System.out.println("걍 함수 펑션투 동물"); }
 * } class Dogg { Dogg(){} void func01() { System.out.println("댕댕"); } void
 * func02() {
 * 
 * }
 * 
 * void func03() { System.out.println("댕댕 츄르츄르"); } }
 */

interface Animal { // 인터페이스는 안에있는거 무조건 추상함수
	void func01();

	void func02();

}

class Dogg implements Animal {
	Dogg() {
	}

	public void func01() {
		System.out.println("댕댕");
	}

	public void func02() {

	}

}