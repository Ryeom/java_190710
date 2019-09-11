package decorator;

abstract class Drink {

	protected String drink_name = "";

	public abstract int cost();


	public String getDrink_name() {
		return drink_name;
	}

	public void setDrink_name(String drink_name) {
		this.drink_name = drink_name;
	}

}
