package database;

public class Professor extends SchoolMember{
	
	
	public Professor(String aName, String aSchoolID, String aDepartment, String aAcademic){
		
		info = new ProfessorInfo(aName,aSchoolID,aDepartment,aAcademic);
	}

	@Override
	public void display() {
		System.out.println(info.showinfo());
	}
}

