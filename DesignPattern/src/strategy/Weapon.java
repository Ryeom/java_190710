package strategy;

public interface Weapon {
	
	public void hit();
	public String getName();

}
class Weapons_null implements Weapon{

	@Override
	public void hit() {
		System.out.println("�γ�");
	}

	@Override
	public String getName() {
		return "�Ǽ�";
	}
	
}
class Staff implements Weapon{

	@Override
	public void hit() {
		System.out.println("��������");
	}

	@Override
	public String getName() {
		return "staff";
	}
	
}

class Sword implements Weapon{

	@Override
	public void hit() {
		System.out.println("ĮĮ");
		
	}

	@Override
	public String getName() {
		return "sword";
	}
	
}