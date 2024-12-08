package database;

public class Course {
	
	private String coursePriority;
	private String courseName;
	private String courseId;
	private String courseTime;
	private String courseProfessor;
	private String classroom;
	private int semester;
	private int year;
	private int credit;
	
	public Course(String aCourseName, String aCoursePriority, String aCourseId, String aCourseTime, String aCourseProfessor, String aClassroom, int aYear, int aSemester, int aCredit) {
		setCourseName(aCourseName);
		setCoursePriority(aCoursePriority);
		setCourseId(aCourseId);
		setCourseTime(aCourseTime);
		setCourseProfessor(aCourseProfessor);
		setClassroom(aClassroom);
		setYear(aYear);
		setSemester(aSemester);
		setCredit(aCredit);
	}

	public String getCoursePriority() {
		return coursePriority;
	}
	
	public void setCoursePriority(String coursePriority) {
		this.coursePriority = coursePriority;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseTime() {
		return courseTime;
	}
	
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	
	public String getCourseProfessor() {
		return courseProfessor;
	}
	
	public void setCourseProfessor(String courseProfessor) {
		this.courseProfessor = courseProfessor;
	}	
	
	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String toString() {
		return getCourseName()+" "+getCoursePriority()+" "+getCourseId()
		+" "+getCourseTime()+" "+getCourseProfessor()+" "+
		getClassroom()+" "+getYear()+"-"+getSemester()+" "+getCredit();
	}
}
