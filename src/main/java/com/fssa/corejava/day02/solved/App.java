package com.fssa.corejava.day02.solved;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create Account
		BankAccount acct1 = new BankAccount();
		acct1.setAccNo("A101");
		acct1.setName("Krishna");
		acct1.setBalance(1000);

		System.out.println(acct1.getAccNo());
		System.out.println(acct1.getName());
		System.out.println(acct1.getBalance());
	}

}
