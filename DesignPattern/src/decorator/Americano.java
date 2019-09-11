package decorator;


class Americano extends Drink{		//Drink Decorator
	
	Americano() {
		super();
		super.drink_name = "Americano";
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 4000;
	}
}
