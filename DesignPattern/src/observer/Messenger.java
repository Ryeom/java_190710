package observer;

public class Messenger {
	public static void main(String[] args) {
		
		Company company = new Company();
		
		new Lion(company);
		new Muji(company);
		
		company.setMessage("www.animal.com", "�������� �������", "����", "push");
		company.setMessage("www.animal.com", "����̰��ü��� ���", "�����","pull");
		company.setMessage("www.animal.com", "���������ü��� ���", "������", "pull");
	}
}
