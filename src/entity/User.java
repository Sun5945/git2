package entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 6976535090808462173L;
	private int uid;
	private String username;
	private String password;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
