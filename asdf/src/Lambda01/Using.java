package Lambda01;

public class Using {
	public int outter = 10;	
	
	class Inner {
		int inner = 20;
		void method() {
			LogicSeven ln7 = () ->{
				System.out.println("outter :"+outter);				//�ȿ��� ����
				//�ٱ� ��ü ������ ��� ���ؼ��� Ŭ������.this�� ����϶�
				System.out.println("outter :"+Using.this.outter);
				//�ƿ��� Ŭ������ ������ ����ϰ� ���� �� �̷��� ����ϸ� �ȴ�.
				
				System.out.println("outter :"+inner);				//this�� �Ȱ���
				System.out.println("outter :"+this.inner);			//�Լ��μ��� class������ �����ϱ� ���ؼ� this�� ���
			};
			ln7.returnNono();
		}
	}
}
@FunctionalInterface
interface LogicSeven {
	public void returnNono();
}