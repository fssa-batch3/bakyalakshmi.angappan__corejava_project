package com.fssa.corejava.day05.practice;

public class IciciATM implements ATM {
	private static final double EXTRA_CHARGES = 10d;

	@Override
	public boolean deposit(Account account, double amount) {

		if (amount <= 0) {
			System.out.println("Invalid amount to deposit");
			return false;
		}
		account.setBalance(account.getBalance() + amount);

		System.out.println("deposited succesfully");
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {

		if (amount <= 0) {
			System.out.println("invalid amount to withdraw");
			return false;
		}

		if (amount + EXTRA_CHARGES > account.getBalance() || account.getBalance() < 10000) {
			throw new Exception("Insufficient funds.");
		}

		account.setBalance(account.getBalance() - amount - EXTRA_CHARGES);
		System.out.println("succesfully withdrawn");
		return true;
	}

	@Override
	public double getBalance(Account account) {
		return account.getBalance();
	}
}
