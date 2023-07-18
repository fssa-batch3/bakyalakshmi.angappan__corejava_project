package com.fssa.corejava.day05.practice;

public class App {

	public static void main(String[] args) throws Exception {

//		for axis atm

		System.out.println("axis atm");
		Account account = new Account("a209839123234", 20000);
		AxisATM axisAtm = new AxisATM();
		axisAtm.deposit(account, 10000);

		System.out.println("Balance amount :" + account.getBalance(account));

		try {
			axisAtm.withdraw(account, 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Balance amount :" + account.getBalance(account));

//		for icici atm

		System.out.println("icici atm");
		Account account2 = new Account("a000csd", 20000);
		IciciATM iciciAtm = new IciciATM();
		iciciAtm.deposit(account, 10000);

		System.out.println("Balance amount :" + account.getBalance(account));

		try {
			iciciAtm.withdraw(account, 10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Balance amount :" + account.getBalance(account));

	}

}
