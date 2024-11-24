package com.cjc.bms.model;

public class Account {
	private int accNo;
	private String name;
	private long mobno;
	private long adharNo;
	private String gender;
	private byte age;
	private double balance;
	private String Username;
	private String Password;

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getAccNo() {
		return accNo;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

}
