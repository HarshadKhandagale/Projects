package com.org2;

public class User {

	
	public int id;
	public String uname;
	public String pass;
	public String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String uname, String pass, String email) {
		super();
		this.id = id;
		this.uname = uname;
		this.pass = pass;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", pass=" + pass + ", email=" + email + "]";
	}
	
	
}
