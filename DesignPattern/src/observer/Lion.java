package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Lion implements Observer, DisplayElement {

	Observable observable;
	private String photoUrl;
	private String content;
	
	private ArrayList<String> values;
	
	public Lion(Observable observable) {
		// TODO Auto-generated constructor stub
		values = new ArrayList<>();
		
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("1��° ������ : Lion");
		System.out.println("photo link : " + photoUrl);
		System.out.println("content : " + content);
		System.out.println("\n");
	}

	@Override
	public void update(Observable obs, Object values) {
		// TODO Auto-generated method stub
		if (obs instanceof Company) {
			if (values == null) { //Pull ������� Getter�Լ��� �ʿ��� ������ �����´�.
				Company company = (Company) obs;
				
				if (company.getAnimalType().equals("�����")) {
					this.photoUrl = company.getPhotoUrl();
					this.content = company.getContent();
					
					display();
					
					this.values.clear();
				}
			} else { //Push������� Subject�κ��� ������ �޾ƿ´�.
				this.values = (ArrayList<String>) values;
				
				this.photoUrl = this.values.get(0);
				this.content = this.values.get(1);
				
				display();
			}
		}
	}
}
