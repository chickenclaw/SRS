package register;

import java.util.Scanner;

import database.Account;
import database.AccountList;

public class ButtonSignup {
	
	private Account a;  
	private AccountList accountList = new AccountList();
	public ButtonSignup() {
	}
	
	public void inputAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter your account");
		String account = sc.next();
		System.out.println("plz enter your password");
		String password = sc.next();
		a = new Account(account, password);
		accountList.restoreAccount(a);
		accountList.show();
	}
}
