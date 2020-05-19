package entity;

public class User {
	//
	private String loginId;
	private String password;
	private String name;
	
	public User() {
		//empty
	}
	
	public User(String loginId, String password, String name) {
		//
		this.loginId = loginId;
		this.password = password;
		this.name = name;
	}
	
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
