package MyLinkedList;


public class Test {
	public static void main(String[] args) {
		MyLinkedList ml = new MyLinkedList();
		ml.add(1);
		ml.add(2);
		ml.add(3);
		ml.add(4);
		ml.add(5);
		ml.add(6);
		ml.add(7);
		ml.add(8);
		ml.add(9);
		ml.outPut();// @@
		System.out.println("----------------size : "+ml.size+" | get "+ml.get(6)+"�������");
		
		
		ml.set(1, 'T');
		ml.outPut();// @@
		System.out.println("----------------size : "+ml.size+" | get "+ml.get(7)+"T����");
		ml.remove();
		ml.outPut();// @@
		System.out.println("----------------size : "+ml.size+" | get "+ml.get(0)+"�ǵڻ���");
		
		ml.remove(3);//4����
		ml.outPut();// @@
		System.out.println("----------------size : "+ml.size+" | get "+ml.get(0)+"4����");
	}
}
