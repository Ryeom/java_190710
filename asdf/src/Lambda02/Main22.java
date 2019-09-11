package Lambda02;

interface Cal {
	public int method1(int x, int y);
}

public class Main22 {
	public static void main(String[] args) {
		
		Cal c = Math::max;
		System.out.println(c.method1(10, 30));
		
	}

}
