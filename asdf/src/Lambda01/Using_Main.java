package Lambda01;

public class Using_Main {
	public static void main(String[] args) {
		Using using = new Using();

		Using.Inner inner = using.new Inner();

		inner.method();
	}
}
