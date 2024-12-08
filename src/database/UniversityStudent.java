package database;

public class UniversityStudent extends SchoolMember {
	
	
	public UniversityStudent(String aName, String aBirth, String aSchoolID, String aDepartment, String aClassName){
		info = new UniversityStudentInfo(aName,aBirth,aSchoolID,aDepartment,aClassName);
	}
	
	@Override
	public void display() {
		System.out.println(info.showinfo());
	}
}
