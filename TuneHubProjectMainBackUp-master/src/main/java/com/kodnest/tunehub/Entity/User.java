package com.kodnest.tunehub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;

	private String username;
	private String email;
	private String password;
	private String gender;
	private String role;
	private String address;
	private boolean premium; // Primitive type
    private String resetToken; // Add a new field for reset token

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getPremium() {
		return premium;
	}
	public void setPremium(Boolean premium) {
		this.premium = premium;
	}
	
	 // Getter and Setter for resetToken
    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username, String email, String password, String gender, String role, String address,
			boolean premium, String resetToken) {
		super();
		this.userid = userid;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.premium = premium;
		this.resetToken = resetToken;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", role=" + role + ", address=" + address + ", premium=" + premium
				+ ", resetToken=" + resetToken + "]";
	}
	

	
	
}
