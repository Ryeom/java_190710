package Lambda01;

public class Lambda_Main {
	public static void main(String[] args) {

		//class implements�� ����
		LogicName_Impl lni = new LogicName_Impl();
		System.out.println("1�� :"+lni.plusAandB(1, 1));
		
		
		//interface�� �͸��Լ��� ����
		System.out.println("2�� :"+new LogicName() {
			@Override
			public int plusAandB(int a, int b) {
				return a+b;
			}
		}.plusAandB(12, 10));

		
		//���ٽ� ����
		LogicName lambda = (a, b) -> {
			return a + b;
		};
		System.out.println("3�� :"+lambda.plusAandB(202, 20));
		
		/* ********************************************************************** */
		
		LogicOne l1 = () -> { System.out.println("���ڰ� ���� �Լ� ����"); };  
		
		LogicTwo lo1 = (int a) -> { System.out.println("a:" + a); };
		LogicTwo lo2 = (a) -> { System.out.println("a:" + a); };    // �Ű����� �ڷ��� ����

		LogicThree ln1 = (int a, int b) -> { System.out.println("a+b:" + (a + b) ); };
		LogicThree ln2 = (a, b) -> { System.out.println("a+b:" + (a + b) ); };   // �Ű����� �ڷ��� ����

		LogicFour lo3 = a -> { return "a:" +  a; };
		LogicFour lo4 = a -> "a:" + a;      // �Լ��� ���๮ �Ѱ�, ���Ϲ��� ����� �߰�ȣ, return�� �Ѵ� ��������

		LogicFive ln3 = a -> { System.out.println("a:" + a); };    //�Ű����ڰ� �ϳ��� �Ұ�ȣ ����
		LogicFive ln4 = a -> System.out.println("a:" + a);    //�Լ��� ���๮�� �ϳ��� �߰�ȣ�� ����
		
		LogicSix ln5 = (int a,String b) -> { return a+"���Դϴ�."+b; };
		LogicSix ln6 = (a,b) -> { return a+"���Դϴ�."+b; };
		
		//this�� �Ẹ��
		//LogicSeven ln7 = 
				
		
		
}

}