package MyLinkedList;

public class MyLinkedList {
	public MyLinkedList() {
	}// 기본 생성자

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
		Node new1 = new Node(l, o, null); // 라스트에 연결하면서 생성

		if (last == null) { // 첫노드일 경우
			first = new1;
		} else { // 첫노드 아님
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
		last = null; // 일단 null로 처리함 -> 가비지 콜렉터가 알아서 해주게찌^^7
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

		if (left != null && right != null) { // 중간삭제
			right.prev = left;
			left.next = right;
		} else if (right == null) {// 맨뒤 삭제
			left.next = null;
			last = left;
			n = null;
		} else if (left == null) {// 맨앞삭제
			right.prev = null;
			first = right;
			n = null;
		}
		size--;
	}

}
