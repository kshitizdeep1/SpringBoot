	package com.user;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Repository;

//@Author Madhushree, Shiva, Sania, Ashwathi
@SequenceGenerator(name="port",sequenceName="port",initialValue=1000)

@Entity(name="User")
public class User
{  
	
	public User( String firstName, String lastName, String gender, String email, String password, int age,
			long phoneNo, String address) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", age=" + age + ", phoneNo=" + phoneNo + ", address="
				+ address + "]";
	}
	@GeneratedValue(strategy=GenerationType.AUTO,generator="port")
	@Id
	@Column(name="user_Id",nullable=false)
	private Long userId;

	@Column(name="first_Name",nullable=false)
	private String firstName;
	
	@Column(name="last_Name" ,nullable=false)
	private String lastName;
	@Column(nullable=false)
	private  String gender;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private int age;
	@Column(nullable=false)
	private long phoneNo;
	@Column(nullable=false)
	private String address;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
