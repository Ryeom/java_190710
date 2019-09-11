package adapter;

public class Other_function {	//�̹� �����Ǿ��ִ� Ŭ����

	private FunctionA functionA;
	
	public Other_function(FunctionA functionA) {
		this.functionA = functionA;
	}
}

class MyFunction{							//���� �����ҳ���
	public int myfunc01() {return 1;}
	public int myfunc02() {return 2;}
	public int myfunc03() {return 3;}
}

class Adapter implements FunctionA{			//�̰� ����ʹ�
	private MyFunction myFunction;
	
	public Adapter(MyFunction myFunction) {		//���⼭ �����Ͷ��
		this.myFunction = myFunction;
	}

	@Override
	public int func1() {
		return myFunction.myfunc01();
	}

	@Override
	public int func2() {
		return myFunction.myfunc02();
	}
}