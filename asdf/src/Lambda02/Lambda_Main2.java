package Lambda02;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class Lambda_Main2 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Function<String, Boolean> func = (a) -> obj.equals(a); // ���� ǥ����
		
		//Function<String, Boolean> func = obj::equals(a);       // �޼ҵ� ����
		
		Function<Integer, double[]> func1 = a -> new double[a]; // ���� ǥ����\
		Function<Integer, double[]> func2 = double[]::new;      // ������ ����
		
		
		
		/* **************************** */
		DoubleUnaryOperator oper;

		oper = (n) -> Math.abs(n); // ���� ǥ����
		System.out.println(oper.applyAsDouble(-5));//���� ��� : 5.0

		oper = Math::abs; // �޼ҵ� ����
		System.out.println(oper.applyAsDouble(-5));//���� ��� : 5.0
	}
}
