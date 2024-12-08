package database;

public class ProfessorInfo implements Basic{

	private String name;
	private String schoolID;
	private String personalID;
	private String email;
	private String department;
	private String academic;
	
	public ProfessorInfo(String aName, String aSchoolID, String aDepartment, String aAcademic){
		setName(aName);
		setSchoolID(aSchoolID);
		setEmail();
		setDepartment(aDepartment);
		setAcademic(aAcademic);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}
	
	public void setSchoolID(String aSchoolID) {
		schoolID = aSchoolID;
	}

	public String getSchoolID() {
		return schoolID;
	}
	
	public String getPersonalID() {
		return personalID;
	}

	public void setPersonalID(String aPersonalID) {
		personalID = aPersonalID;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail() {
		email = schoolID + "@go.utaipei.edu.tw";
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String aDepartment) {
		department = aDepartment;
	}
	
	public String getAcademic() {
		return academic;
	}


	public void setAcademic(String aAcademic) {
		academic = aAcademic;
	}


	public String showinfo() {
		return "Name:"+getName() + "\n" +"Email:"+getEmail()
		+ "\n" + "Department:"+getDepartment() + "\n" + "academic:"+academic;
	}
}
