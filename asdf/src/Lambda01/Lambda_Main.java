package Lambda01;

public class Lambda_Main {
	public static void main(String[] args) {

		//class implements로 구현
		LogicName_Impl lni = new LogicName_Impl();
		System.out.println("1번 :"+lni.plusAandB(1, 1));
		
		
		//interface를 익명함수로 구현
		System.out.println("2번 :"+new LogicName() {
			@Override
			public int plusAandB(int a, int b) {
				return a+b;
			}
		}.plusAandB(12, 10));

		
		//람다식 구현
		LogicName lambda = (a, b) -> {
			return a + b;
		};
		System.out.println("3번 :"+lambda.plusAandB(202, 20));
		
		/* ********************************************************************** */
		
		LogicOne l1 = () -> { System.out.println("인자가 없는 함수 구현"); };  
		
		LogicTwo lo1 = (int a) -> { System.out.println("a:" + a); };
		LogicTwo lo2 = (a) -> { System.out.println("a:" + a); };    // 매개인자 자료형 생략

		LogicThree ln1 = (int a, int b) -> { System.out.println("a+b:" + (a + b) ); };
		LogicThree ln2 = (a, b) -> { System.out.println("a+b:" + (a + b) ); };   // 매개인자 자료형 생략

		LogicFour lo3 = a -> { return "a:" +  a; };
		LogicFour lo4 = a -> "a:" + a;      // 함수의 실행문 한개, 리턴문만 존재시 중괄호, return문 둘다 생략가능

		LogicFive ln3 = a -> { System.out.println("a:" + a); };    //매개인자가 하나라서 소괄호 생략
		LogicFive ln4 = a -> System.out.println("a:" + a);    //함수의 실행문이 하나라서 중괄호를 생략
		
		LogicSix ln5 = (int a,String b) -> { return a+"개입니다."+b; };
		LogicSix ln6 = (a,b) -> { return a+"개입니다."+b; };
		
		//this를 써보께
		//LogicSeven ln7 = 
				
		
		
}

}