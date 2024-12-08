package database;

public enum Identity {
	
	Professor("P"),
	Student("S"),
	SystemManager("M");
	
	private String Permissions;
	
	Identity(String aPermissions) {
		setPermissions(aPermissions);
	}

	private void setPermissions(String aPermissions) {
		Permissions = aPermissions;
	}

	public String toString() {
		return Permissions;
	}
	
}
