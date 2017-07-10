package com.cn.model;

public class User {
  private Long id;
 private String useName;
 private String password;
 private String age;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUseName() {
	return useName;
}
public void setUseName(String useName) {
	this.useName = useName;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
 
}
