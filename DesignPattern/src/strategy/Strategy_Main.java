package strategy;

import java.util.Scanner;

public class Strategy_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weapons_number = 0;
		Weapon wp = null;
		
		weapons_number = sc.nextInt();
		switch (weapons_number) {
		case 0:					//null
			wp = new Weapons_null();
			break;
		case 1:					//
			wp = new Staff();
			break;
		case 2:
			wp = new Sword();
			break;
		default:
			break;
		}
		System.out.println("weapon name is "+wp.getName());

	}
}
