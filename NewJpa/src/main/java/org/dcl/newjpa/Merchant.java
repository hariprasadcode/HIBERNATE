package org.dcl.newjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(value = {@NamedQuery(name = "verify", query = "select m from Merchant m where m.email=?1 and m.password=?2"),@NamedQuery(name = "fetch", query = "select m from Merchant m")})
@Entity
public class Merchant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gst_num;
	private long phone;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGst_num() {
		return gst_num;
	}
	public void setGst_num(String gst_num) {
		this.gst_num = gst_num;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
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
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", gst_num=" + gst_num + ", phone=" + phone + ", email="
				+ email + ", password=" + password + "]";
	}
	
	

}
