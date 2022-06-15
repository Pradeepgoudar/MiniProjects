package register;

public class Member {

	private String uname,mail;
	public Member() {
		super();
	}
	public Member(String uname, String mail, String uid, String age) {
		super();
		this.uname = uname;
		this.mail = mail;
		this.uid = uid;
		this.age = age;
	}
	String uid;
	String age;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String id) {
		this.uid = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
