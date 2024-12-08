package register;

import java.util.Scanner;

import database.Account;
import database.Course;
import database.Professor;

public class Srs {

	public static void main(String[] args) {

		ButtonSignup signupButton = new ButtonSignup();
		ButtonLogin loginButton = new ButtonLogin();
		Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 6) {
        	FunctionList function = new FunctionList();
    		System.out.println("-----------------------------------------------------------------------");
    		System.out.println("Welcome to Student Registration System!");
    		System.out.println("need signup plz enter 1 \nhave already had account plz enter another numbers");
        	choice = sc.nextInt();
        	
        	while(choice == 1) {
        		System.out.println("-----signup state-----");
        		signupButton.inputAccount();
        		System.out.println("Student plz enter Name,Birth,SchoolID,Department,ClassName");
        		System.out.println("Professor plz enter Name,Birth,SchoolID,Department,ClassName");
        		function.inputInfo("李昆翰","jkli","資科","美國印第安納大學 教育系統科技 博士"); //可自行輸入 假設已有基本資料
        		choice = 0;
        	}
        	
        	while(loginButton.exist == false) {
        		System.out.println("-----login state-----");
        		loginButton.login();
            	System.out.println(loginButton);
        	}
 
    		System.out.println("plz enter your identity(P/G/U/S)");//登入後確認權限
    		System.out.println("Professor / Graduate student / University student / System manerger");
    		String userIdentity = sc.next();
    		function.comfirmPermission(userIdentity);
    		
        	while(choice != 1 && choice != 6) {
        		System.out.println("--------------------------------------------");
        		System.out.println("choose the function which you want");
        		System.out.println("(1) register new account or login another account");
        		System.out.println("(2) show personal information ");
        		System.out.println("(3) search Course list");
        		System.out.println("(4) choose next Semester's Courses");
        		System.out.println("(5) add Courses to list");
        		System.out.println("(6) shotdown this system");
        		choice = sc.nextInt();
        		switch(choice) {
        		case 1:
        			loginButton.exist = false;
        			break;
        		case 2:
        			function.showinfo();
        			break;
        		case 3:
        			function.showCourseList();
        			break;
        		case 4:
        			function.chooseCourse();
        			break;
        		case 5:
        			function.appendCourses();
        			break;
        		}
        	}
        }
		sc.close();
	}
}
