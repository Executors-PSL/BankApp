package com.psl.bean;
import org.springframework.stereotype.Component;

@Component(value="customer")
public class Customer {
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
