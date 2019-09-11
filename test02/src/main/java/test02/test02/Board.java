package test02.test02;


public class Board {//bean설정

	
	private int sub_no;


	private String subject;
	private String user_id;
	private String user_pw;
	private String write_date;
	private String content;
	
	public Board() {}

	public Board( String subject, String user_id, String user_pw, String write_date, String content) {
		
		this.subject = subject;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.write_date = write_date;
		this.content = content;
	}
	
	public int getSub_no() {
		return sub_no;
	}
	public void setSub_no(int sub_no) {
		this.sub_no = sub_no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public String toString() {
		return "Board [sub_no=" + sub_no + ", subject=" + subject + ", user_id=" + user_id + ", user_pw=" + user_pw
				+ ", write_date=" + write_date + ", content=" + content + "]";
	}
	
	
	
}
