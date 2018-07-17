package com.zsc.entity;

import java.sql.Timestamp;
import java.util.Date;

public class User {
	int id;
	String username;
	String password;
	String email;
	String phone;
	String image;
	int role;
	Date create_time;
	Date update_time;

	public User() {
		super();
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.role = 1;

		Date date = new Date();
		Timestamp t = new Timestamp(date.getTime());
		this.create_time = t;
		this.update_time = t;
	}

	public User(int id, String username, String password, String email, String phone, String image, int role, Date create_time, Date update_time) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.image = image;
		this.role = role;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", image='" + image + '\'' +
				", role=" + role +
				", create_time=" + create_time +
				", update_time=" + update_time +
				'}';
	}
}
