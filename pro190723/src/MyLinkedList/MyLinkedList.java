package MyLinkedList;

public class MyLinkedList {
	public MyLinkedList() {
	}// �⺻ ������

	int size = 0;
	Node first;
	Node last;

	private class Node {
		Node prev;
		Object item;
		Node next;

		Node(Node prev, Object e, Node next) {
			this.prev = prev;
			this.item = e;
			this.next = next;
		}
	}

	public int size() {
		return this.size;
	}

	public void add(Object o) {
		Node l = last;
		Node new1 = new Node(l, o, null); // ��Ʈ�� �����ϸ鼭 ����

		if (last == null) { // ù����� ���
			first = new1;
		} else { // ù��� �ƴ�
			l.next = new1;
			new1.prev = l;
		}
		last = new1;

		size++;
	}

	public void outPut() {
		Node n = first;
		while (n.next != null) {
			System.out.printf(n.item.toString() + " ");
			n = n.next;
		}
		System.out.println();

		Node l = last;
		while (l.prev != null) {
			l = l.prev;
			System.out.printf(l.item.toString() + " ");
		}
		System.out.println();
	}

	public Object get(int index) {
		Object result = null;
		Node n = first;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}
		result = n.item;
		return result;
	}

	public void set(int index, Object setValue) {
		Node n = first;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}
		n.item = setValue;
	}

	public void remove() {
		Node newlast = last.prev;
		// newlast.next = last;
		last = null; // �ϴ� null�� ó���� -> ������ �ݷ��Ͱ� �˾Ƽ� ���ְ���^^7
		newlast.next = null;
		last = newlast;
		size--;
	}

	public void remove(int index) {
		Node n = first;
		Node left = null, right = null;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}

		left = n.prev;
		right = n.next;

		if (left != null && right != null) { // �߰�����
			right.prev = left;
			left.next = right;
		} else if (right == null) {// �ǵ� ����
			left.next = null;
			last = left;
			n = null;
		} else if (left == null) {// �Ǿջ���
			right.prev = null;
			first = right;
			n = null;
		}
		size--;
	}

}
