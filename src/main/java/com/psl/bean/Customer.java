package com.psl.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component(value="customer")
public class Customer {
 
/*	private int id;
	private String name;
	private String email;
	private String contact;
	private Date dob;
	private String street;
	private String city;
	private String country;
	private String zip;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
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
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email
				+ ", dob=" + dob + ", street=" + street + ", city=" + city
				+ ", country=" + country + ", zip=" + zip + "]";
	}
	*/
	private long cifNo;
	private long accountNo;	
	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;	
	private int phone;
	private String IFSC;
	
	public Customer() {
		
	}

	public Customer(long cifNo, long accountNo, String firstName,
			String middleName, String lastName, Address address, int phone,
			String iFSC) {
		this.cifNo = cifNo;
		this.accountNo = accountNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		IFSC = iFSC;
	}

	public long getCifNo() {
		return cifNo;
	}

	public void setCifNo(long cifNo) {
		this.cifNo = cifNo;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
}
