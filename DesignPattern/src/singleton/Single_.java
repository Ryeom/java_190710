package singleton;

public class Single_ {

	private static class holder{	//ÁßÃ¸Å¬·¡½º
		static final Single_ Instance__ = new Single_();
	}
	
	public static Single_ getInstance() {
		return holder.Instance__;
	}
}
