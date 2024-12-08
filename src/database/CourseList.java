package database;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
	
	private static List<Course> CourseList = new ArrayList<Course>();
	private final Course cs1 = new Course("Java程式設計","必修","3586","(四)13:10 ~ 16:10","李昆翰","G521",111,1,3);
	private final Course cs2 = new Course("動態網頁設計","選修","1234","(五)13:10 ~ 16:10","賴阿福","G512",111,1,3);
	private final Course cs3 = new Course("班會","必修","0345","(二)13:10 ~ 16:10","楊政穎","G314",111,1,0);//預設的課程
	

    public CourseList() {
    	restoreCourse(cs1);//預設的課程
    	restoreCourse(cs2);
    	restoreCourse(cs3);
    }
    
	public void restoreCourse(Course aCourse) {
		CourseList.add(aCourse);
	}
	
	public static List<Course> getCourseList() {
		return CourseList;
	}
	
	public void show() {
		
		for(int count = 0;count < CourseList.size();count++) {
			System.out.println("No"+count+" "+ CourseList.get(count));
		}
	}
}
