package database;

import java.util.ArrayList;
import java.util.List;

public class AccountList {

    private static List<Account> accountList = new ArrayList<Account>();
    
	public void restoreAccount(Account a) {
		accountList.add(a);
	}
	
    public static List<Account> getAccountList() {
		return accountList;
	}
    
    public void show() {
    	Account b;
    	for(int count = 0;count < accountList.size();count++) {
    		 b = accountList.get(count);
    		 System.out.println(b);
    	}
    }
}
