package studentProject;

public class StudentBusinessLogic {

	Student[] students=new Student[5];
	int counterstudent=0;
	
	StudentBusinessLogic()
	{
		
	}
	public Boolean addStudent(int rollNo,String name,String[] courses)
	{ 
		boolean StudentExists=false;
		//System.out.println("student length"+students.length);
		if(counterstudent!=0)
		{
			System.out.println("Inside duplicate student check "+counterstudent);
		for(int i=0;i<counterstudent;i++)
		{
			//students[counterstudent]=new Student();
			if(students[i].getRollNo()==rollNo)
			{
				StudentExists = true;
				
			}
		}
		
		}
		if(!StudentExists)
		{
		students[counterstudent]=new Student();
		students[counterstudent].setRollNo(rollNo);
		students[counterstudent].setName(name);
		students[counterstudent].setCourseNames(courses);
		counterstudent++;
		return true;
		}
		else
		{
			return false;
		}
	}
	
	public void showAllStudents()
	{
		System.out.println("Students List");
		for (int i=0;i<counterstudent;i++)
		{
			System.out.println(students[i].toString());
		}
				
	}
	
	public boolean showSudentByRollNo(int rollnumber)
	{
		for (int i=0;i<counterstudent;i++)
		{
			if(students[i].getRollNo()==rollnumber)
			{
				System.out.println(students[i].toString());
				return true;
			}
		}
		return false;
				
	}
	
	public void showSudentsByCourse(String course)
	{
		for (int i=0;i<counterstudent;i++)
		{
			String[] enrolledCourses= new String[students[i].getCourseNames().length];
			enrolledCourses=students[i].getCourseNames();
			
			for(int j=0;j<enrolledCourses.length;j++)
			{
			if(enrolledCourses[j].contentEquals(course))
			{
				System.out.println(students[i].toString());
				
			}
			}
		}
				
	}
}
