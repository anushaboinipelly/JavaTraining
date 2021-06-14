package studentProject;

import java.util.Scanner;

public class StudentMain {

	private static Scanner sc=new Scanner(System.in);
	static StudentBusinessLogic stud = new StudentBusinessLogic();
	
	public static void main(String[] args) {
		displayOptions();

	}
	
	private static void displayOptions()
	{
		while(true)
		{
		System.out.println("please enter your choice :");
		
		System.out.println("1. add student" + "\n" + "2. Show All students" + "\n" + "3. Show student by rollno" + "\n" + "4. Show student by courseName" + "\n" + "5. exit");
		
		switch(sc.nextInt())
		{
		case 1:getStudentInfoAndAdd();
		       break;
		       
		 case 2:stud.showAllStudents();
		        break;
		        
		 case 3:getStudentInfobyRollNo();
		 		break;
		 		
		 case 4:getStudentsByCourse();
	 		break;
		 		
		 case 5: System.exit(0);
		 
		 default:System.out.println("Invalid Choice.please enter between 1 to 5");
			   }
		}
	}



	private static void getStudentInfoAndAdd()
	{
		System.out.println("Enter roll number");
		int rollnumber = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter the number of courses studnet wants to enroll");
		int noOfCourses = sc.nextInt();
		String[] courses = new String[noOfCourses];
		
		for (int i=0;i<noOfCourses;i++)
		{
			courses[i]=sc.next();
		}
		
		
		if(stud.addStudent(rollnumber,name,courses)==false)
			{
			System.out.println("Entered roll number already exists. please try again.");
			}
		else
			{
			System.out.println("Student added Successfully.");
			}
	}

	private static void getStudentInfobyRollNo()
	{
		System.out.println("Enter roll number");
		int rollnumber = sc.nextInt();
		if(stud.showSudentByRollNo(rollnumber)==false)
		{
			System.out.println("Entered roll number doesnot exist exists. please try again.");

		}
		
		
	}
	private static void getStudentsByCourse() 
	{		
		System.out.println("Enter course :");
		String course = sc.next();
		stud.showSudentsByCourse(course);
	}	
	

	
}
