package domain;

import java.util.ArrayList;
import java.util.List;

public class User {

	public User(){
		roles = new ArrayList<Role>();
	}
	private String login;
	private String password;
	private String profilName;
	private String changePass;
	private String addressEmail;
	private String userRank;
	private List<Role> roles;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfilName() {
		return profilName;
	}
	public void setProfilName(String profilName) {
		this.profilName = profilName;
	}
	public String getChangePass() {
		return changePass;
	}
	public void setChangePass(String changePass) {
		this.changePass = changePass;
	}
	public String getAddressEmail() {
		return addressEmail;
	}
	public void setAddressEmail(String addressEmail) {
		this.addressEmail = addressEmail;
	}
	public String getUserRank() {
		return userRank;
	}
	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
