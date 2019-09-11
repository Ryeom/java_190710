package strategy;

public interface Weapon {
	
	public void hit();
	public String getName();

}
class Weapons_null implements Weapon{

	@Override
	public void hit() {
		System.out.println("³Î³Î");
	}

	@Override
	public String getName() {
		return "¸Ç¼Õ";
	}
	
}
class Staff implements Weapon{

	@Override
	public void hit() {
		System.out.println("½ºµ“½ºµ“");
	}

	@Override
	public String getName() {
		return "staff";
	}
	
}

class Sword implements Weapon{

	@Override
	public void hit() {
		System.out.println("Ä®Ä®");
		
	}

	@Override
	public String getName() {
		return "sword";
	}
	
}