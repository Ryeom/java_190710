package Lambda01;

public class Using {
	public int outter = 10;	
	
	class Inner {
		int inner = 20;
		void method() {
			LogicSeven ln7 = () ->{
				System.out.println("outter :"+outter);				//안에꺼 참조
				//바깥 객체 참조를 얻기 위해서는 클래스명.this를 사용하라
				System.out.println("outter :"+Using.this.outter);
				//아우터 클래스의 변수를 사용하고 싶을 때 이렇게 사용하면 된다.
				
				System.out.println("outter :"+inner);				//this랑 똑같음
				System.out.println("outter :"+this.inner);			//함수인수와 class변수와 구분하기 위해서 this를 사용
			};
			ln7.returnNono();
		}
	}
}
@FunctionalInterface
interface LogicSeven {
	public void returnNono();
}