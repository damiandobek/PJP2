package domain;

import java.util.ArrayList;
import java.util.List;

public class Role extends Entity{

	public Role(){
		user = new ArrayList<User>();
		privileges = new ArrayList<Privilage>();
	}
	
	private String name;
	private List<User> user;
	private List<Privilage> privileges;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public List<Privilage> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<Privilage> privileges) {
		this.privileges = privileges;
	}
	
	
	
}
