package database;

public class Account {
	
	private String account;
	private String password;
	
	public Account() {
		
	}
	
	public Account(String aAccount,String aPassword) {
		setAccount(aAccount);
		setPassword(aPassword);
		
	}
	public void setAccount(String aAccount) {
		account = aAccount;
		
	}
	
	public void setPassword(String aPassword) {
		password = aPassword;
		
	}
	
	public String getAccount() {
		return account;
	}
	
	public String getPasword() {
		return account;
	}
	
	public String toString() {
		return account + "\n" + password;
		
	}
    @Override
    public boolean equals(Object o) {
 
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Account)) {
            return false;
        }
         
        Account acc = (Account) o;
         
        return account.equals(acc.account)
                && password.equals(acc.password);
    }
}

