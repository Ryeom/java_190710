package strategy;

public interface Weapon {
	
	public void hit();
	public String getName();

}
class Weapons_null implements Weapon{

	@Override
	public void hit() {
		System.out.println("널널");
	}

	@Override
	public String getName() {
		return "맨손";
	}
	
}
class Staff implements Weapon{

	@Override
	public void hit() {
		System.out.println("스탶스탶");
	}

	@Override
	public String getName() {
		return "staff";
	}
	
}

class Sword implements Weapon{

	@Override
	public void hit() {
		System.out.println("칼칼");
		
	}

	@Override
	public String getName() {
		return "sword";
	}
	
}