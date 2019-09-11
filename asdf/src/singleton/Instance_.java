package singleton;

public class Instance_ {
	private static Instance_ i;	//singleton���� ���ž�

	private Instance_() {
	}

	public static Instance_ getInstance() {
		if (i == null) {
			i = new Instance_();
		}
		return i;
	}
}
