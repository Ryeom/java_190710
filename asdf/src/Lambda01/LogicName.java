package Lambda01;

public interface LogicName {

	public int plusAandB(int a, int b);
}

class LogicName_Impl implements LogicName {
	@Override
	public int plusAandB(int a, int b) {
		return a + b;
	}

}

interface LogicOne {
	public void returnNo();
}

interface LogicTwo {
	public void One(int a);
}
interface LogicThree {
	public void returnNN(int a, int b);
}
interface LogicFour {
	public String returnString(int a);
}
interface LogicFive {
	public void returnNo(int a);
}

@FunctionalInterface
interface LogicSix {
	public String returnStrings(int a,String b);
	//public void returnNo(int a);
}

