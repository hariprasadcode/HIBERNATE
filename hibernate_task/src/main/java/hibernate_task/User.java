package hibernate_task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	@Column(name = "name",nullable=false)
	 private String name;
	@Column(name="phone", nullable = false, unique = true)
	 private long phone;
	@Column(name="email",nullable=false,unique=true)
	 private String email;
	@Column(name="password",nullable=false)
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
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ "]";
	 }
	 
	 
      
	 

}
