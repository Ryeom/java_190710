package Lambda;

public class Main_ {
	public static void main(String[] args) {
		/*
		//���� 1
		
		Apple a = new Apple() {
			@Override
			public String func01() {
				return "����";
			}
		};
		
		Apple a1 = () -> {
			return "����";
		};
		
		System.out.println(a1.func01());
		*/
		
		/*
		//���ٽ��� "�� Ŭ������"�� �ַο�� ���帣��
		Apple a = () -> {
				return "����";
		};
		
		Apple a1 = () -> {
			return "����";
		};
		
		System.out.println(a1.func01());
		*/
		
		//�Լ��� �׻� 4���� �����̴�
		
//		Apple a = (num) ->{
//			System.out.println("asdf");
//		};
		
//		Apple b = num ->{		//�μ������� 1���϶���! ()�Ұ�ȣ�� �����Ҽ��ִ�.
//			System.out.println("asdf");
//		};
		// ��ȣ�� ĥ���� ��ĥ���� ��� �� ��ȣ�ɱ�?
		// �Ϲ������� �� ġ�ڶ�� �ϸ� �������� ��ȣ�� �� ���·� ���� ���´�.
		
		
//		Apple c = num -> System.out.println("asdf");
		//����Ǵ� �ҽ��ڵ尡 �ܹ����� ��� �������� �����Ҽ��ִ�.
		
//		Apple d = num -> System.out.println("asdf");System.out.println("asdf�̰�?");
		//���ٽ����� �ι����� ���ٷ� ���´ٰ� �ϴ��� �����Ϸ��� �ν��� �ι�°������ ���ٽ��� �ƴ� ������ �ؼ��Ѵ�.
		
		//System.out.println(a.func01(0));
		
//		Apple a = (n,s) -> {
//			System.out.println(s+"��"+n);
//		};
		
		
//		Apple a = () ->{return "����";};
		
//		Apple b = () -> "���";//������ ������ ���ϵ� ���� ������ *�߿�*
		//���������� �ؿ����� �� ���� ���´�. 
		
		//Apple cc = () -> "100" -> "200";
		//�̰� �յ�?
		
		//Apple ccc = () ->{ return {return "100"} -> {return "200";} };//�Լ��ȿ� �Լ��� �ִ�. IIFE		
		
		
//		Apple a = (s) -> "ss"+s;
//		
//		Apple b = s -> "ss"+s;
		
//		System.out.println(a.func01("asdf"));
		
//		System.out.println(b.func01("dfd"));
		
		//�Լ��� �μ��� �ڵ带 �����Ѵ� : ���ٽ��� ����
		
		
		Banana b = new Banana() {
			public void func01(int n, String s){
				System.out.println(n+"/"+s);
			}
		};
		
		b.func02(new Apple_() {
			@Override
			public void func01(int n, String s) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Apple_ a;
		b.func02(a = (n,s) ->  {
			System.out.println(n+"/"+s);	
		});
		
		b.func02((n,s)->{
			System.out.println(n+"/"+s);
		});
		
		
		
		
		
	}
	
		
}

interface Apple_ {
	public void func01(int n, String s);
}

class Banana{
	public void func02(Apple_ a) {
		a.func01(222, "����");
	}
}
