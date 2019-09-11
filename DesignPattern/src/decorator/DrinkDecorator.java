package decorator;

abstract class DrinkDecorator extends Drink {
	protected Drink drink;

	public abstract String getName();
}

class Shot extends DrinkDecorator{
	public Shot(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String getName() {
		return "Shot  "+drink.getDrink_name();
	}

	@Override
	public int cost() {
		return 500 + drink.cost();
	}
}

class Syrup extends DrinkDecorator{
	public Syrup(Drink drink) {
		this.drink = drink;
	}

	public int cost() {
		return 300 + drink.cost();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Syrup "+drink.getDrink_name();
	}
}