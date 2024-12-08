package database;

public class UniversityStudentInfo implements Basic{

	private String name;
	private String schoolID;
	private String personalID;
	private String birth;
	private String email;
	private String department;
	private String className;

	
	public UniversityStudentInfo(String aName, String aBirth, String aSchoolID, String aDepartment, String aClassName){
		setName(aName);
		setBirth(aBirth);
		setSchoolID(aSchoolID);
		setEmail();
		setDepartment(aDepartment);
		setClassName(aClassName);
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
	
	public String getBirth() {
		return birth;
	}

	public void setBirth(String aBirth) {
		birth = aBirth;
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
	
	public void setClassName(String usersClass) {
		className = usersClass;
	}
	
	public String showinfo() {
		return "Name:"+getName() + "\n" + "Birth:"+getBirth() + "\n" +"Email:"+getEmail()
		+ "\n" + "Department:"+getDepartment() + "\n" + "Class:"+className ;
	}
}
