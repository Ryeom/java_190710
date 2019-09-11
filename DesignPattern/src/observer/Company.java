package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Company extends Observable {

	private String photoUrl;
	private String content;
	private String animalType;
	private ArrayList<String> values;
	
	public Company() {
		values = new ArrayList<>();
	}
	
	public void messageChanged(String type) {
		setChanged();
		if (type.equals("pull")) {
			notifyObservers(); //Pull 방법 - Observer들에게 데이터 전송없이 변경 신호만 전송
		}else if (type.equals("push")){
			notifyObservers(values); //Push 방법 - Observer들에게 받은 모든 데이터 전송
			values.clear();
		}
	}
	
	public void setMessage(String photoUrl, String content,
			String animalType,String type) {
		this.photoUrl = photoUrl;
		this.content = content;
		this.animalType = animalType;
		
		values.add(photoUrl);
		values.add(content);
		
		messageChanged(type);
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getAnimalType() {
		return animalType;
	}
}
