package com.gn.study.model.vo;

public class Account {
	private String user;
	private int balance;
	
	public Account() {}
	
	public Account(String user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	//5.
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount > balance) {
			// 4.
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
		balance -= amount;
		System.out.println(amount+"원이 출금됐습니다.");
	}
}
