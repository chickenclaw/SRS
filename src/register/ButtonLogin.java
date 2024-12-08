package register;

import java.util.List;
import java.util.Scanner;

import database.Account;
import database.AccountList;

public class ButtonLogin {
	
	private AccountList accountList;
	private List <Account> allAccount = accountList.getAccountList();
	public boolean exist = false;
	
	public ButtonLogin(){		
	}
	
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter your account");
		String account = sc.next();		
		System.out.println("plz enter your password");
		String password = sc.next();
		Account userAccount = new Account(account, password);
		ckeck(userAccount);
	}
	
	private boolean ckeck(Account userAccount) {
		
		for(int count = 0;count < allAccount.size();count++) {
			Account currentAccount = allAccount.get(count);
			exist = userAccount.equals(currentAccount);
		}
		return exist;
	}
	
	public String toString() {
		String result;
	
		if(exist == true)
			result = "log in suceesfully";
		else {
			result = "account or password error";
		}
		return result;
	}
}
