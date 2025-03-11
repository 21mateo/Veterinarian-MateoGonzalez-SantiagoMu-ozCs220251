package app.domain.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class user {
	private long id;
	private person personId;
	private String password;
	private String userName;
	private String role;
	
	public user(long id, person personId, String password, String userName, String role) {
		super();
		this.id = id;
		this.personId = personId;
		this.password = password;
		this.userName = userName;
		this.role = role;
	}

	public user() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public person getPersonid() {
		return personId;
	}

	public void setPersonid(person personid) {
		this.personId = personid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
