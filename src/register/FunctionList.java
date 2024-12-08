package register;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import database.Course;
import database.CourseList;
import database.Identity;
import database.Professor;
import database.SchoolMember;
import database.UniversityStudent;

public class FunctionList {

	private Identity identity;
	private SchoolMember person1;
	private SchoolMember person2;
	private String solution;
	private CourseList courseLs = new CourseList();
	private Scanner sc = new Scanner(System.in);
	private List<Course> currentCourseList = courseLs.getCourseList();
	private List<Course> userCourseList = new ArrayList<Course>();

	
	public FunctionList() {
		
	}
	
	public void comfirmPermission(String aIdentity) {
		switch (aIdentity){
		case "P":
			identity = Identity.Professor;
			break;
		case "G":case "U":
			identity = Identity.Student;
			break;
		case "S":
			identity = Identity.SystemManager;
			
		}
	}
	
	public void inputInfo(String aName, String aBirth, String aSchoolID, String aDepartment, String aClassName) {
		//Name, Birth, SchoolID, Department, ClassName
		person1 = new UniversityStudent(aName,aBirth,aSchoolID,aDepartment,aClassName);
		solution = "UniversityStudent";
	}
	
	public void inputInfo(String aName, String aSchoolID, String aDepartment, String aAcademic) {
		//Name,Birth,Department,Academic
		person2 = new Professor(aName,aSchoolID,aDepartment,aAcademic);
		solution = "Professor";
	}
	
	public void inputInfo(UniversityStudent aUniversityStudent) {
		//Name, Birth, SchoolID, Department, ClassName
		person1 = aUniversityStudent;
		solution = "UniversityStudent";
	}
	
	public void inputInfo(Professor aProfessor) {
		//Name,Birth,Department,Academic
		person2 = aProfessor;
		solution = "Professor";

	}
	
	public void showinfo() {
		if(solution == "UniversityStudent")
			person1.display();
		else
			person2.display();
	}
	
	public void showCourseList() {
		courseLs.show();
	}
	
	public void chooseCourse() {

		System.out.println("plz enter number of course which you want to choose");
		int courseIndex =sc.nextInt();
		Course choosenCourse = currentCourseList.get(courseIndex);
		userCourseList.add(choosenCourse);
		System.out.println("there is your current CourseList");
		for(int count = 0;count < userCourseList.size();count++) {
			System.out.println(userCourseList.get(count));
		}
	}
	
	public void appendCourses() {
		if(identity == Identity.Student) {
			System.out.println("your Permissions can't use this Function");
		}else {
			System.out.println("plz enter coursePriority,courseName......");
			//coursePriority,courseName,courseId,courseTime,courseProfessor,classroom,semester,year,credit;
			String aCourseName = sc.next();
			String aCoursePriority = sc.next();
			String aCourseId = sc.next();
			String aCourseTime = sc.next();
			String aCourseProfessor = sc.next();
			String aClassroom = sc.next();
			int aYear =sc.nextInt();
			int aSemester =sc.nextInt();
			int aCredit =sc.nextInt();
			System.out.println("finish input");
			Course cs1 = new Course(aCourseName,aCoursePriority,aCourseId,aCourseTime,aCourseProfessor,aClassroom,aYear,aSemester,aCredit);
			courseLs.restoreCourse(cs1);
		}
	}
	
}
