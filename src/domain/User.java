package domain;

public class User {
	private String username;
	private String password;//这里的名字和表单中的name属性的名字要一致
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
