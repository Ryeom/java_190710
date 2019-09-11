package singleton;

public class Singleton {
	/*
	private static Singleton only_one;
	
	private Singleton() {}
	
	public static Singleton getInstance() {	//3��° synchronized 
		if(only_one==null) {
			only_one = new Singleton();
		}
		return only_one;
	}
	*/
	
	private static Singleton only_one;
	
	private Singleton() {}
	
	public static Singleton getInstance() {	//1��° ���. 3��° ������ synchronized �߰� 
		if(only_one==null) {
			synchronized (Singleton.class) {//2��° ���. �̷��� ��ũ�γ����� �ѹ���!
				if(only_one==null){
					only_one = new Singleton();
				}
				
			}
		}
		return only_one;
	}
	
}
class Singleton_Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);

	}
}