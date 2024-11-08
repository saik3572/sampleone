package com.slokam.picgo.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class Cust implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  name;
  private String  email;
  private Long  phone;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}
public String getEmail() {
		return email;
	}
public void setEmail(String email) {
		this.email = email;
	}
public Long getPhone() {
		return phone;
	}
public void setPhone(Long phone) {
		this.phone = phone;
	}
}