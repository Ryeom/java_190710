package decorator;

public class Decorator_Main {
	public static void main(String[] args) {
		
		Drink ame = new Americano();
		
		ame= new Shot(ame);
		ame = new Syrup(ame);
		
		System.out.println(ame.getDrink_name());
		System.out.println(ame.cost());
	}
}
