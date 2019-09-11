package adapter;

public class Other_function {	//이미 구현되어있는 클래스

	private FunctionA functionA;
	
	public Other_function(FunctionA functionA) {
		this.functionA = functionA;
	}
}

class MyFunction{							//내가 구현할낀데
	public int myfunc01() {return 1;}
	public int myfunc02() {return 2;}
	public int myfunc03() {return 3;}
}

class Adapter implements FunctionA{			//이건 어댑터다
	private MyFunction myFunction;
	
	public Adapter(MyFunction myFunction) {		//여기서 가져와라아
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