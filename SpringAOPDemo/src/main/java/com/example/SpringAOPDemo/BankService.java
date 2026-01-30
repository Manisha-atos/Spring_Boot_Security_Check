package com.example.SpringAOPDemo;

import org.springframework.stereotype.Service;

@Service
public class BankService {

	public void depositAmount(String account, double amount) {
		System.out.println("Depositing $"+ amount + "into" + account);
	}
	
	public void withdrawAmount(String account, double amount) {
		System.out.println("Withdrawing $"+ amount + "from" + account);
	}
	
	public void transferFund(String fromAccount,String toAccount, double amount) {
		System.out.println("Transfering $"+ amount + "from" + fromAccount + "to" + toAccount);
	}
}
