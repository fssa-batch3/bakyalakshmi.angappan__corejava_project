package com.fssa.corejava.day05.practice;

//Change the below class to have setters and Getters and Constructors
class Account implements ATM {

	private String accNo;

	private double balance;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {

		return false;
	}

	public Account(String accNo, double balance) {

		this.accNo = accNo;
		this.balance = balance;

	}

	@Override
	public double getBalance(Account account) {
		// TODO Auto-generated method stub
		return this.getBalance();
	}

}
