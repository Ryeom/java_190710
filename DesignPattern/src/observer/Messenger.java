package observer;

public class Messenger {
	public static void main(String[] args) {
		
		Company company = new Company();
		
		new Lion(company);
		new Muji(company);
		
		company.setMessage("www.animal.com", "동물서적 할인행사", "동물", "push");
		company.setMessage("www.animal.com", "고양이관련서적 행사", "고양이","pull");
		company.setMessage("www.animal.com", "강아지관련서적 행사", "강아지", "pull");
	}
}
