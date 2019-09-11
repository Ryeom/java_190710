package Lambda02;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class Lambda_Main2 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Function<String, Boolean> func = (a) -> obj.equals(a); // 람다 표현식
		
		//Function<String, Boolean> func = obj::equals(a);       // 메소드 참조
		
		Function<Integer, double[]> func1 = a -> new double[a]; // 람다 표현식\
		Function<Integer, double[]> func2 = double[]::new;      // 생성자 참조
		
		
		
		/* **************************** */
		DoubleUnaryOperator oper;

		oper = (n) -> Math.abs(n); // 람다 표현식
		System.out.println(oper.applyAsDouble(-5));//실행 결과 : 5.0

		oper = Math::abs; // 메소드 참조
		System.out.println(oper.applyAsDouble(-5));//실행 결과 : 5.0
	}
}
