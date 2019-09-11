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
			notifyObservers(); //Pull ��� - Observer�鿡�� ������ ���۾��� ���� ��ȣ�� ����
		}else if (type.equals("push")){
			notifyObservers(values); //Push ��� - Observer�鿡�� ���� ��� ������ ����
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
